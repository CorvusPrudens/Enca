
#include "instruction.h"

Instruction::Instruction(string mnem, ParserRuleContext* c)
{
  // string* idx = std::find(mnemonics, mnemonics + OP_COUNT, mnem);
  // if (idx == mnemonics + OP_COUNT) throw mnem;

  // index = (Index) (idx - mnemonics);
  // ctx = c;
  mnemonic = mnem;
  ctx = c;
}

void Instruction::addOperand(Operand* op) {
  operands.push_back(op);
}

uint32_t Instruction::Assemble(Error* err) 
{ 
  if (methods.count(mnemonic) > 0) {
    try {
      return (this->*methods[mnemonic])(err); 
    } catch (int e) {
      // TODO -- expand on this
      err->AddRuleErr("malformed arguments", ctx);
    }
  } else {
    err->AddRuleErr("unexpected mnemonic \"" + mnemonic + "\"", ctx);
  }
  return 0;
}

uint32_t Instruction::AssembleNop(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleLdr(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleStr(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleMov(Error* err)
{

  return 0;
}

uint32_t Instruction::AssembleCmp(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleCps(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleAdd(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleSub(Error* err)
{

  return 0;
}

uint32_t Instruction::AssembleMul(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleDiv(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleMod(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleAnd(Error* err)
{

  return 0;
}

uint32_t Instruction::AssembleOr(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleXor(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleNot(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleLsl(Error* err)
{

  return 0;
}

uint32_t Instruction::AssembleLsr(Error* err)
{

  return 0;
}
uint32_t Instruction::AssembleJmp(Error* err)
{

  return 0;
}
uint32_t Instruction::AssemblePush(Error* err)
{

  return 0;
}
uint32_t Instruction::AssemblePop(Error* err)
{

  return 0;
}