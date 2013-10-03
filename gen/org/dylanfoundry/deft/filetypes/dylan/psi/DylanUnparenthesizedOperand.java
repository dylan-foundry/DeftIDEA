// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanUnparenthesizedOperand extends PsiElement {

  @Nullable
  DylanOperandTail getOperandTail();

  @Nullable
  DylanUnparenthesizedLeaf getUnparenthesizedLeaf();

  @Nullable
  DylanUnparenthesizedOperand getUnparenthesizedOperand();

}
