
#ifndef ENCA_ASSEMBLER_H
#define ENCA_ASSEMBLER_H

#include <iostream>
#include <vector>
#include <memory>
#include <string>
#include "antlr4-runtime.h"
#include "EncaLexer.h"
#include "EncaParser.h"
#include "EncaBaseVisitor.h"
#include "EncaBaseListener.h"

#include "utils.h"
#include "error.h"

using namespace antlr4;
using antlrcpp::Any;
using std::unique_ptr;
using std::string;

class Assembler : EncaBaseVisitor {

  public:
    Assembler(string file_, Error* err_);
    ~Assembler() {}

  Any visitStatInstr(EncaParser::StatInstrContext* ctx) override;

};

#endif