#include <algorithm>
#include "operand.h"

void Operand::setRelative(int16_t offset)
{
  relativeOffset = offset;
  isRelative = true;
}

Register::Register(string name)
{
  string* idx = std::find(Names, Names + REG_COUNT, name);
  if (idx == Names + REG_COUNT) throw name;

  index = (Index) (idx - Names);
}

uint16_t Number::getValue()
{
  uint16_t* ptr = (uint16_t*) value;
  return *ptr;
}

Condition::Condition(string c)
{
  string* idx = std::find(Names, Names + COND_COUNT, c);
  if (idx == Names + COND_COUNT) throw c;

  condition = (Cond) (idx - Names);
}

uint16_t Variable::getValue()
{
  return table->GetSymbol(name).address;
}