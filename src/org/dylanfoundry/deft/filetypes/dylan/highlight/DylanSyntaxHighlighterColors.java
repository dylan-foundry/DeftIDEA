package org.dylanfoundry.deft.filetypes.dylan.highlight;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;


import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class DylanSyntaxHighlighterColors {
  public static final String DYLAN_SEPARATOR = "DYLAN_SEPARATOR";
  public static final String DYLAN_HEADER_KEY = "DYLAN_HEADER_KEY";
  public static final String DYLAN_HEADER_VALUE = "DYLAN_HEADER_VALUE";
  public static final String DYLAN_COMMENT = "DYLAN_COMMENT";
  public static final String DYLAN_NUMBER = "DYLAN_NUMBER";
  public static final String DYLAN_IDENTIFIER = "DYLAN_IDENTIFIER";
  public static final String DYLAN_CHARACTER = "DYLAN_CHARACTER";
  public static final String DYLAN_ESCAPE_CHARACTER = "DYLAN_ESCAPE_CHARACTER";
  public static final String DYLAN_STRING = "DYLAN_STRING";
  public static final String DYLAN_BAD_CHARACTER = "DYLAN_BAD_CHARACTER";
  public static final String DYLAN_HASH_WORD = "DYLAN_HASH_WORD";
  public static final String DYLAN_SYMBOL = "DYLAN_SYMBOL";
  public static final String DYLAN_OPERATOR = "DYLAN_OPERATOR";
  public static final String DYLAN_KEYWORD = "DYLAN_KEYWORD";
  public static final String DYLAN_PAREN = "DYLAN_PAREN";
  public static final String DYLAN_BRACKET = "DYLAN_BRACKET";
  public static final String DYLAN_BRACE = "DYLAN_BRACE";
  public static final String DYLAN_SEMICOLON = "DYLAN_SEMICOLON";
  public static final String DYLAN_DOT = "DYLAN_DOT";


  public static final TextAttributesKey SEPARATOR =
    createTextAttributesKey(DYLAN_SEPARATOR, DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey HEADER_KEY =
    createTextAttributesKey(DYLAN_HEADER_KEY, DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey HEADER_VALUE =
    createTextAttributesKey(DYLAN_HEADER_VALUE, DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey COMMENT =
    createTextAttributesKey(DYLAN_COMMENT, DefaultLanguageHighlighterColors.LINE_COMMENT);
  public static final TextAttributesKey NUMBER =
    createTextAttributesKey(DYLAN_NUMBER, DefaultLanguageHighlighterColors.NUMBER);
  public static final TextAttributesKey IDENTIFIER =
    createTextAttributesKey(DYLAN_IDENTIFIER, DefaultLanguageHighlighterColors.IDENTIFIER);
  public static final TextAttributesKey CHARACTER =
    createTextAttributesKey(DYLAN_CHARACTER, DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey ESCAPE_CHARACTER =
    createTextAttributesKey(DYLAN_ESCAPE_CHARACTER, DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE);
  public static final TextAttributesKey STRING =
    createTextAttributesKey(DYLAN_STRING, DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey HASH_WORD =
    createTextAttributesKey(DYLAN_HASH_WORD, DefaultLanguageHighlighterColors.LABEL);
  public static final TextAttributesKey SYMBOL =
    createTextAttributesKey(DYLAN_SYMBOL, DefaultLanguageHighlighterColors.CONSTANT);
  public static final TextAttributesKey OPERATOR =
    createTextAttributesKey(DYLAN_OPERATOR, DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey KEYWORD =
    createTextAttributesKey(DYLAN_KEYWORD, DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey PAREN =
    createTextAttributesKey(DYLAN_PAREN, DefaultLanguageHighlighterColors.PARENTHESES);
  public static final TextAttributesKey BRACKET =
    createTextAttributesKey(DYLAN_BRACKET, DefaultLanguageHighlighterColors.BRACKETS);
  public static final TextAttributesKey BRACE =
    createTextAttributesKey(DYLAN_BRACE, DefaultLanguageHighlighterColors.BRACES);
  public static final TextAttributesKey SEMICOLON =
    createTextAttributesKey(DYLAN_SEMICOLON, DefaultLanguageHighlighterColors.SEMICOLON);
  public static final TextAttributesKey DOT =
    createTextAttributesKey(DYLAN_DOT, DefaultLanguageHighlighterColors.DOT);

  public static final TextAttributesKey BAD_CHARACTER =
    createTextAttributesKey(DYLAN_BAD_CHARACTER, HighlighterColors.BAD_CHARACTER);
}
