package org.dylanfoundry.deft.filetypes.dylan;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes;
import com.intellij.psi.TokenType;

%%

%class _DylanLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

DIGIT=[0-9]

ALPHABETIC_CHARACTER=[a-zA-Z]
NUMERIC_CHARACTER={DIGIT}
GRAPHIC_CHARACTER=[!&*<=>|\^$%@_]
SPECIAL_CHARACTER=[-+~?/=]
ANY_CHARACTER={ALPHABETIC_CHARACTER}|{NUMERIC_CHARACTER}|{GRAPHIC_CHARACTER}|{SPECIAL_CHARACTER}
WORD_CHARACTER_NOT_DOUBLE_ALPHABETIC={ALPHABETIC_CHARACTER}|{WORD_CHARACTER_NOT_ALPHABETIC}|{NUMERIC_CHARACTER}|{GRAPHIC_CHARACTER}|{SPECIAL_CHARACTER}
WORD_CHARACTER_NOT_ALPHABETIC={NUMERIC_CHARACTER}|{GRAPHIC_CHARACTER}|{SPECIAL_CHARACTER}
//LEADING_GRAPHIC={GRAPHIC_CHARACTER}|{LEADING_GRAPHIC}{WORD_CHARACTER_NOT_ALPHABETIC}
LEADING_GRAPHIC={GRAPHIC_CHARACTER}{WORD_CHARACTER_NOT_ALPHABETIC}*
//LEADING_NUMERIC={NUMERIC_CHARACTER}|{NUMERIC_CHARACTER}{WORD_CHARACTER_NOT_DOUBLE_ALPHABETIC}
LEADING_NUMERIC={NUMERIC_CHARACTER}{WORD_CHARACTER_NOT_DOUBLE_ALPHABETIC}*
//LEADING_ALPHABETIC={ALPHABETIC_CHARACTER}|{LEADING_ALPHABETIC}{ANY_CHARACTER}
LEADING_ALPHABETIC={ALPHABETIC_CHARACTER}{ANY_CHARACTER}*
WORD={LEADING_ALPHABETIC}|{LEADING_NUMERIC}{ALPHABETIC_CHARACTER}{LEADING_ALPHABETIC}|{LEADING_GRAPHIC}{LEADING_ALPHABETIC}

UNARY_OPERATOR="~"
UNARY_AND_BINARY_OPERATOR="-"
BINARY_OPERATOR="+" | "*" | "/" | "^" | "~=" | "~==" | "<" | "<=" | ">" | ">=" | "&" | "|" | ":="

OPERATOR_NAME="\\" {UNARY_OPERATOR} | "\\" {BINARY_OPERATOR} | "\\" {UNARY_AND_BINARY_OPERATOR} | "\\=" | "\\=="
NAME={WORD} | "\\" {WORD} | {OPERATOR_NAME}

