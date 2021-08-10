
#include "symbols.h"

Symbol::Symbol(string n)
{
  name = n;
  isLabel = false;
  address = 0;
  index = 0;
}

Symbol::Symbol(string n, size_t idx)
{
  name = n;
  isLabel = true;
  address = 0;
  index = idx;
}

void SymbolTable::AddSymbol(Symbol& s)
{
  if (symbols.count(s.name) == 0) 
  {
    symbols[s.name] = s;
  } 
  else 
  {
    throw 1;
  }
}

Symbol& SymbolTable::GetSymbol(string name)
{
  if (symbols.count(name) == 0) 
  {
    throw 1;
  } 
  else 
  {
    return symbols[name];
  }
}