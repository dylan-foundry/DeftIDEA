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

public class DylanInheritedSlotSpecImpl extends DylanCompositeElementImpl implements DylanInheritedSlotSpec {

  public DylanInheritedSlotSpecImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanInheritedOptions getInheritedOptions() {
    return findChildByClass(DylanInheritedOptions.class);
  }

  @Override
  @Nullable
  public DylanInitExpression getInitExpression() {
    return findChildByClass(DylanInitExpression.class);
  }

  @Override
  @NotNull
  public DylanVariableName getVariableName() {
    return findNotNullChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitInheritedSlotSpec(this);
    else super.accept(visitor);
  }

}
