NAME = Enca
NAME_L = enca
SRC  = ./src
BUILD = build
GRAMMARS = $(SRC)/grammars
GRAMM_BUILD = $(GRAMMARS)/$(BUILD)
PROJ_BUILD = $(SRC)/$(BUILD)

ANTLR_HOME = $(SRC)/antlr4-jar
ANTLR_JAR = $(wildcard $(ANTLR_HOME)/*.jar)

ANTLR = java -jar ${ANTLR_JAR}
ANTLR_REL = java -jar ../../${ANTLR_JAR}
GRUN = java org.antlr.v4.gui.TestRig

EXAMPLE = test.enc
EXAMPLE_PATH = $(SRC)/examples/$(EXAMPLE)

all: build_assembler

update: update_assembler build_assembler

test: java_build java_test

.PHONY: all test clean build_cpp build_java test_java build_assembler update grammar

grammar: $(GRAMMARS)/$(NAME).g4 clean
	$(info Building assembler...)
	@ cd $(GRAMMARS); ${ANTLR_REL} -visitor -Dlanguage=Cpp -o $(BUILD) ${NAME}.g4;
	$(info Done.)

update_and_build: update_assembler build_assembler
	
build_assembler: $(GRAMM_BUILD)
	@ if [ ! -d "$(PROJ_BUILD)" ]; then $(MAKE) update_assembler; fi
	cd $(PROJ_BUILD); $(MAKE);

update_assembler: 
	@ if [ ! -d "$(PROJ_BUILD)" ]; then mkdir$(PROJ_BUILD); fi
	cd ${SRC}; cmake . -B $(BUILD);

update_assembler_debug: 
	@ if [ ! -d "$(PROJ_BUILD)" ]; then mkdir $(PROJ_BUILD); fi
	cd ${SRC}; cmake . -B $(BUILD) -DCMAKE_BUILD_TYPE=Debug;

java_build: $(GRAMMARS)/$(NAME).g4
	$(info Building main assembler parse tree...)
	@ cd $(GRAMMARS); ${ANTLR_REL} -o $(BUILD)/java ${NAME}.g4; \
	javac -d $(BUILD)/java $(BUILD)/java/${NAME}*.java

java_test: ${EXAMPLE_PATH}
	$(info Executing main assembler parse tree...)
	@ cd ${GRAMM_BUILD}/java; \
	${GRUN} ${NAME} parse ../../../examples/$(EXAMPLE) -gui

clean:
	@ if [ -d "${GRAMM_BUILD}" ]; then rm -r ${GRAMM_BUILD}; fi

reset: clean
	@ if [ -d "${PROJ_BUILD}" ]; then rm -rf ${PROJ_BUILD}; fi
	@ if [ -d "${SRC}/dist" ]; then rm -rf ${SRC}/dist; fi

run: $(PROJ_BUILD)/$(NAME_L)
	$(PROJ_BUILD)/$(NAME_L) ${EXAMPLE_PATH}

# graph: ${SRC}/build/corax
# 	${SRC}/build/corax ${SRC}/examples/test.cx --graph | dot -Tpng -Gdpi=300 -o graph.png