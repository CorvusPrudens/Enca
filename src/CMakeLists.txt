cmake_minimum_required(VERSION 3.10)

# set the project name
project(Enca VERSION 1.0)

set(CMAKE_CXX_STANDARD 17)

set(LIB_OUTPUT_DIR "${CMAKE_HOME_DIRECTORY}/build/dist")

set(CMAKE_CXX_FLAGS  "${CMAKE_CXX_FLAGS} -Wno-attributes")

add_subdirectory(antlr4/runtime/Cpp)
add_subdirectory(cli11)

include_directories(
    ${CMAKE_SOURCE_DIR}
    ${CMAKE_SOURCE_DIR}/grammars/build
    ${CMAKE_SOURCE_DIR}/assembler
    ${CMAKE_SOURCE_DIR}/antlr4/runtime/Cpp/runtime/src
    ${CMAKE_SOURCE_DIR}/cli11/include/CLI/
    )

set (SOURCE_FILES 
    error.cpp
    utils.cpp

    ./assembler/assembler.cpp
    ./assembler/operand.cpp
    ./assembler/instruction.cpp
    ./assembler/symbols.cpp
    )

set (INCLUDE_FILES
    antlr4/runtime/Cpp/runtime/src/antlr4-runtime.h

    colors.h
    error.h
    utils.h

    ./assembler/assembler.h
    ./assembler/operand.h
    ./assembler/instruction.h
    ./assembler/symbols.h
    )

list (APPEND LINK_LIBS
    antlr4_static
    CLI11::CLI11
    )

# add the executable
# add_executable(Compiler main.cpp)
add_executable(enca Enca.cpp
    ${SOURCE_FILES}
    ${INCLUDE_FILES}
    )
target_link_libraries(enca PUBLIC ${LINK_LIBS})
# add_dependencies(Cp 
#   antlr4_static 
#   Compiler
#   )
