
#include "assembler.h"
#include "number.h"

Assembler::Assembler(string filename, Error* err_)
: input(filename)
, stream(input)
, lexer(&stream)
, tokens(&lexer)
, parser(&tokens)
{
  err = err_;

  tree::ParseTree* parse_tree = parser.parse();
  visit(parse_tree);
}

void Assembler::Complete()
{
  err->Report();
}

Any Assembler::visitStatLab(EncaParser::StatLabContext* ctx)
{
  Symbol s(ctx->label()->NAME()->getText(), instructions.size());
  symbols.AddSymbol(s);
  return nullptr;
}

// TODO -- just compress this into one function!
Any Assembler::visitInstr(EncaParser::InstrContext* ctx)
{
  Instruction inst(ctx->mnemonic()->getText(), ctx);
  instructions.push_back(inst);
  return nullptr;
}
Any Assembler::visitInstrOper(EncaParser::InstrOperContext* ctx)
{
  Instruction inst(ctx->mnemonic()->getText(), ctx);
  visitChildren(ctx);
  for (auto ptr : ctx->operands()->operand()) {
    Operand* op = operands.get(ptr);
    inst.addOperand(op);
  }
  instructions.push_back(inst);
  return nullptr;
}
Any Assembler::visitInstrCond(EncaParser::InstrCondContext* ctx)
{
  Instruction inst(ctx->mnemonic()->getText(), ctx);
  visitChildren(ctx);
  inst.setCondition(operands.get(ctx->conditional()));
  instructions.push_back(inst);
  return nullptr;
}
Any Assembler::visitInstrOperCond(EncaParser::InstrOperCondContext* ctx)
{
  Instruction inst(ctx->mnemonic()->getText(), ctx);
  visitChildren(ctx);
  for (auto ptr : ctx->operands()->operand()) {
    Operand* op = operands.get(ptr);
    inst.addOperand(op);
  }
  inst.setCondition(operands.get(ctx->conditional()));
  instructions.push_back(inst);
  return nullptr;
}

Any Assembler::visitOpReg(EncaParser::OpRegContext* ctx)
{
  unique_ptr<Operand> reg = make_unique<RegisterOp>(ctx->reg()->getText());
  operands.put(ctx, move(reg));
  return nullptr;
}

Any Assembler::visitOpNum(EncaParser::OpNumContext* ctx)
{
  unique_ptr<Operand> reg = make_unique<NumberOp>(numbers.get(ctx->number()));
  operands.put(ctx, move(reg));
  return nullptr;
}
Any Assembler::visitOpCond(EncaParser::OpCondContext* ctx)
{
  unique_ptr<Operand> reg = make_unique<ConditionOp>(ctx->condition()->getText());
  operands.put(ctx, move(reg));
  return nullptr;
}
Any Assembler::visitOpVar(EncaParser::OpVarContext* ctx)
{
  unique_ptr<Operand> reg = make_unique<VariableOp>(ctx->variable()->getText(), &symbols);
  operands.put(ctx, move(reg));
  return nullptr;
}
Any Assembler::visitOpRel(EncaParser::OpRelContext* ctx)
{
  visitChildren(ctx);
  unique_ptr<Operand> op = operands.getPtr(ctx->operand());
  operands.put(ctx, move(op));
  return nullptr;
}

Any Assembler::visitNumDec(EncaParser::NumDecContext *ctx) {
  uint16_t value = stoi(ctx->getText());
  Number num;
  num.setValue(value, Number::Type::INT);
  numbers.put(ctx, num);
  return nullptr;
}

Any Assembler::visitNumFlt(EncaParser::NumFltContext *ctx) {
  float value = stof(ctx->getText());
  Number num;
  num.setValue(value, Number::Type::FLT);
  numbers.put(ctx, num);
  return nullptr;
}

Any Assembler::visitNumSci(EncaParser::NumSciContext *ctx) {
  float value = stof(ctx->getText());
  Number num;
  num.setValue(value, Number::Type::FLT);
  numbers.put(ctx, num);
  return nullptr;
}

Any Assembler::visitNumHex(EncaParser::NumHexContext *ctx) {
  uint16_t value = 0;
  Number num;
  try {
    value = stoi(ctx->getText(), nullptr, 16);
  } catch (std::out_of_range e) {
    string mess = "literal out of range of 16-bit word";
    err->AddRuleErr(mess, ctx);
  }
  num.setValue(value, Number::Type::INT);
  numbers.put(ctx, num);
  return nullptr;
}

Any Assembler::visitNumBin(EncaParser::NumBinContext *ctx) {
  uint16_t value = stoi(ctx->getText(), nullptr, 2);
  Number num;
  num.setValue(value, Number::Type::INT);
  numbers.put(ctx, num);
  return nullptr;
}

Any Assembler::visitNumOct(EncaParser::NumOctContext *ctx) {
  uint16_t value = stoi(ctx->getText(), nullptr, 8);
  Number num;
  num.setValue(value, Number::Type::INT);
  numbers.put(ctx, num);
  return nullptr;
}
