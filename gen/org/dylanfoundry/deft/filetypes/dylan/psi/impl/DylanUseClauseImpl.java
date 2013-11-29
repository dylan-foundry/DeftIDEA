// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes.*;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;

public class DylanUseClauseImpl extends DylanCompositeElementImpl implements DylanUseClause {

  public DylanUseClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanClauseOption> getClauseOptionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanClauseOption.class);
  }

  @Override
  @NotNull
  public DylanOrdinaryBindingName getOrdinaryBindingName() {
    return findNotNullChildByClass(DylanOrdinaryBindingName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitUseClause(this);
    else super.accept(visitor);
  }

}
