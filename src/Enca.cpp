
#include <iostream>
#include <filesystem>

#include "CLI.hpp"
#include "assembler.h"
#include "error.h"
#include "utils.h"

using namespace std;

int main(int argc, const char* argv[])
{

  CLI::App app{"Assembler for the Corvus chip architecture."};

  std::string filename;
  app.add_option("file", filename, "File name")
    ->required()
    ->check(CLI::ExistingFile);
  // bool graph = false;
  // app.add_flag("--graph", graph, "Enable function call graphing");

  CLI11_PARSE(app, argc, argv);

  Assembler enca(filename);

  for (auto& inst : enca.instructions) {
    cout << inst.mnemonic << "\n";
  }
  for (auto symbol : enca.symbols.ordered) {
    cout << symbol->name << " " << symbol->address << "\n";
  }

  cout << "\n";

  // for (auto byte : enca.machine_code) {
  //   cout << to_string(byte) << "\n";
  // }
  // for (auto& inst : enca.instructions) {
  //   for (int i = inst.machine.bytes.size() - 1; i > -1; i--) {
  //     cout << to_string(inst.machine.bytes[i]) << " ";
  //   }
  //   cout << "\n";
  // }
  enca.Complete();
  
  for (auto& inst : enca.instructions) {
    cout << formatInstruction(inst.machine.bytes) + "\n";
  }

  

  return 0;
}