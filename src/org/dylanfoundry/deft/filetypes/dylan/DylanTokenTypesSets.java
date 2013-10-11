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

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes;

public interface DylanTokenTypesSets {
  IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
  IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;

  TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
  TokenSet COMMENTS = TokenSet.create(DylanTypes.COMMENT);

  TokenSet HASH_WORD = TokenSet.create(
    DylanTypes.HASH_T,
    DylanTypes.HASH_F,
    DylanTypes.HASH_NEXT,
    DylanTypes.HASH_REST,
    DylanTypes.HASH_KEY,
    DylanTypes.HASH_ALL_KEYS
  );

  TokenSet OPERATOR = TokenSet.create(
    DylanTypes.UNARY_AND_BINARY_OPERATOR,
    DylanTypes.BINARY_OPERATOR_ONLY,
    DylanTypes.UNARY_OPERATOR_ONLY
  );

  TokenSet RESERVED = TokenSet.create(
    DylanTypes.DEFINE,
    DylanTypes.END,
    DylanTypes.NONDEFINING_BEGIN_WORD,
    DylanTypes.LET,
    DylanTypes.BEGIN,
    DylanTypes.BLOCK,
    DylanTypes.AFTERWARDS,
    DylanTypes.CLEANUP,
    DylanTypes.EXCEPTION,
    DylanTypes.FOR,
    DylanTypes.THEN,
    DylanTypes.IN,
    DylanTypes.USING,
    DylanTypes.FROM,
    DylanTypes.TO,
    DylanTypes.ABOVE,
    DylanTypes.BELOW,
    DylanTypes.BY,
    DylanTypes.KEYED_BY,
    DylanTypes.FINALLY,
    DylanTypes.IF,
    DylanTypes.ELSEIF,
    DylanTypes.ELSE,
    DylanTypes.METHOD,
    DylanTypes.UNLESS,
    DylanTypes.UNTIL,
    DylanTypes.WHEN,
    DylanTypes.WHILE
  );
}
