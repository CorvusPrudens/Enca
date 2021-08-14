
#include "instruction.h"
#include "error.h"

Mnemonic::Mnemonic(string n, uint32_t op, vector<vector<Operand::Class>> list)  {
  name = n;
  opcode = op;

  for (auto& item : list) {
    validOperands.push_back(item);
  }

}

void Machine::setBytes(uint32_t word, size_t num_bytes)
{
  for (int i = 0; i < num_bytes; i++)
  {
    uint8_t byte = word >> (8 * i);
    bytes.push_back(byte);
  }
}

Instruction::Instruction(string mnem, ParseTree* c)
{
  // string* idx = std::find(mnemonics, mnemonics + OP_COUNT, mnem);
  // if (idx == mnemonics + OP_COUNT) throw mnem;

  // index = (Index) (idx - mnemonics);
  // ctx = c;
  condition = nullptr;
  mnemonic = mnem;
  ctx = c;
}

bool op_in(Operand::Class c, vector<Operand::Class> classes) {
  for (auto& cls : classes)
    if (c == cls) return true;
  return false;
}

bool Instruction::verifyOperands() 
{
  auto& valid = mnemonics[mnemonic].validOperands;
  if (operands.size() > valid.size())
    return false;
  
  for (int i = 0; i < valid.size(); i++) 
  {
    if (i >= operands.size()) 
    {
      if (!op_in(Operand::NONE, valid[i]))
        return false;
    }
    else
    {
      if (!op_in(operands[i]->getClass(), valid[i]))
        return false;
    }
  }

  return true;
}

void Instruction::addOperand(Operand* op) {
  operands.push_back(op);
}

uint32_t Instruction::GetSize(Error* err)
{
  if (methods.count(mnemonic) > 0) { 
    (this->*methods[mnemonic])(err, true);
    return machine.size;
  } else { 
    return 0;
  } 
}

Machine& Instruction::Assemble(Error* err) 
{ 
  if (methods.count(mnemonic) > 0) { 
    if (!verifyOperands())
    {
      string errmess = "invalid operand";
      err->AddNodeErr(errmess, ctx);
    }
    else
    {
      try { 
        (this->*methods[mnemonic])(err, false); 
      } catch (int e) { 
        err->AddNodeErr("malformed arguments", ctx); 
      } 
    }
  } else { 
    err->AddNodeErr("unexpected mnemonic \"" + mnemonic + "\"", ctx); 
  } 
  return machine;
}

#define WORD_BYTES 2

void Instruction::AssembleNop(Error* err, bool query)
{
  if (query)
    machine.size = WORD_BYTES;
  else
    machine.bytes = {0, 0};
}
void Instruction::AssembleLdr(Error* err, bool query)
{
  if (query) {

    machine.size = WORD_BYTES * 2;
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES * 2);
  }
}
void Instruction::AssembleStr(Error* err, bool query)
{
  if (query) {

    machine.size = WORD_BYTES * 2;
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleMov(Error* err, bool query)
{
  if (query) {

    machine.size = WORD_BYTES;
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}

#define TYPICAL_SIZE \
switch (operands[1]->getClass()) \
{ \
  case Operand::Class::REGISTER: \
    if (operands[1]->isRelative) \
      machine.size = WORD_BYTES * 2; \
    else \
      machine.size = WORD_BYTES; \
    break; \
  default: \
    machine.size = WORD_BYTES * 2; \
    break; \
}

void Instruction::AssembleCmp(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleCps(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleAdd(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleSub(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}

void Instruction::AssembleMul(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleDiv(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleMod(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleAnd(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}

void Instruction::AssembleOr(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleXor(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleNot(Error* err, bool query)
{
  if (query) {
    machine.size = WORD_BYTES;
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleLsl(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}

void Instruction::AssembleLsr(Error* err, bool query)
{
  if (query) {
    TYPICAL_SIZE
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssembleJmp(Error* err, bool query)
{
  if (query) {
    machine.size = WORD_BYTES * 2;
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssemblePush(Error* err, bool query)
{
  if (query) {
    machine.size = WORD_BYTES;
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}
void Instruction::AssemblePop(Error* err, bool query)
{
  if (query) {
    machine.size = WORD_BYTES;
  } else {
    uint32_t code = 0;
    code |= mnemonics[mnemonic].opcode;
    machine.setBytes(code, WORD_BYTES);
  }
}