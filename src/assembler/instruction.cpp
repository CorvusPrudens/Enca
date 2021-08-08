
#include "instruction.h"

uint16_t Instruction::Assemble(Error* err) 
{ 
  if (index < OP_COUNT) {
    try {
      return (this->*methods[index])(err); 
    } catch (int e) {
      // TODO -- expand on this
      err->AddRuleErr("malformed arguments", ctx);
    }
  } else {
    err->AddRuleErr("unexpected mnemonic", ctx);
  }
  return 0;
}

uint16_t AssembleNop(Error* err)
{

  return 0;
}
uint16_t AssembleLdr(Error* err)
{

  return 0;
}
uint16_t AssembleStr(Error* err)
{

  return 0;
}
uint16_t AssembleMov(Error* err)
{

  return 0;
}

uint16_t AssembleCmp(Error* err)
{

  return 0;
}
uint16_t AssembleCps(Error* err)
{

  return 0;
}
uint16_t AssembleAdd(Error* err)
{

  return 0;
}
uint16_t AssembleSub(Error* err)
{

  return 0;
}

uint16_t AssembleMul(Error* err)
{

  return 0;
}
uint16_t AssembleDiv(Error* err)
{

  return 0;
}
uint16_t AssembleMod(Error* err)
{

  return 0;
}
uint16_t AssembleAnd(Error* err)
{

  return 0;
}

uint16_t AssembleOr(Error* err)
{

  return 0;
}
uint16_t AssembleXor(Error* err)
{

  return 0;
}
uint16_t AssembleNot(Error* err)
{

  return 0;
}
uint16_t AssembleLsl(Error* err)
{

  return 0;
}

uint16_t AssembleLsr(Error* err)
{

  return 0;
}
uint16_t AssembleJmp(Error* err)
{

  return 0;
}
uint16_t AssemblePush(Error* err)
{

  return 0;
}
uint16_t AssemblePop(Error* err)
{

  return 0;
}