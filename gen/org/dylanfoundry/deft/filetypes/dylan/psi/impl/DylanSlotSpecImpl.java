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

public class DylanSlotSpecImpl extends DylanCompositeElementImpl implements DylanSlotSpec {

  public DylanSlotSpecImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanAllocation getAllocation() {
    return findChildByClass(DylanAllocation.class);
  }

  @Override
  @Nullable
  public DylanInitExpression getInitExpression() {
    return findChildByClass(DylanInitExpression.class);
  }

  @Override
  @Nullable
  public DylanOperandExpr getOperandExpr() {
    return findChildByClass(DylanOperandExpr.class);
  }

  @Override
  @NotNull
  public List<DylanSlotAdjective> getSlotAdjectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanSlotAdjective.class);
  }

  @Override
  @Nullable
  public DylanSlotOptions getSlotOptions() {
    return findChildByClass(DylanSlotOptions.class);
  }

  @Override
  @NotNull
  public DylanVariableName getVariableName() {
    return findNotNullChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSlotSpec(this);
    else super.accept(visitor);
  }

}
