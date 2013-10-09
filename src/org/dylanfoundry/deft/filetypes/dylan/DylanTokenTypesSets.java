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
    DylanTypes.LET
  );
}
