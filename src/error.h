
#ifndef ERROR_H
#define ERROR_H

#include <string>
#include <vector>

#include "antlr4-runtime.h"

using std::string;

class Error {

  public:
    Error(string file) { filepath = file; }
    ~Error() {}

    struct item {
      string message;
      int line;
      string file;
      int code;
      int colstart;
      int colend;
    };

    void AddError(
      string message, int line, 
      string file, int code = 1, 
      int colstart = -1, int colend = -1, 
      bool fatal = false
    );
    void AddWarning(
      string message, int line, 
      string file, int code = 2, 
      int colstart = -1, int colend = -1
    );

    void AddRuleErr(string message, antlr4::ParserRuleContext* ctx);
    void AddRuleWarn(string message, antlr4::ParserRuleContext* ctx);

    void Report();

  private:

    void PrintErrors();
    void PrintWarnings();

    static constexpr int max_errors = 20;
    std::vector<item> errors;
    std::vector<item> warnings;
    string filepath;

};

#endif // ERROR_H