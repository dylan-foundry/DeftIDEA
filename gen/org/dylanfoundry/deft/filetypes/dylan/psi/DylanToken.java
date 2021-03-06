// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanToken extends DylanCompositeElement {

  @Nullable
  DylanHashWord getHashWord();

  @Nullable
  DylanOperator getOperator();

  @Nullable
  DylanPunctuation getPunctuation();

  @Nullable
  DylanString getString();

  @Nullable
  DylanSymbol getSymbol();

  @Nullable
  DylanWordName getWordName();

}
