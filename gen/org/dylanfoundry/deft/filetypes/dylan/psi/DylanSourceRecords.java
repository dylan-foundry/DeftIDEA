// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanSourceRecords extends PsiElement {

  @Nullable
  DylanCaseBody getCaseBody();

  @NotNull
  List<DylanDefinition> getDefinitionList();

  @NotNull
  List<DylanExpression> getExpressionList();

  @NotNull
  List<DylanLocalDeclaration> getLocalDeclarationList();

  @Nullable
  DylanMacro getMacro();

  @Nullable
  DylanToken getToken();

  @Nullable
  DylanVariable getVariable();

  @Nullable
  DylanWordName getWordName();

}
