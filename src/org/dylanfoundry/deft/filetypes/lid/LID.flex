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
FIRST_VALUE_CHARACTER=[^ \n\r\f\\]
VALUE_CHARACTER=[^\n\r\f\\]
FIRST_KEY_CHARACTER=[a-zA-Z]
KEY_CHARACTER=[a-zA-Z0-9\-]
SEPARATOR=[:]

%state WAITING_SEPARATOR
%state WAITING_VALUE

%%

<YYINITIAL> {
    {FIRST_KEY_CHARACTER}{KEY_CHARACTER}*           { yybegin(WAITING_SEPARATOR); return LIDTypes.KEY; }
    {WHITE_SPACE}+                                  { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
}

<WAITING_SEPARATOR> {
    {SEPARATOR}                                     { yybegin(WAITING_VALUE); return LIDTypes.SEPARATOR; }
    {WHITE_SPACE}+                                  { return TokenType.WHITE_SPACE; }
}

<WAITING_VALUE> {
    {CRLF}                                          { yybegin(YYINITIAL); return LIDTypes.CRLF; }
    {WHITE_SPACE}+                                  { return TokenType.WHITE_SPACE; }
    {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*       { return LIDTypes.VALUE; }
}

{CRLF}                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
.                                                   { return TokenType.BAD_CHARACTER; }