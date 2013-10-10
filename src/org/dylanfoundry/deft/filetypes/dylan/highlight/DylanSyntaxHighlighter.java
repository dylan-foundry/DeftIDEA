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

package org.dylanfoundry.deft.filetypes.dylan.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.dylanfoundry.deft.filetypes.dylan.DylanLexer;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static org.dylanfoundry.deft.filetypes.dylan.DylanTokenTypesSets.*;

public class DylanSyntaxHighlighter extends SyntaxHighlighterBase {
  private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();

  static {
    fillMap(ATTRIBUTES, COMMENTS, DylanSyntaxHighlighterColors.COMMENT);
    fillMap(ATTRIBUTES, HASH_WORD, DylanSyntaxHighlighterColors.HASH_WORD);
    fillMap(ATTRIBUTES, OPERATOR, DylanSyntaxHighlighterColors.OPERATOR);
    fillMap(ATTRIBUTES, RESERVED, DylanSyntaxHighlighterColors.KEYWORD);

    ATTRIBUTES.put(DylanTypes.KEY, DylanSyntaxHighlighterColors.HEADER_KEY);
    ATTRIBUTES.put(DylanTypes.HEADER_SEPARATOR, DylanSyntaxHighlighterColors.SEPARATOR);
    ATTRIBUTES.put(DylanTypes.VALUE, DylanSyntaxHighlighterColors.HEADER_VALUE);
    ATTRIBUTES.put(DylanTypes.NUMBER, DylanSyntaxHighlighterColors.NUMBER);
    ATTRIBUTES.put(DylanTypes.CHARACTER_LITERAL, DylanSyntaxHighlighterColors.CHARACTER);
    ATTRIBUTES.put(DylanTypes.STRING_ESCAPE_CHARACTER, DylanSyntaxHighlighterColors.ESCAPE_CHARACTER);
    ATTRIBUTES.put(DylanTypes.STRING_CHARACTER, DylanSyntaxHighlighterColors.STRING);

    ATTRIBUTES.put(DylanTypes.LPAREN, DylanSyntaxHighlighterColors.PAREN);
    ATTRIBUTES.put(DylanTypes.RPAREN, DylanSyntaxHighlighterColors.PAREN);

    ATTRIBUTES.put(DylanTypes.LBRACKET, DylanSyntaxHighlighterColors.BRACKET);
    ATTRIBUTES.put(DylanTypes.RBRACKET, DylanSyntaxHighlighterColors.BRACKET);

    ATTRIBUTES.put(DylanTypes.LBRACE, DylanSyntaxHighlighterColors.BRACE);
    ATTRIBUTES.put(DylanTypes.RBRACE, DylanSyntaxHighlighterColors.BRACE);

    ATTRIBUTES.put(DylanTypes.SEMICOLON, DylanSyntaxHighlighterColors.SEMICOLON);
    ATTRIBUTES.put(DylanTypes.DOT, DylanSyntaxHighlighterColors.DOT);

    ATTRIBUTES.put(BAD_CHARACTER, DylanSyntaxHighlighterColors.BAD_CHARACTER);
  }

  @NotNull
  @Override
  public Lexer getHighlightingLexer() {
    return new DylanLexer();
  }

  @NotNull
  @Override
  public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
    return pack(ATTRIBUTES.get(tokenType));
  }
}
