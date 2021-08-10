
#ifndef ENCA_ASSEMBLER_H
#define ENCA_ASSEMBLER_H

#include <fstream>
#include <iostream>
#include <vector>
#include <memory>
#include <unordered_map>
#include <string>

#include "antlr4-runtime.h"
#include "EncaLexer.h"
#include "EncaParser.h"
#include "EncaBaseVisitor.h"
#include "EncaBaseListener.h"

#include "utils.h"
#include "error.h"
#include "operand.h"
#include "number.h"
#include "instruction.h"
#include "symbols.h"

using namespace antlr4;
using antlrcpp::Any;
using namespace std;

template <typename T>
class PtrProperty {

  public:
    void put(tree::ParseTree* ctx, unique_ptr<T> ptr) {
      properties[ctx] = move(ptr);
    }
    T* get(tree::ParseTree* ctx) {
      return properties[ctx].get();
    }
    unique_ptr<T> getPtr(tree::ParseTree* ctx) {
      return move(properties[ctx]);
    }

  unordered_map<tree::ParseTree*, unique_ptr<T>> properties;
};

class Assembler : public EncaBaseVisitor {

  public:
    Assembler(string file_, Error* err_);
    ~Assembler() {}

    Error* err;
    SymbolTable symbols;
    PtrProperty<Operand> operands;
    // unordered_map<tree::ParseTree*, unique_ptr<Operand>> operands;
    // tree::ParseTreeProperty<Operand> operands;
    tree::ParseTreeProperty<Number> numbers;
    vector<Instruction> instructions;


    fstream input;
    ANTLRInputStream stream;
    EncaLexer lexer;
    EncaParser parser;
    CommonTokenStream tokens;

    void Complete();

    Any visitInstr(EncaParser::InstrContext* ctx) override;
    Any visitInstrOper(EncaParser::InstrOperContext* ctx) override;
    Any visitInstrCond(EncaParser::InstrCondContext* ctx) override;
    Any visitInstrOperCond(EncaParser::InstrOperCondContext* ctx) override;

    Any visitOpReg(EncaParser::OpRegContext* ctx) override;
    Any visitOpNum(EncaParser::OpNumContext* ctx) override;
    Any visitOpCond(EncaParser::OpCondContext* ctx) override;
    Any visitOpVar(EncaParser::OpVarContext* ctx) override;
    Any visitOpRel(EncaParser::OpRelContext* ctx) override;

    Any visitNumDec(EncaParser::NumDecContext *ctx) override;
    Any visitNumFlt(EncaParser::NumFltContext *ctx) override;
    Any visitNumSci(EncaParser::NumSciContext *ctx) override;
    Any visitNumHex(EncaParser::NumHexContext *ctx) override;
    Any visitNumBin(EncaParser::NumBinContext *ctx) override;
    Any visitNumOct(EncaParser::NumOctContext *ctx) override;

    Any visitStatLab(EncaParser::StatLabContext* ctx) override;

};

#endif