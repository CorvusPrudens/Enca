
#include "symbols.h"

Symbol::Symbol(string n)
{
  name = n;
  isLabel = false;
  address = -1;
  index = 0;
}

Symbol::Symbol(string n, size_t idx)
{
  name = n;
  isLabel = true;
  address = 0;
  index = idx;
}

// TODO -- need to add align checks, specified addresses, and such!!
void Section::AddSymbol(Symbol& sym, Error* err, ParseTree* node)
{
  SymbolRange sr(&sym);
  if (symbols.size() == 0) 
  {
    sr.start = start;
    sr.end = sr.start + sym.data.size();

    if (sr.end > end) {
      err->AddNodeErr("data \"" + sr.symbol->name + "\" too large for section \"" + name + "\"", node);
    } else {
      symbols.push_back(sr);
    }
  }
  else
  {
    
    bool found = false;
    for (auto& sr : symbols) {
      size_t temp_start = sr.end;
      size_t temp_end = temp_start + sym.data.size();
      if (ValidRange(temp_start, temp_end, sym, err, node))
      {
        found = true;
        SymbolRange fsr(&sym, temp_start, temp_end);
        symbols.push_back(fsr);
        break;
      }
    }
    if (!found) {
      string errmess = "section \"" + name + "\" unable to hold requested data";
      err->AddNodeErr(errmess, node);
    }
  }
}

bool Section::ValidRange(size_t s, size_t e, Symbol& sym, Error* err, ParseTree* ctx)
{
  if (s < start || e > end) 
  {
    string errmess = "requested address range (" + to_string(s) + ".." + to_string(e) +
                     ") not within available range (" + to_string(start) + ".." + to_string(end) +
                     "for section \"" + name + "\"";
    err->AddNodeErr(errmess, ctx);
    return false;
  }
  for (auto& sr : symbols) {
    if ((s > sr.start && s < sr.end) || (e > sr.start && e < sr.end))
      return false;
  }
  return true;
}

void SymbolTable::AddSymbol(Symbol& s, Error* err, ParseTree* node)
{
  if (symbols.count(s.name) == 0) 
  {

    string section = "ram";
    for (auto& attr : s.attributes)
    {
      if (sections.count(attr.first) > 0) {
        section = attr.first;
      }
    }

    symbols[s.name] = s;
    ordered.push_back(&symbols[s.name]);

    sections[section].AddSymbol(symbols[s.name], err, node);

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