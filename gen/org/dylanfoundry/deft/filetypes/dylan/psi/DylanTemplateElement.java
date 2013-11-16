// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanTemplateElement extends DylanCompositeElement {

  @Nullable
  DylanHashWord getHashWord();

  @Nullable
  DylanNondefiningBeginWordToken getNondefiningBeginWordToken();

  @Nullable
  DylanSeparator getSeparator();

  @Nullable
  DylanString getString();

  @Nullable
  DylanSubstitution getSubstitution();

  @Nullable
  DylanSymbol getSymbol();

  @Nullable
  DylanTemplate getTemplate();

  @Nullable
  DylanUnaryOperatorOnly getUnaryOperatorOnly();

  @Nullable
  DylanWordName getWordName();

}
