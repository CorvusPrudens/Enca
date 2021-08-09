
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

uint32_t AssembleNop(Error* err)
{

  return 0;
}
uint32_t AssembleLdr(Error* err)
{

  return 0;
}
uint32_t AssembleStr(Error* err)
{

  return 0;
}
uint32_t AssembleMov(Error* err)
{

  return 0;
}

uint32_t AssembleCmp(Error* err)
{

  return 0;
}
uint32_t AssembleCps(Error* err)
{

  return 0;
}
uint32_t AssembleAdd(Error* err)
{

  return 0;
}
uint32_t AssembleSub(Error* err)
{

  return 0;
}

uint32_t AssembleMul(Error* err)
{

  return 0;
}
uint32_t AssembleDiv(Error* err)
{

  return 0;
}
uint32_t AssembleMod(Error* err)
{

  return 0;
}
uint32_t AssembleAnd(Error* err)
{

  return 0;
}

uint32_t AssembleOr(Error* err)
{

  return 0;
}
uint32_t AssembleXor(Error* err)
{

  return 0;
}
uint32_t AssembleNot(Error* err)
{

  return 0;
}
uint32_t AssembleLsl(Error* err)
{

  return 0;
}

uint32_t AssembleLsr(Error* err)
{

  return 0;
}
uint32_t AssembleJmp(Error* err)
{

  return 0;
}
uint32_t AssemblePush(Error* err)
{

  return 0;
}
uint32_t AssemblePop(Error* err)
{

  return 0;
}