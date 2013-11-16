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

public class DylanInitArgSpecImpl extends DylanCompositeElementImpl implements DylanInitArgSpec {

  public DylanInitArgSpecImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanInitArgOptions getInitArgOptions() {
    return findChildByClass(DylanInitArgOptions.class);
  }

  @Override
  @Nullable
  public DylanInitExpression getInitExpression() {
    return findChildByClass(DylanInitExpression.class);
  }

  @Override
  @NotNull
  public DylanSymbol getSymbol() {
    return findNotNullChildByClass(DylanSymbol.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitInitArgSpec(this);
    else super.accept(visitor);
  }

}
