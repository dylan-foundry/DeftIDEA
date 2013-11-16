// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanOperand extends DylanCompositeElement {

  @NotNull
  List<DylanArguments> getArgumentsList();

  @Nullable
  DylanExpression getExpression();

  @Nullable
  DylanFunctionMacroCall getFunctionMacroCall();

  @Nullable
  DylanLiteral getLiteral();

  @Nullable
  DylanStatement getStatement();

  @NotNull
  List<DylanVariableName> getVariableNameList();

}
