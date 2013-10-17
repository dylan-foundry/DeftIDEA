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

public class DylanSelectStatementImpl extends DylanStatementImpl implements DylanSelectStatement {

  public DylanSelectStatementImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanExpression.class);
  }

  @Override
  @NotNull
  public List<DylanSelectStmtClause> getSelectStmtClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanSelectStmtClause.class);
  }

  @Override
  @NotNull
  public DylanSelectStmtTail getSelectStmtTail() {
    return findNotNullChildByClass(DylanSelectStmtTail.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSelectStatement(this);
    else super.accept(visitor);
  }

}
