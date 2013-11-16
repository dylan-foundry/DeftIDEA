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

public class DylanBinaryOperatorImpl extends DylanCompositeElementImpl implements DylanBinaryOperator {

  public DylanBinaryOperatorImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBinaryOperatorOnly getBinaryOperatorOnly() {
    return findChildByClass(DylanBinaryOperatorOnly.class);
  }

  @Override
  @Nullable
  public DylanUnaryAndBinaryOperator getUnaryAndBinaryOperator() {
    return findChildByClass(DylanUnaryAndBinaryOperator.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitBinaryOperator(this);
    else super.accept(visitor);
  }

}
