
#include <iostream>
#include <sstream>
#include <filesystem>

#include "CLI.hpp"
#include "assembler.h"
#include "error.h"

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

  Error err(filename);
  Assembler enca(filename, &err);

  enca.Complete();

  return 0;
}