package org.dylanfoundry.deft.filetypes.dylan;

import com.intellij.lexer.LookAheadLexer;
import com.intellij.lexer.MergingLexerAdapter;
import com.intellij.psi.tree.TokenSet;

import static org.dylanfoundry.deft.filetypes.dylan.DylanTokenTypesSets.WHITE_SPACE;

public class DylanLexer extends LookAheadLexer {
  private static final TokenSet tokensToMerge = TokenSet.create(WHITE_SPACE);

  public DylanLexer() {
    super(new MergingLexerAdapter(new DylanFlexLexer(), tokensToMerge));
  }

}
