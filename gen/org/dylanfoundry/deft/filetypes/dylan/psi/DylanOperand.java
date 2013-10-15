// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanOperand extends PsiElement {

  @NotNull
  List<DylanArguments> getArgumentsList();

  @NotNull
  DylanLeaf getLeaf();

  @NotNull
  List<DylanVariableName> getVariableNameList();

}
