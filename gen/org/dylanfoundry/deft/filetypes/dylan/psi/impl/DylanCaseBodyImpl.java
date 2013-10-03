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

public class DylanCaseBodyImpl extends ASTWrapperPsiElement implements DylanCaseBody {

  public DylanCaseBodyImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanCaseTail getCaseTail() {
    return findChildByClass(DylanCaseTail.class);
  }

  @Override
  @Nullable
  public DylanExpression getExpression() {
    return findChildByClass(DylanExpression.class);
  }

  @Override
  @Nullable
  public DylanExpressions getExpressions() {
    return findChildByClass(DylanExpressions.class);
  }

  @Override
  @Nullable
  public DylanNonExpressionConstituent getNonExpressionConstituent() {
    return findChildByClass(DylanNonExpressionConstituent.class);
  }

  @Override
  @Nullable
  public DylanOperandTails getOperandTails() {
    return findChildByClass(DylanOperandTails.class);
  }

  @Override
  @Nullable
  public DylanUnparenthesizedExpression getUnparenthesizedExpression() {
    return findChildByClass(DylanUnparenthesizedExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getCaseConstiuents() {
    return findChildByType(CASE_CONSTIUENTS);
  }

  @Override
  @Nullable
  public PsiElement getCaseLabel() {
    return findChildByType(CASE_LABEL);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitCaseBody(this);
    else super.accept(visitor);
  }

}
