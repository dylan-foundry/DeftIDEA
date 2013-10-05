// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanNamespaceClauses extends PsiElement {

  @NotNull
  List<DylanNamespaceClause> getNamespaceClauseList();

  @NotNull
  List<DylanSemicolonFragment> getSemicolonFragmentList();

}
