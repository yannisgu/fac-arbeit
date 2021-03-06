package ch.ffhs.ti.yannis.skript.parser;

import static ch.ffhs.ti.yannis.skript.parser.sym.*;
import java_cup.runtime.Symbol;

%%

%public
%apiprivate
%class Scanner
%cupsym sym
%cup
%unicode
%line
%column

%{

    private Symbol sym(int type)
    {
         return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symVal(int type)
    {
         return new Symbol(type, yyline, yycolumn, yytext());
    }
   
%}

OPT_SPACE = [ \t]+
BREAK     = [\n\r]+
COMMENT   = "//".*
%%

"+"     { return sym(PLUS); }
"-"     { return sym(MINUS); }
"*"     { return sym(TIMES); }
"/"     { return sym(DIV); }
"%"     { return sym(MOD); }
"**"    { return sym(POW); }
":="    { return sym(ASSIGN); }
"("		{ return sym(LPAR); }
")"		{ return sym(RPAR); }
"if"		{ return sym(IF); }
"=="		{ return sym(EQ); }

[0-9]+  { return symVal(NUMBER); }
([:jletter:]|_)([:jletterdigit:]|_)*	{return symVal(NAME); }

{BREAK} { return sym(SEP); }
{OPT_SPACE}	{ }
{COMMENT}   { }	

.		{ throw new RuntimeException("Illegal Symbol '" + yytext() + '\''
             + " in line " + yyline + ", column" + yycolumn); } 






