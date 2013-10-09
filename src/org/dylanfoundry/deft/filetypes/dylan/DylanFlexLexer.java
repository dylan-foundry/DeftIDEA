package org.dylanfoundry.deft.filetypes.dylan;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class DylanFlexLexer extends FlexAdapter {

  public DylanFlexLexer() {
    super(new _DylanLexer((Reader)null));
  }
}