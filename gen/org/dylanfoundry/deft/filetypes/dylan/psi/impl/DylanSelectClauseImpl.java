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

public class DylanSelectClauseImpl extends ASTWrapperPsiElement implements DylanSelectClause {

  public DylanSelectClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanSelectConstituents getSelectConstituents() {
    return findChildByClass(DylanSelectConstituents.class);
  }

  @Override
  @NotNull
  public DylanSelectLabel getSelectLabel() {
    return findNotNullChildByClass(DylanSelectLabel.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSelectClause(this);
    else super.accept(visitor);
  }

}
