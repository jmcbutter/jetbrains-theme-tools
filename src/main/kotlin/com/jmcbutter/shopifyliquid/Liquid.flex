package com.jmcbutter.shopifyliquid.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.jmcbutter.shopifyliquid.psi.LiquidTypes;
import com.intellij.psi.TokenType;

%%

%class LiquidLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return; %eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
COMMENT_START="\{# "
COMMENT_END=" #\}"
OUTPUT_START="\{\{"
OUTPUT_END=" \}\}"
TAG_START="\{%"
TAG_END=" %\}"

%%
<YYINITIAL> {
  {WHITE_SPACE}+          { return TokenType.WHITE_SPACE; }
  {COMMENT_START}         { yybegin(IN_COMMENT); return LiquidTypes.COMMENT_START; }
  {OUTPUT_START}          { return LiquidTypes.OUTPUT_START; }
  {OUTPUT_END}            { return LiquidTypes.OUTPUT_END; }
  {TAG_START}             { return LiquidTypes.TAG_START; }
  {TAG_END}               { return LiquidTypes.TAG_END; }

  [^]                     { return TokenType.BAD_CHARACTER; }
}

<IN_COMMENT> {
  {COMMENT_END}           { yybegin(YYINITIAL); return LiquidTypes.COMMENT_END; }
  [^{#}]*                 { return LiquidTypes.COMMENT_CONTENT; }
}