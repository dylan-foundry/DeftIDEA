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

public class DylanForStatementImpl extends ASTWrapperPsiElement implements DylanForStatement {

  public DylanForStatementImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanDefinition> getDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanDefinition.class);
  }

  @Override
  @NotNull
  public List<DylanExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanExpression.class);
  }

  @Override
  @Nullable
  public DylanFinallyClause getFinallyClause() {
    return findChildByClass(DylanFinallyClause.class);
  }

  @Override
  @NotNull
  public DylanForClauses getForClauses() {
    return findNotNullChildByClass(DylanForClauses.class);
  }

  @Override
  @NotNull
  public List<DylanLocalDeclaration> getLocalDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanLocalDeclaration.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitForStatement(this);
    else super.accept(visitor);
  }

}
