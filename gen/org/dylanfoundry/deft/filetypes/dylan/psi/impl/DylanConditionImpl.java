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

public class DylanConditionImpl extends ASTWrapperPsiElement implements DylanCondition {

  public DylanConditionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanOperand getOperand() {
    return findChildByClass(DylanOperand.class);
  }

  @Override
  @Nullable
  public DylanOperandTails getOperandTails() {
    return findChildByClass(DylanOperandTails.class);
  }

  @Override
  @Nullable
  public DylanPropertyList getPropertyList() {
    return findChildByClass(DylanPropertyList.class);
  }

  @Override
  @Nullable
  public DylanUnparenthesizedOperand getUnparenthesizedOperand() {
    return findChildByClass(DylanUnparenthesizedOperand.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitCondition(this);
    else super.accept(visitor);
  }

}