CHARACTER="'" [^'] "'" | "'\\" [abefnrt0\\\'] "'"

SIGN=(\+|-)
DECIMAL_INTEGER={SIGN}? {DIGIT}+
BINARY_INTEGER="#"[bB][01]+
OCTAL_INTEGER="#"[oO][0-7]+
HEX_INTEGER="#"[xX][0-9a-fA-F]+
RATIO={SIGN}? {DIGIT}+ "/" {DIGIT}+
EXPONENT=[eE] {SIGN}? {DECIMAL_INTEGER}
FLOAT=({SIGN}? {DECIMAL_INTEGER}? "." {DECIMAL_INTEGER} {EXPONENT}?) | ({SIGN}? {DECIMAL_INTEGER} "." {DECIMAL_INTEGER}? {EXPONENT}?) | ({SIGN}? {DECIMAL_INTEGER} {EXPONENT})

NUMBER=({DECIMAL_INTEGER}|{BINARY_INTEGER}|{OCTAL_INTEGER}|{HEX_INTEGER}|{RATIO}|{FLOAT})

END_OF_LINE_COMMENT=("//")[^\r\n]*
CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
FIRST_VALUE_CHARACTER=[^ \n\r\f\\]
VALUE_CHARACTER=[^\n\r\f\\]
KEY_CHARACTER=[a-zA-Z0-9\-]
SEPARATOR=[:]

STRING_ESCAPE=\\ ([\\abefnrt0\"]|x[a-fA-F0-9]{2,4}|[0-7]{1,3})

STRING=\" ({STRING_ESCAPE}|[^\"])* \"

%state WAITING_VALUE
%state DYLAN_CODE
%state COMMENT_BLOCK
%state STRING

%{
    int commentLevel = 0;
%}
%%

// Dylan header
<YYINITIAL> {
    {END_OF_LINE_COMMENT}                           { return DylanTypes.COMMENT; }
    {CRLF}{CRLF}                                    { yybegin(DYLAN_CODE); return  DylanTypes.CRLF; }
    {ALPHABETIC_CHARACTER}{KEY_CHARACTER}*          { return DylanTypes.KEY; }
    {SEPARATOR}                                     { yybegin(WAITING_VALUE); return DylanTypes.HEADER_SEPARATOR; }
    {WHITE_SPACE}+                                  { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
    {CRLF}                                          { return DylanTypes.CRLF; }
}

<WAITING_VALUE> {
    {CRLF}                                          { yybegin(YYINITIAL); return DylanTypes.CRLF; }
    {WHITE_SPACE}+                                  { return TokenType.WHITE_SPACE; }
    {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*       { yybegin(YYINITIAL); return DylanTypes.VALUE; }
}

// Dylan Code
<DYLAN_CODE> {
    "/\*"                                           { yybegin(COMMENT_BLOCK); commentLevel++; return DylanTypes.COMMENT; }
    {END_OF_LINE_COMMENT}                           { return DylanTypes.COMMENT; }

    {NUMBER}                                        { return DylanTypes.NUMBER; }

    {CHARACTER}                                     { return DylanTypes.CHARACTER_LITERAL; }
    "\""                                            { yybegin(STRING); return DylanTypes.STRING_CHARACTER; }
    {WORD}":"                                       { return DylanTypes.KEYWORD; }

    {NAME}":"{WORD}                                 { return DylanTypes.CONSTRAINED_NAME; }
    {NAME}":"({BINARY_OPERATOR}|"=="|"=")           { return DylanTypes.CONSTRAINED_NAME; }
    ":"{WORD}                                       { return DylanTypes.CONSTRAINED_NAME; }

    "\\"{WORD}                                      { return DylanTypes.ESCAPED_WORD; }
    {OPERATOR_NAME}                                 { return DylanTypes.OPERATOR_NAME; }


    // #-words
    "#t"                                            { return DylanTypes.HASH_T; }
    "#f"                                            { return DylanTypes.HASH_F; }
    "#next"                                         { return DylanTypes.HASH_NEXT; }
    "#rest"                                         { return DylanTypes.HASH_REST; }
    "#key"                                          { return DylanTypes.HASH_KEY; }
    "#all-keys"                                     { return DylanTypes.HASH_ALL_KEYS; }

    "#"                                             { return DylanTypes.HASH; }

    // Keywords
    "above"                                         { return DylanTypes.ABOVE; }
    "afterwards"                                    { return DylanTypes.AFTERWARDS; }
    "all"                                           { return DylanTypes.ALL; }
    "begin"                                         { return DylanTypes.BEGIN; }
    "below"                                         { return DylanTypes.BELOW; }
    "by"                                            { return DylanTypes.BY; }
    //"case"                                          { return DylanTypes.CASE; }
    "copy-down-method"                              { return DylanTypes.COPY_DOWN_METHOD; }
    "cleanup"                                       { return DylanTypes.CLEANUP; }
    "create"                                        { return DylanTypes.CREATE; }
    "define"                                        { return DylanTypes.DEFINE; }
    "else"                                          { return DylanTypes.ELSE; }
    "elseif"                                        { return DylanTypes.ELSEIF; }
    "end"                                           { return DylanTypes.END; }
    "export"                                        { return DylanTypes.EXPORT; }
    "finally"                                       { return DylanTypes.FINALLY; }
    "for"                                           { return DylanTypes.FOR; }
    "from"                                          { return DylanTypes.FROM; }
    "if"                                            { return DylanTypes.IF; }
    "in"                                            { return DylanTypes.IN; }
    "keyed-by"                                      { return DylanTypes.KEYED_BY; }
    "let"                                           { return DylanTypes.LET; }
    "local"                                         { return DylanTypes.LOCAL; }
    "otherwise"                                     { return DylanTypes.OTHERWISE; }
    //"rename"                                        { return DylanTypes.KEYWORD; }
    "select"                                        { return DylanTypes.NONDEFINING_BEGIN_WORD; }
    //"signal"                                        { return DylanTypes.KEYWORD; }
    "then"                                          { return DylanTypes.THEN; }
    "to"                                            { return DylanTypes.TO; }
    "unless"                                        { return DylanTypes.UNLESS; }
    "until"                                         { return DylanTypes.UNTIL; }
    "use"                                           { return DylanTypes.USE; }
    "using"                                         { return DylanTypes.USING; }
    "when"                                          { return DylanTypes.WHEN; }
    "while"                                         { return DylanTypes.WHILE; }

    // Builtins
    /*
    "subclass"                                      { return DylanTypes.BUILTIN; }
    "abstract"                                      { return DylanTypes.BUILTIN; }
    */
    "block"                                         { return DylanTypes.BLOCK; }
    /*
    "concrete"                                      { return DylanTypes.BUILTIN; }
    */
    "constant"                                      { return DylanTypes.CONSTANT_T; }
    "class"                                         { return DylanTypes.CLASS; }
    /*
    "compiler-open"                                 { return DylanTypes.BUILTIN; }
    "compiler-sideways"                             { return DylanTypes.BUILTIN; }
    */
    "domain"                                        { return DylanTypes.DOMAIN; }
    /*
    "dynamic"                                       { return DylanTypes.BUILTIN; }
    "each-subclass"                                 { return DylanTypes.BUILTIN; }
    */
    "exception"                                     { return DylanTypes.EXCEPTION; }
    //"exclude"                                       { return DylanTypes.BUILTIN; }
    "function"                                      { return DylanTypes.FUNCTION; }
    "generic"                                       { return DylanTypes.GENERIC; }
    "handler"                                       { return DylanTypes.HANDLER_T; }
    /*
    "inherited"                                     { return DylanTypes.BUILTIN; }
    "inline"                                        { return DylanTypes.BUILTIN; }
    "inline-only"                                   { return DylanTypes.BUILTIN; }
    "instance"                                      { return DylanTypes.BUILTIN; }
    "interface"                                     { return DylanTypes.BUILTIN; }
    "import"                                        { return DylanTypes.BUILTIN; }
    "keyword"                                       { return DylanTypes.BUILTIN; }
    */
    "library"                                       { return DylanTypes.LIBRARY; }
    "macro"                                         { return DylanTypes.MACRO_T; }
    "method"                                        { return DylanTypes.METHOD; }
    "module"                                        { return DylanTypes.MODULE; }
    /*
    "open"                                          { return DylanTypes.BUILTIN; }
    "primary"                                       { return DylanTypes.BUILTIN; }
    "required"                                      { return DylanTypes.BUILTIN; }
    "sealed"                                        { return DylanTypes.BUILTIN; }
    "sideways"                                      { return DylanTypes.BUILTIN; }
    "singleton"                                     { return DylanTypes.BUILTIN; }
    */
    "shared-symbols"                                { return DylanTypes.SHARED_SYMBOLS_T; }
    "slot"                                          { return DylanTypes.SLOT; }
    //"thread"                                        { return DylanTypes.BUILTIN; }
    "variable"                                      { return DylanTypes.VARIABLE_T; }
    /*
    "virtual"                                       { return DylanTypes.BUILTIN; }
    */

    // Operators
    {UNARY_OPERATOR}                                { return DylanTypes.UNARY_OPERATOR_ONLY; }
    {BINARY_OPERATOR}                               { return DylanTypes.BINARY_OPERATOR_ONLY; }
    "="                                             { return DylanTypes.EQUAL; } // FIXME
    "=="                                            { return DylanTypes.EQUAL_EQUAL; } // FIXME
    {UNARY_AND_BINARY_OPERATOR}                     { return DylanTypes.UNARY_AND_BINARY_OPERATOR; }

    // Punctuation
    "("                                             { return DylanTypes.LPAREN; }
    ")"                                             { return DylanTypes.RPAREN; }
    "["                                             { return DylanTypes.LBRACKET; }
    "]"                                             { return DylanTypes.RBRACKET; }
    "{"                                             { return DylanTypes.LBRACE; }
    "}"                                             { return DylanTypes.RBRACE; }
    ","                                             { return DylanTypes.COMMA; }
    "."                                             { return DylanTypes.DOT; }
    ";"                                             { return DylanTypes.SEMICOLON; }
    //"="                                             { return DylanTypes.PUNCTUATION; }
    "::"                                            { return DylanTypes.COLON_COLON; }
    //"=="                                            { return DylanTypes.PUNCTUATION; }
    "=>"                                            { return DylanTypes.EQUAL_ARROW; }
    "#("                                            { return DylanTypes.HASH_PAREN; }
    "#["                                            { return DylanTypes.HASH_BRACKET; }
    "?"                                             { return DylanTypes.QUERY; }
    "??"                                            { return DylanTypes.QUERY_QUERY; }
    "..."                                           { return DylanTypes.ELLIPSIS; }
    "##"                                            { return DylanTypes.HASH_HASH; }

    // Functions
    /*
    "abort"                                         { return DylanTypes.FUNCTION; }
    "abs"                                           { return DylanTypes.FUNCTION; }
    "add"                                           { return DylanTypes.FUNCTION; }
    "add!"                                          { return DylanTypes.FUNCTION; }
    "add-method"                                    { return DylanTypes.FUNCTION; }
    "add-new"                                       { return DylanTypes.FUNCTION; }
    "add-new!"                                      { return DylanTypes.FUNCTION; }
    "all-superclasses"                              { return DylanTypes.FUNCTION; }
    "always"                                        { return DylanTypes.FUNCTION; }
    "any?"                                          { return DylanTypes.FUNCTION; }
    "applicable-method?"                            { return DylanTypes.FUNCTION; }
    "apply"                                         { return DylanTypes.FUNCTION; }
    "aref"                                          { return DylanTypes.FUNCTION; }
    "aref-setter"                                   { return DylanTypes.FUNCTION; }
    "as"                                            { return DylanTypes.FUNCTION; }
    "as-lowercase"                                  { return DylanTypes.FUNCTION; }
    "as-lowercase!"                                 { return DylanTypes.FUNCTION; }
    "as-uppercase"                                  { return DylanTypes.FUNCTION; }
    "as-uppercase!"                                 { return DylanTypes.FUNCTION; }
    "ash"                                           { return DylanTypes.FUNCTION; }
    "backward-iteration-protocol"                   { return DylanTypes.FUNCTION; }
    "break"                                         { return DylanTypes.FUNCTION; }
    "ceiling"                                       { return DylanTypes.FUNCTION; }
    "ceiling/"                                      { return DylanTypes.FUNCTION; }
    "cerror"                                        { return DylanTypes.FUNCTION; }
    "check-type"                                    { return DylanTypes.FUNCTION; }
    "choose"                                        { return DylanTypes.FUNCTION; }
    "choose-by"                                     { return DylanTypes.FUNCTION; }
    "complement"                                    { return DylanTypes.FUNCTION; }
    "compose"                                       { return DylanTypes.FUNCTION; }
    "concatenate"                                   { return DylanTypes.FUNCTION; }
    "concatenate-as"                                { return DylanTypes.FUNCTION; }
    "condition-format-arguments"                    { return DylanTypes.FUNCTION; }
    "condition-format-string"                       { return DylanTypes.FUNCTION; }
    "conjoin"                                       { return DylanTypes.FUNCTION; }
    "copy-sequence"                                 { return DylanTypes.FUNCTION; }
    "curry"                                         { return DylanTypes.FUNCTION; }
    "default-handler"                               { return DylanTypes.FUNCTION; }
    "dimension"                                     { return DylanTypes.FUNCTION; }
    "dimensions"                                    { return DylanTypes.FUNCTION; }
    "direct-subclasses"                             { return DylanTypes.FUNCTION; }
    "direct-superclasses"                           { return DylanTypes.FUNCTION; }
    "disjoin"                                       { return DylanTypes.FUNCTION; }
    "do"                                            { return DylanTypes.FUNCTION; }
    "do-handlers"                                   { return DylanTypes.FUNCTION; }
    "element"                                       { return DylanTypes.FUNCTION; }
    "element-setter"                                { return DylanTypes.FUNCTION; }
    "empty?"                                        { return DylanTypes.FUNCTION; }
    "error"                                         { return DylanTypes.FUNCTION; }
    "even?"                                         { return DylanTypes.FUNCTION; }
    "every?"                                        { return DylanTypes.FUNCTION; }
    "false-or"                                      { return DylanTypes.FUNCTION; }
    "fill!"                                         { return DylanTypes.FUNCTION; }
    "find-key"                                      { return DylanTypes.FUNCTION; }
    "find-method"                                   { return DylanTypes.FUNCTION; }
    "first"                                         { return DylanTypes.FUNCTION; }
    "first-setter"                                  { return DylanTypes.FUNCTION; }
    "floor"                                         { return DylanTypes.FUNCTION; }
    "floor/"                                        { return DylanTypes.FUNCTION; }
    "forward-iteration-protocol"                    { return DylanTypes.FUNCTION; }
    "function-arguments"                            { return DylanTypes.FUNCTION; }
    "function-return-values"                        { return DylanTypes.FUNCTION; }
    "function-specializers"                         { return DylanTypes.FUNCTION; }
    "gcd"                                           { return DylanTypes.FUNCTION; }
    "generic-function-mandatory-keywords"           { return DylanTypes.FUNCTION; }
    "generic-function-methods"                      { return DylanTypes.FUNCTION; }
    "head"                                          { return DylanTypes.FUNCTION; }
    "head-setter"                                   { return DylanTypes.FUNCTION; }
    "identity"                                      { return DylanTypes.FUNCTION; }
    "initialize"                                    { return DylanTypes.FUNCTION; }
    "instance?"                                     { return DylanTypes.FUNCTION; }
    "integral?"                                     { return DylanTypes.FUNCTION; }
    "intersection"                                  { return DylanTypes.FUNCTION; }
    "key-sequence"                                  { return DylanTypes.FUNCTION; }
    "key-test"                                      { return DylanTypes.FUNCTION; }
    "last"                                          { return DylanTypes.FUNCTION; }
    "last-setter"                                   { return DylanTypes.FUNCTION; }
    "lcm"                                           { return DylanTypes.FUNCTION; }
    "limited"                                       { return DylanTypes.FUNCTION; }
    "list"                                          { return DylanTypes.FUNCTION; }
    "logand"                                        { return DylanTypes.FUNCTION; }
    "logbit?"                                       { return DylanTypes.FUNCTION; }
    "logior"                                        { return DylanTypes.FUNCTION; }
    "lognot"                                        { return DylanTypes.FUNCTION; }
    "logxor"                                        { return DylanTypes.FUNCTION; }
    "make"                                          { return DylanTypes.FUNCTION; }
    "map"                                           { return DylanTypes.FUNCTION; }
    "map-as"                                        { return DylanTypes.FUNCTION; }
    "map-into"                                      { return DylanTypes.FUNCTION; }
    "max"                                           { return DylanTypes.FUNCTION; }
    "member?"                                       { return DylanTypes.FUNCTION; }
    "merge-hash-codes"                              { return DylanTypes.FUNCTION; }
    "min"                                           { return DylanTypes.FUNCTION; }
    "modulo"                                        { return DylanTypes.FUNCTION; }
    "negative"                                      { return DylanTypes.FUNCTION; }
    "negative?"                                     { return DylanTypes.FUNCTION; }
    "next-method"                                   { return DylanTypes.FUNCTION; }
    "object-class"                                  { return DylanTypes.FUNCTION; }
    "object-hash"                                   { return DylanTypes.FUNCTION; }
    "odd?"                                          { return DylanTypes.FUNCTION; }
    "one-of"                                        { return DylanTypes.FUNCTION; }
    "pair"                                          { return DylanTypes.FUNCTION; }
    "pop"                                           { return DylanTypes.FUNCTION; }
    "pop-last"                                      { return DylanTypes.FUNCTION; }
    "positive?"                                     { return DylanTypes.FUNCTION; }
    "push"                                          { return DylanTypes.FUNCTION; }
    "push-last"                                     { return DylanTypes.FUNCTION; }
    "range"                                         { return DylanTypes.FUNCTION; }
    "rank"                                          { return DylanTypes.FUNCTION; }
    "rcurry"                                        { return DylanTypes.FUNCTION; }
    "reduce"                                        { return DylanTypes.FUNCTION; }
    "reduce1"                                       { return DylanTypes.FUNCTION; }
    "remainder"                                     { return DylanTypes.FUNCTION; }
    "remove"                                        { return DylanTypes.FUNCTION; }
    "remove!"                                       { return DylanTypes.FUNCTION; }
    "remove-duplicates"                             { return DylanTypes.FUNCTION; }
    "remove-duplicates!"                            { return DylanTypes.FUNCTION; }
    "remove-key!"                                   { return DylanTypes.FUNCTION; }
    "remove-method"                                 { return DylanTypes.FUNCTION; }
    "replace-elements!"                             { return DylanTypes.FUNCTION; }
    "replace-subsequence!"                          { return DylanTypes.FUNCTION; }
    "restart-query"                                 { return DylanTypes.FUNCTION; }
    "return-allowed?"                               { return DylanTypes.FUNCTION; }
    "return-description"                            { return DylanTypes.FUNCTION; }
    "return-query"                                  { return DylanTypes.FUNCTION; }
    "reverse"                                       { return DylanTypes.FUNCTION; }
    "reverse!"                                      { return DylanTypes.FUNCTION; }
    "round"                                         { return DylanTypes.FUNCTION; }
    "round/"                                        { return DylanTypes.FUNCTION; }
    "row-major-index"                               { return DylanTypes.FUNCTION; }
    "second"                                        { return DylanTypes.FUNCTION; }
    "second-setter"                                 { return DylanTypes.FUNCTION; }
    "shallow-copy"                                  { return DylanTypes.FUNCTION; }
    "signal"                                        { return DylanTypes.FUNCTION; }
    "singleton"                                     { return DylanTypes.FUNCTION; }
    "size"                                          { return DylanTypes.FUNCTION; }
    "size-setter"                                   { return DylanTypes.FUNCTION; }
    "slot-initialized?"                             { return DylanTypes.FUNCTION; }
    "sort"                                          { return DylanTypes.FUNCTION; }
    "sort!"                                         { return DylanTypes.FUNCTION; }
    "sorted-applicable-methods"                     { return DylanTypes.FUNCTION; }
    "subsequence-position"                          { return DylanTypes.FUNCTION; }
    "subtype?"                                      { return DylanTypes.FUNCTION; }
    "table-protocol"                                { return DylanTypes.FUNCTION; }
    "tail"                                          { return DylanTypes.FUNCTION; }
    "tail-setter"                                   { return DylanTypes.FUNCTION; }
    "third"                                         { return DylanTypes.FUNCTION; }
    "third-setter"                                  { return DylanTypes.FUNCTION; }
    "truncate"                                      { return DylanTypes.FUNCTION; }
    "truncate/"                                     { return DylanTypes.FUNCTION; }
    "type-error-expected-type"                      { return DylanTypes.FUNCTION; }
    "type-error-value"                              { return DylanTypes.FUNCTION; }
    "type-for-copy"                                 { return DylanTypes.FUNCTION; }
    "type-union"                                    { return DylanTypes.FUNCTION; }
    "union"                                         { return DylanTypes.FUNCTION; }
    "values"                                        { return DylanTypes.FUNCTION; }
    "vector"                                        { return DylanTypes.FUNCTION; }
    "zero?"                                         { return DylanTypes.FUNCTION; }
    */

    {WORD}                                          { return DylanTypes.NONDEFINING_NONEXPRESSION_WORD; }
    "_"                                             { return DylanTypes.VARIABLE_IGNORE; }

    {WHITE_SPACE}+                                  { return TokenType.WHITE_SPACE; }
    {CRLF}                                          { /* return DylanTypes.CRLF; */ }
}

// Comment block ( /* ... */ )
<COMMENT_BLOCK> {
    "\*/"                                           { commentLevel--; if (commentLevel == 0) { yybegin(DYLAN_CODE);} return DylanTypes.COMMENT; }
    "/\*"                                           { commentLevel++; yybegin(COMMENT_BLOCK); return DylanTypes.COMMENT; }
    {CRLF}                                          { /* return DylanTypes.CRLF; */ }
    .                                               { return DylanTypes.COMMENT; }
}

<STRING> {
    "\""                                            { yybegin(DYLAN_CODE); return DylanTypes.STRING_CHARACTER; }
    \\[abefnrt0\\\"]                                { return DylanTypes.STRING_ESCAPE_CHARACTER; }
    .                                               { return DylanTypes.STRING_CHARACTER; }
}

{CRLF}                                              { yybegin(DYLAN_CODE); return DylanTypes.CRLF; }
.                                                   { return TokenType.BAD_CHARACTER; }
