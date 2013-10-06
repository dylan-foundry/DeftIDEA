// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanUnparenthesizedBinaryOperand extends PsiElement {

  @Nullable
  DylanOperand getOperand();

  @Nullable
  DylanSymbol getSymbol();

  @Nullable
  DylanUnaryOperator getUnaryOperator();

  @Nullable
  DylanUnparenthesizedOperand getUnparenthesizedOperand();

}
