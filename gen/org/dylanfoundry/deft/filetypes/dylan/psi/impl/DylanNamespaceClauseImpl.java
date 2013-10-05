// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;

public class DylanNamespaceClauseImpl extends ASTWrapperPsiElement implements DylanNamespaceClause {

  public DylanNamespaceClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanNamespaceClauseOptions getNamespaceClauseOptions() {
    return findChildByClass(DylanNamespaceClauseOptions.class);
  }

  @Override
  @NotNull
  public List<DylanVariableName> getVariableNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitNamespaceClause(this);
    else super.accept(visitor);
  }

}
