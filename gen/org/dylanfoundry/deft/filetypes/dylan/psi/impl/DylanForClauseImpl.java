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

public class DylanForClauseImpl extends DylanCompositeElementImpl implements DylanForClause {

  public DylanForClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanCollectionClause getCollectionClause() {
    return findChildByClass(DylanCollectionClause.class);
  }

  @Override
  @Nullable
  public DylanExplicitStepClause getExplicitStepClause() {
    return findChildByClass(DylanExplicitStepClause.class);
  }

  @Override
  @Nullable
  public DylanKeyedByClause getKeyedByClause() {
    return findChildByClass(DylanKeyedByClause.class);
  }

  @Override
  @Nullable
  public DylanNumericClauses getNumericClauses() {
    return findChildByClass(DylanNumericClauses.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitForClause(this);
    else super.accept(visitor);
  }

}
