
#include "instruction.h"

void Machine::setBytes(uint32_t word, size_t num_bytes)
{
  for (int i = 0; i < num_bytes; i++)
  {
    uint8_t byte = word >> (8 * i);
    bytes.push_back(byte);
  }
}

Instruction::Instruction(string mnem, ParserRuleContext* c)
{
  // string* idx = std::find(mnemonics, mnemonics + OP_COUNT, mnem);
  // if (idx == mnemonics + OP_COUNT) throw mnem;

  // index = (Index) (idx - mnemonics);
  // ctx = c;
  condition = nullptr;
  mnemonic = mnem;
  ctx = c;
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
    try { 
      (this->*methods[mnemonic])(err, false); 
    } catch (int e) { 
      err->AddNodeErr("malformed arguments", ctx); 
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
    machine.setBytes(code, WORD_BYTES);
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