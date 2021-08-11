
#ifndef ERROR_H
#define ERROR_H

#include <string>
#include <vector>

#include "antlr4-runtime.h"

using std::string;
using antlr4::tree::ParseTree;

class Error {

  public:
    Error(string file, antlr4::CommonTokenStream* tok) { filepath = file; tokens = tok; }
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

    void AddNodeErr(string message, ParseTree* node);
    void AddNodeWarn(string message, ParseTree* node);

    void Report();

  private:

    void PrintErrors();
    void PrintWarnings();

    static constexpr int max_errors = 20;
    std::vector<item> errors;
    std::vector<item> warnings;
    string filepath;
    antlr4::CommonTokenStream* tokens;

};

#endif // ERROR_H