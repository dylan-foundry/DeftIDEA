package org.dylanfoundry.deft.filetypes.lid;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.dylanfoundry.deft.filetypes.lid.psi.LIDTypes;
import com.intellij.psi.TokenType;

%%

%class LIDLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
FIRST_VALUE_CHARACTER=[^ \n\r\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\r\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("//")[^\r\n]*
SEPARATOR=[:]
KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\"{CRLF} | "\\".

%state WAITING_VALUE

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return LIDTypes.COMMENT; }
 
<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return LIDTypes.KEY; }
 
<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return LIDTypes.SEPARATOR; }
 
<WAITING_VALUE> {CRLF}                                     { yybegin(YYINITIAL); return LIDTypes.CRLF; }
 
<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
 
<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return LIDTypes.VALUE; }
 
{CRLF}                                                     { yybegin(YYINITIAL); return LIDTypes.CRLF; }
 
{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
 
.                                                           { return TokenType.BAD_CHARACTER; }
