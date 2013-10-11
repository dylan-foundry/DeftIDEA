// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanBeginStatement extends PsiElement {

  @NotNull
  List<DylanDefinition> getDefinitionList();

  @NotNull
  List<DylanExpression> getExpressionList();

  @NotNull
  List<DylanLocalDeclaration> getLocalDeclarationList();

}
