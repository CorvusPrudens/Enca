#ifndef ENCA_INSTRUCTION_H
#define ENCA_INSTRUCTION_H

#include <cstdint>
#include <string>
#include <map>
#include <unordered_map>
#include <vector>

#include "antlr4-runtime.h"
#include "operand.h"
#include "symbols.h"
#include "error.h"

using namespace std;
using namespace antlr4;

struct Machine {
  uint32_t size = 0;
  vector<uint8_t> bytes;
  void setBytes(uint32_t word, size_t num_bytes);
};

struct Mnemonic {
  Mnemonic(string n, uint32_t op) {
    name = n;
    opcode = op;
  }
  Mnemonic() {}
  ~Mnemonic() {}
  string name;
  uint32_t opcode;
};

#define M(name, opcode) \
{name, Mnemonic(name, opcode)}

class Instruction {
  public:

    Instruction(string mnem, ParserRuleContext* c);
    ~Instruction() {}

    inline static unordered_map<string, Mnemonic> mnemonics = {
      M("nop", 0x00), M("ldr", 0x01), M("str", 0x02), M("mov", 0x05),
      M("cmp", 0x03), M("cps", 0x04), M("add", 0x05), M("sub", 0x06),
      M("mul", 0x07), M("div", 0x08), M("mod", 0x09), M("and", 0x0A),
      M("or", 0x0B),  M("xor", 0x0C), M("not", 0x0D), M("lsl", 0x0E),
      M("lsr", 0x0F), M("jmp", 0x10), M("push", 0x11),M("pop", 0x12),
    };

    void setMnemonic(string& mnem);
    void addOperand(Operand* op);
    void setCondition(Operand* cond) { condition = cond; }
    uint32_t GetSize(Error* err);
    Machine& Assemble(Error* err);

    void AssembleNop(Error* err, bool query);
    void AssembleLdr(Error* err, bool query);
    void AssembleStr(Error* err, bool query);
    void AssembleMov(Error* err, bool query);

    void AssembleCmp(Error* err, bool query);
    void AssembleCps(Error* err, bool query);
    void AssembleAdd(Error* err, bool query);
    void AssembleSub(Error* err, bool query);

    void AssembleMul(Error* err, bool query);
    void AssembleDiv(Error* err, bool query);
    void AssembleMod(Error* err, bool query);
    void AssembleAnd(Error* err, bool query);

    void AssembleOr(Error* err, bool query);
    void AssembleXor(Error* err, bool query);
    void AssembleNot(Error* err, bool query);
    void AssembleLsl(Error* err, bool query);

    void AssembleLsr(Error* err, bool query);
    void AssembleJmp(Error* err, bool query);
    void AssemblePush(Error* err, bool query);
    void AssemblePop(Error* err, bool query);

    typedef void (Instruction::*AssembleInstr)(Error*, bool);

    inline static unordered_map<string, AssembleInstr> methods = {
      {"nop", &Instruction::AssembleNop},
      {"ldr", &Instruction::AssembleLdr},
      {"str", &Instruction::AssembleStr},
      {"mov", &Instruction::AssembleMov},
      {"cmp", &Instruction::AssembleCmp},
      {"cps", &Instruction::AssembleCps},
      {"add", &Instruction::AssembleAdd},
      {"sub", &Instruction::AssembleSub},
      {"mul", &Instruction::AssembleMul},
      {"div", &Instruction::AssembleDiv},
      {"mod", &Instruction::AssembleMod},
      {"and", &Instruction::AssembleAnd},
      {"or",  &Instruction::AssembleOr},
      {"xor", &Instruction::AssembleXor},
      {"not", &Instruction::AssembleNot},
      {"lsl", &Instruction::AssembleLsl},
      {"lsr", &Instruction::AssembleLsr},
      {"jmp", &Instruction::AssembleJmp},
      {"push",&Instruction::AssemblePush},
      {"pop", &Instruction::AssemblePop},
    };

    string mnemonic;
    vector<Operand*> operands;
    Operand* condition;
    ParserRuleContext* ctx;
    Machine machine;
};


#endif