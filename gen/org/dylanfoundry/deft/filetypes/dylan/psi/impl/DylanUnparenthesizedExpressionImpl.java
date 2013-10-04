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

public class DylanUnparenthesizedExpressionImpl extends ASTWrapperPsiElement implements DylanUnparenthesizedExpression {

  public DylanUnparenthesizedExpressionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanBinaryOperand> getBinaryOperandList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanBinaryOperand.class);
  }

  @Override
  @NotNull
  public List<DylanBinaryOperator> getBinaryOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanBinaryOperator.class);
  }

  @Override
  @NotNull
  public DylanUnparenthesizedBinaryOperand getUnparenthesizedBinaryOperand() {
    return findNotNullChildByClass(DylanUnparenthesizedBinaryOperand.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitUnparenthesizedExpression(this);
    else super.accept(visitor);
  }

}
