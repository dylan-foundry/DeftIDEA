package org.dylanfoundry.deft.filetypes.dylan;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes;
import com.intellij.psi.TokenType;

%%

%class DylanLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

ALPHA_CHARACTER=[a-zA-Z]
DIGIT=[0-9]
GRAPH_CHARACTER=[!&*<=>|\^$%@_]
NAME_CHARACTER={ALPHA_CHARACTER}|{DIGIT}|{GRAPH_CHARACTER}|[-+~?/]

OPERATOR="+"|"-"|"*"|"/"|"^"|"="|"=="|"<"|">"|"<="|">="|"~="|"~=="|"&"|"|"|":="|"~"

// The real definition is stricter. See http://opendylan.org/books/drm/Lexical_Syntax
NAME={ALPHA_CHARACTER} {NAME_CHARACTER}* | {DIGIT} {NAME_CHARACTER}+ | {GRAPH_CHARACTER} {NAME_CHARACTER}+ | "\\" {OPERATOR}
CLASS_NAME="<" {NAME_CHARACTER}* ">"
CONSTANT_NAME="$" {NAME_CHARACTER}*

CHARACTER="'" [^'] "'" | "'\\" [abefnrt0] "'"

SIGN=(\+|-)
DECIMAL_INTEGER={SIGN}? {DIGIT}+
BINARY_INTEGER="#"[bB][01]+
OCTAL_INTEGER="#"[oO][0-7]+
HEX_INTEGER="#"[0-9a-fA-F]+
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

%state WAITING_VALUE
%state DYLAN_CODE
%state COMMENT_BLOCK
%state STRING
%state SYMBOL

%{
    int commentLevel = 0;
%}
%%

// Dylan header
<YYINITIAL> {
    {END_OF_LINE_COMMENT}                           { return DylanTypes.COMMENT; }
    {ALPHA_CHARACTER}{KEY_CHARACTER}*               { return DylanTypes.KEY; }
    {SEPARATOR}                                     { yybegin(WAITING_VALUE); return DylanTypes.SEPARATOR; }
    {WHITE_SPACE}+                                  { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
    {CRLF}                                          { return DylanTypes.CRLF; }
    {CRLF}{CRLF}                                    { yybegin(DYLAN_CODE); return  TokenType.WHITE_SPACE; }
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

    {CHARACTER}                                     { return DylanTypes.CHARACTER; }
    "\""                                            { yybegin(STRING); return DylanTypes.STRING; }
    "#\""                                           { yybegin(SYMBOL); return DylanTypes.SYMBOL; }
    {NAME}":"                                       { return DylanTypes.SYMBOL; }


    // #-words
    "#t"                                            { return DylanTypes.SHARP_WORD; }
    "#f"                                            { return DylanTypes.SHARP_WORD; }
    "#next"                                         { return DylanTypes.SHARP_WORD; }
    "#rest"                                         { return DylanTypes.SHARP_WORD; }
    "#key"                                          { return DylanTypes.SHARP_WORD; }
    "#all-keys"                                     { return DylanTypes.SHARP_WORD; }

    // Keywords
    "above"                                         { return DylanTypes.KEYWORD; }
    "afterwards"                                    { return DylanTypes.KEYWORD; }
    "begin"                                         { return DylanTypes.KEYWORD; }
    "below"                                         { return DylanTypes.KEYWORD; }
    "by"                                            { return DylanTypes.KEYWORD; }
    "cleanup"                                       { return DylanTypes.KEYWORD; }
    "create"                                        { return DylanTypes.KEYWORD; }
    "define"                                        { return DylanTypes.KEYWORD; }
    "else"                                          { return DylanTypes.KEYWORD; }
    "elseif"                                        { return DylanTypes.KEYWORD; }
    "end"                                           { return DylanTypes.KEYWORD; }
    "export"                                        { return DylanTypes.KEYWORD; }
    "finally"                                       { return DylanTypes.KEYWORD; }
    "for"                                           { return DylanTypes.KEYWORD; }
    "from"                                          { return DylanTypes.KEYWORD; }
    "if"                                            { return DylanTypes.KEYWORD; }
    "in"                                            { return DylanTypes.KEYWORD; }
    "let"                                           { return DylanTypes.KEYWORD; }
    "local"                                         { return DylanTypes.KEYWORD; }
    "otherwise"                                     { return DylanTypes.KEYWORD; }
    "rename"                                        { return DylanTypes.KEYWORD; }
    "select"                                        { return DylanTypes.KEYWORD; }
    "signal"                                        { return DylanTypes.KEYWORD; }
    "then"                                          { return DylanTypes.KEYWORD; }
    "to"                                            { return DylanTypes.KEYWORD; }
    "unless"                                        { return DylanTypes.KEYWORD; }
    "until"                                         { return DylanTypes.KEYWORD; }
    "use"                                           { return DylanTypes.KEYWORD; }
    "when"                                          { return DylanTypes.KEYWORD; }
    "while"                                         { return DylanTypes.KEYWORD; }

    // Builtins
    "subclass"                                      { return DylanTypes.BUILTIN; }
    "abstract"                                      { return DylanTypes.BUILTIN; }
    "block"                                         { return DylanTypes.BUILTIN; }
    "concrete"                                      { return DylanTypes.BUILTIN; }
    "constant"                                      { return DylanTypes.BUILTIN; }
    "class"                                         { return DylanTypes.BUILTIN; }
    "compiler-open"                                 { return DylanTypes.BUILTIN; }
    "compiler-sideways"                             { return DylanTypes.BUILTIN; }
    "domain"                                        { return DylanTypes.BUILTIN; }
    "dynamic"                                       { return DylanTypes.BUILTIN; }
    "each-subclass"                                 { return DylanTypes.BUILTIN; }
    "exception"                                     { return DylanTypes.BUILTIN; }
    "exclude"                                       { return DylanTypes.BUILTIN; }
    "function"                                      { return DylanTypes.BUILTIN; }
    "generic"                                       { return DylanTypes.BUILTIN; }
    "handler"                                       { return DylanTypes.BUILTIN; }
    "inherited"                                     { return DylanTypes.BUILTIN; }
    "inline"                                        { return DylanTypes.BUILTIN; }
    "inline-only"                                   { return DylanTypes.BUILTIN; }
    "instance"                                      { return DylanTypes.BUILTIN; }
    "interface"                                     { return DylanTypes.BUILTIN; }
    "import"                                        { return DylanTypes.BUILTIN; }
    "keyword"                                       { return DylanTypes.BUILTIN; }
    "library"                                       { return DylanTypes.BUILTIN; }
    "macro"                                         { return DylanTypes.BUILTIN; }
    "method"                                        { return DylanTypes.BUILTIN; }
    "module"                                        { return DylanTypes.BUILTIN; }
    "open"                                          { return DylanTypes.BUILTIN; }
    "primary"                                       { return DylanTypes.BUILTIN; }
    "required"                                      { return DylanTypes.BUILTIN; }
    "sealed"                                        { return DylanTypes.BUILTIN; }
    "sideways"                                      { return DylanTypes.BUILTIN; }
    "singleton"                                     { return DylanTypes.BUILTIN; }
    "slot"                                          { return DylanTypes.BUILTIN; }
    "thread"                                        { return DylanTypes.BUILTIN; }
    "variable"                                      { return DylanTypes.BUILTIN; }
    "virtual"                                       { return DylanTypes.BUILTIN; }

    // Operators
    "~"                                             { return DylanTypes.OPERATOR; }
    "+"                                             { return DylanTypes.OPERATOR; }
    "-"                                             { return DylanTypes.OPERATOR; }
    "*"                                             { return DylanTypes.OPERATOR; }
    "/"                                             { return DylanTypes.OPERATOR; }
    "^"                                             { return DylanTypes.OPERATOR; }
    "="                                             { return DylanTypes.OPERATOR; }
    "=="                                            { return DylanTypes.OPERATOR; }
    "~="                                            { return DylanTypes.OPERATOR; }
    "~=="                                           { return DylanTypes.OPERATOR; }
    "<"                                             { return DylanTypes.OPERATOR; }
    "<="                                            { return DylanTypes.OPERATOR; }
    ">"                                             { return DylanTypes.OPERATOR; }
    ">="                                            { return DylanTypes.OPERATOR; }
    "&"                                             { return DylanTypes.OPERATOR; }
    "|"                                             { return DylanTypes.OPERATOR; }
    ":="                                            { return DylanTypes.OPERATOR; }

    // Punctuation
    "("                                             { return DylanTypes.PUNCTUATION; }
    ")"                                             { return DylanTypes.PUNCTUATION; }
    "["                                             { return DylanTypes.PUNCTUATION; }
    "]"                                             { return DylanTypes.PUNCTUATION; }
    "{"                                             { return DylanTypes.PUNCTUATION; }
    "}"                                             { return DylanTypes.PUNCTUATION; }
    ","                                             { return DylanTypes.PUNCTUATION; }
    "."                                             { return DylanTypes.PUNCTUATION; }
    ";"                                             { return DylanTypes.PUNCTUATION; }
    //"="                                             { return DylanTypes.PUNCTUATION; }
    "::"                                            { return DylanTypes.PUNCTUATION; }
    //"=="                                            { return DylanTypes.PUNCTUATION; }
    "=>"                                            { return DylanTypes.PUNCTUATION; }
    "#("                                            { return DylanTypes.PUNCTUATION; }
    "#["                                            { return DylanTypes.PUNCTUATION; }
    "?"                                             { return DylanTypes.PUNCTUATION; }
    "??"                                            { return DylanTypes.PUNCTUATION; }
    "..."                                           { return DylanTypes.PUNCTUATION; }

    // Functions
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

    {NAME}                                          { return DylanTypes.IDENTIFIER; }
    {CLASS_NAME}                                    { return DylanTypes.CLASS; }
    {CONSTANT_NAME}                                 { return DylanTypes.CONSTANT; }


    {WHITE_SPACE}+                                  { return TokenType.WHITE_SPACE; }
    {CRLF}                                          { return DylanTypes.CRLF; }
}

// Comment block ( /* ... */ )
<COMMENT_BLOCK> {
    "\*/"                                           { commentLevel--; if (commentLevel == 0) { yybegin(DYLAN_CODE);} return DylanTypes.COMMENT; }
    "/\*"                                           { commentLevel++; yybegin(COMMENT_BLOCK); return DylanTypes.COMMENT; }
    {CRLF}                                          { return DylanTypes.CRLF; }
    .                                               { return DylanTypes.COMMENT; }
}

<STRING> {
    "\""                                            { yybegin(DYLAN_CODE); return DylanTypes.STRING; }
    \\[abefnrt0]                                    { return DylanTypes.STRING; }
    .                                               { return DylanTypes.STRING; }
}

<SYMBOL> {
    "\""                                            { yybegin(DYLAN_CODE); return DylanTypes.SYMBOL; }
    \\[abefnrt0]                                    { return DylanTypes.SYMBOL; }
    .                                               { return DylanTypes.SYMBOL; }
}

{CRLF}                                              { yybegin(DYLAN_CODE); }
.                                                   { return TokenType.BAD_CHARACTER; }
