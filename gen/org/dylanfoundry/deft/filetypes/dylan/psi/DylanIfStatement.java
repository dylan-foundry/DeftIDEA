// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanIfStatement extends PsiElement {

  @NotNull
  List<DylanDefinition> getDefinitionList();

  @Nullable
  DylanElseStatement getElseStatement();

  @NotNull
  List<DylanElseifStatement> getElseifStatementList();

  @NotNull
  List<DylanExpression> getExpressionList();

  @NotNull
  DylanIfTail getIfTail();

  @NotNull
  List<DylanLocalDeclaration> getLocalDeclarationList();

}
