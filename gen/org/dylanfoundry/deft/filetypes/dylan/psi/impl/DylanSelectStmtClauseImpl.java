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

public class DylanSelectStmtClauseImpl extends ASTWrapperPsiElement implements DylanSelectStmtClause {

  public DylanSelectStmtClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanSelectStmtConstituents getSelectStmtConstituents() {
    return findChildByClass(DylanSelectStmtConstituents.class);
  }

  @Override
  @NotNull
  public DylanSelectStmtLabel getSelectStmtLabel() {
    return findNotNullChildByClass(DylanSelectStmtLabel.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSelectStmtClause(this);
    else super.accept(visitor);
  }

}
