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

public class DylanUnparenthesizedBinaryOperandImpl extends ASTWrapperPsiElement implements DylanUnparenthesizedBinaryOperand {

  public DylanUnparenthesizedBinaryOperandImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanOperand getOperand() {
    return findChildByClass(DylanOperand.class);
  }

  @Override
  @Nullable
  public DylanSymbol getSymbol() {
    return findChildByClass(DylanSymbol.class);
  }

  @Override
  @Nullable
  public DylanUnaryOperator getUnaryOperator() {
    return findChildByClass(DylanUnaryOperator.class);
  }

  @Override
  @Nullable
  public DylanUnparenthesizedOperand getUnparenthesizedOperand() {
    return findChildByClass(DylanUnparenthesizedOperand.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitUnparenthesizedBinaryOperand(this);
    else super.accept(visitor);
  }

}
