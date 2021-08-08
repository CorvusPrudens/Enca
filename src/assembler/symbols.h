
#ifndef ENCA_SYMBOLS_H
#define ENCA_SYMBOLS_H

#include <string>
#include <unordered_map>

using namespace std;

class Symbol {

  public:
    Symbol(bool label = false);
    ~Symbol() {}

    string name;
    uint16_t address;
    bool isLabel;
};

// No scopes to worry about for this one
class SymbolTable {

  public:
    SymbolTable() {}
    ~SymbolTable() {}

    void AddSymbol(Symbol& s);
    Symbol& GetSymbol(string name);

    unordered_map<string, Symbol> symbols;
};

#endif