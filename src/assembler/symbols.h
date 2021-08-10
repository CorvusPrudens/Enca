
#ifndef ENCA_SYMBOLS_H
#define ENCA_SYMBOLS_H

#include <string>
#include <unordered_map>

using namespace std;

class Symbol {

  public:
    Symbol() {}
    Symbol(string n);
    Symbol(string n, size_t idx);
    ~Symbol() {}

    string name;
    uint16_t address;
    size_t index;
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