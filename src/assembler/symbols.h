
#ifndef ENCA_SYMBOLS_H
#define ENCA_SYMBOLS_H

#include <string>
#include <vector>
#include <list>
#include <unordered_map>
#include "error.h"
#include "antlr4-runtime.h"

using namespace std;
using antlr4::tree::ParseTree;

class Symbol {

  public:
    Symbol() {}
    Symbol(string n);
    Symbol(string n, size_t idx);
    ~Symbol() {}


    string name;
    int address;
    unordered_map<string, int> attributes;
    vector<int> data;
    size_t index;
    bool isLabel;
};

struct SymbolRange {
  SymbolRange(Symbol* sym) { symbol = sym; }
  SymbolRange(Symbol* sym, size_t s, size_t e) {
    symbol = sym;
    start = s;
    end = e;
  }
  Symbol* symbol;
  size_t start;
  size_t end;
};

class Section {

  public:

    Section(string n, size_t s, size_t e) { 
      name = n; 
      start = s;
      end = e;
    }
    ~Section() {}

    void AddSymbol(Symbol& sym, Error* err, ParseTree* ctx);
    bool ValidRange(size_t s, size_t e, Symbol& sym, Error* err, ParseTree* ctx);
    vector<uint8_t>& GetData();

    string name;
    list<SymbolRange> symbols;
    vector<uint8_t> data;
    size_t start;
    size_t end;

};

// No scopes to worry about for this one
class SymbolTable {

  public:
    SymbolTable() {}
    ~SymbolTable() {}

    void AddSymbol(Symbol& s, Error* err, ParseTree* ctx);
    Symbol& GetSymbol(string name);

    inline static unordered_map<string, Section> sections = {
      {"ram", Section("ram", 65, 1792)}, // 256 words reserved for stack
      {"rom", Section("rom", 0, 0x10000)},
      {"flash", Section("flash", 0, 0x800000)},
    };

    unordered_map<string, Symbol> symbols;
    vector<Symbol*> ordered;
};

#endif