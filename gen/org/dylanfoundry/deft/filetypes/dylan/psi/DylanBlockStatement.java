// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanBlockStatement extends PsiElement {

  @Nullable
  DylanAfterwardsStatement getAfterwardsStatement();

  @Nullable
  DylanBlockTail getBlockTail();

  @Nullable
  DylanCleanupStatement getCleanupStatement();

  @NotNull
  List<DylanDefinition> getDefinitionList();

  @NotNull
  List<DylanExceptionStatement> getExceptionStatementList();

  @NotNull
  List<DylanExpression> getExpressionList();

  @NotNull
  List<DylanLocalDeclaration> getLocalDeclarationList();

  @Nullable
  DylanVariableName getVariableName();

}
