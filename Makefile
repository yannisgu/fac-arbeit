#
# make test (or just: make)
#    generates lexer & parser, compiles all *.java files, and runs test
#

# main class
MAIN = ch/ffhs/ti/umk/skript/SkriptRunner

# test data
TEST_IN  = src/test/data/test.txt
OUT_GOOD = src/test/data/output.good

# jflex input and output
LEXER_IN = grammars/Scanner.flex
LEXER_CLASS = Lexer

# cup file
PARSER_IN = grammars/Parser.cup

include ./common/Makefile.inc
