// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanSlotSpec extends PsiElement {

  @Nullable
  DylanAllocation getAllocation();

  @Nullable
  DylanInitExpression getInitExpression();

  @Nullable
  DylanOperandExpr getOperandExpr();

  @NotNull
  List<DylanSlotAdjective> getSlotAdjectiveList();

  @Nullable
  DylanSlotOptions getSlotOptions();

  @NotNull
  DylanVariableName getVariableName();

}
