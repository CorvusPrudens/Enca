
#include <iostream>
#include <fstream>
#include <filesystem>

#include "CLI.hpp"
#include "assembler.h"
#include "error.h"
#include "utils.h"

using namespace std;

int main(int argc, const char* argv[])
{

  CLI::App app{"Assembler for the Corvus chip architecture."};

  string filename;
  app.add_option("file", filename, "File name")
    ->required()
    ->check(CLI::ExistingFile);

  string outname = "out";
  app.add_option("-o", outname, "Output binary prefix")
    ->default_str("out");

  bool no_output = false;
  app.add_flag("--no-output", no_output, "Disable the creation of output binaries");

  bool debug = false;
  app.add_flag("--debug", debug, "Enable debug mode");

  CLI11_PARSE(app, argc, argv);

  Assembler enca(filename);

  for (auto& inst : enca.instructions) {
    cout << inst.mnemonic << "\n";
  }
  for (auto symbol : enca.symbols.ordered) {
    cout << symbol->name << " " << symbol->address << "\n";
  }

  cout << "\n";

  enca.Complete();
  
  if (debug) 
  {
    for (auto& inst : enca.instructions) {
      cout << formatInstruction(inst.machine.bytes) + "\n";
    }
  }

  if (!no_output) 
  {
    ofstream outfile(outname + ".bin", ios::out | ios::binary);
    for (auto item : enca.machine_code) {
      outfile << item;
    }
    outfile.close();
    enca.symbols.WriteFiles(outname);
  }

  return 0;
}