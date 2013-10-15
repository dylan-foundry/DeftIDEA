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

public class DylanLtExprImpl extends DylanExprImpl implements DylanLtExpr {

  public DylanLtExprImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanExpr.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitLtExpr(this);
    else super.accept(visitor);
  }

}
