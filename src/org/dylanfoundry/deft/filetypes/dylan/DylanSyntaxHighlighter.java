/*
 * Copyright 2013, Bruce Mitchener, Jr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dylanfoundry.deft.filetypes.dylan;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.io.Reader;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class DylanSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY = createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE = createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey NUMBER = createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey CHARACTER = createTextAttributesKey("CHARACTER", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey STRING = createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey SHARP_WORD = createTextAttributesKey("SHARP_WORD", DefaultLanguageHighlighterColors.LABEL);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BUILTIN = createTextAttributesKey("BUILTIN", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey PUNCTUATION = createTextAttributesKey("PUNCTUATION", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey FUNCTION = createTextAttributesKey("FUNCTION", DefaultLanguageHighlighterColors.FUNCTION_CALL);
    public static final TextAttributesKey SYMBOL = createTextAttributesKey("SYMBOL", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey CLASS_NAME = createTextAttributesKey("CLASS", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey CONSTANT = createTextAttributesKey("CONSTANT", DefaultLanguageHighlighterColors.CONSTANT);


    static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER",
            new TextAttributes(Color.RED, null, null, null, Font.BOLD));

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] CHARACTER_KEYS = new TextAttributesKey[]{CHARACTER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] SHARP_WORD_KEYS = new TextAttributesKey[]{SHARP_WORD};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] BUILTIN_KEYS = new TextAttributesKey[]{BUILTIN};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] PUNCTUATION_KEYS = new TextAttributesKey[]{PUNCTUATION};
    private static final TextAttributesKey[] FUNCTION_KEYS = new TextAttributesKey[]{FUNCTION};
    private static final TextAttributesKey[] SYMBOL_KEYS = new TextAttributesKey[]{SYMBOL};
    private static final TextAttributesKey[] CLASS_NAME_KEYS = new TextAttributesKey[]{CLASS_NAME};
    private static final TextAttributesKey[] CONSTANT_KEYS = new TextAttributesKey[]{CONSTANT};

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new DylanLexer((Reader) null));
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(DylanTypes.SEPARATOR)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(DylanTypes.KEY)) {
            return KEY_KEYS;
        } else if (tokenType.equals(DylanTypes.VALUE)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(DylanTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(DylanTypes.NUMBER)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(DylanTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(DylanTypes.CHARACTER)) {
            return CHARACTER_KEYS;
        } else if (tokenType.equals(DylanTypes.STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(DylanTypes.SHARP_WORD)) {
            return SHARP_WORD_KEYS;
        } else if (tokenType.equals(DylanTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(DylanTypes.BUILTIN)) {
            return BUILTIN_KEYS;
        } else if (tokenType.equals(DylanTypes.OPERATOR)) {
            return OPERATOR_KEYS;
        } else if (tokenType.equals(DylanTypes.PUNCTUATION)) {
            return PUNCTUATION_KEYS;
        } else if (tokenType.equals(DylanTypes.FUNCTION)) {
            return FUNCTION_KEYS;
        } else if (tokenType.equals(DylanTypes.SYMBOL)) {
            return SYMBOL_KEYS;
        } else if (tokenType.equals(DylanTypes.CLASS)) {
            return CLASS_NAME_KEYS;
        } else if (tokenType.equals(DylanTypes.CONSTANT)) {
            return CONSTANT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
