#ifndef ENCA_INSTRUCTION_H
#define ENCA_INSTRUCTION_H

#include <cstdint>
#include <string>
#include <vector>

#include "antlr4-runtime.h"
#include "operand.h"
#include "symbols.h"
#include "error.h"

using namespace std;
using namespace antlr4;

class Instruction {
  public:

    Instruction(string mnem, ParserRuleContext* c);
    ~Instruction() {}

    inline static string mnemonics[] = {
      "nop", "ldr", "str", "mov", "cmp", 
      "cps", "add", "sub", "mul", "div", 
      "mod", "and", "or",  "xor", "not", 
      "lsl", "lsr", "jmp", "push", "pop",
    };

    enum Index {
      NOP=0, LDR, STR, MOV, CMP,
      CPS, ADD, SUB, MUL, DIV,
      MOD, AND, OR, XOR, NOT,
      LSL, LSR, JMP, PUSH, POP,
      OP_COUNT,
    };

    void setMnemonic(string& mnem);
    void addOperand(Operand& op);
    void setCondition(Condition cond);
    uint16_t Assemble(Error* err) { return (this->*methods[index])(err); }

    uint16_t AssembleNop(Error* err);
    uint16_t AssembleLdr(Error* err);
    uint16_t AssembleStr(Error* err);
    uint16_t AssembleMov(Error* err);

    uint16_t AssembleCmp(Error* err);
    uint16_t AssembleCps(Error* err);
    uint16_t AssembleAdd(Error* err);
    uint16_t AssembleSub(Error* err);

    uint16_t AssembleMul(Error* err);
    uint16_t AssembleDiv(Error* err);
    uint16_t AssembleMod(Error* err);
    uint16_t AssembleAnd(Error* err);

    uint16_t AssembleOr(Error* err);
    uint16_t AssembleXor(Error* err);
    uint16_t AssembleNot(Error* err);
    uint16_t AssembleLsl(Error* err);

    uint16_t AssembleLsr(Error* err);
    uint16_t AssembleJmp(Error* err);
    uint16_t AssemblePush(Error* err);
    uint16_t AssemblePop(Error* err);

    typedef uint16_t (Instruction::*AssembleInstr)(Error*);

    AssembleInstr methods[OP_COUNT] = {
      &Instruction::AssembleNop,
      &Instruction::AssembleLdr,
      &Instruction::AssembleStr,
      &Instruction::AssembleMov,
      &Instruction::AssembleCmp,
      &Instruction::AssembleCps,
      &Instruction::AssembleAdd,
      &Instruction::AssembleSub,
      &Instruction::AssembleMul,
      &Instruction::AssembleDiv,
      &Instruction::AssembleMod,
      &Instruction::AssembleAnd,
      &Instruction::AssembleOr,
      &Instruction::AssembleXor,
      &Instruction::AssembleNot,
      &Instruction::AssembleLsl,
      &Instruction::AssembleLsr,
      &Instruction::AssembleJmp,
      &Instruction::AssemblePush,
      &Instruction::AssemblePop,
    };

    Index index;
    vector<Operand> operands;
    Condition condition;
    bool conditional;
    ParserRuleContext* ctx;
};


#endif