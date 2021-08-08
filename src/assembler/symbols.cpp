
#include "symbols.h"

Symbol::Symbol(bool label)
{
  isLabel = label;
  address = 0;
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