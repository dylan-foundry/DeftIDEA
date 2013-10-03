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

public class DylanNonStatementListFragmentImpl extends ASTWrapperPsiElement implements DylanNonStatementListFragment {

  public DylanNonStatementListFragmentImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanSimpleFragment getSimpleFragment() {
    return findChildByClass(DylanSimpleFragment.class);
  }

  @Override
  @Nullable
  public PsiElement getListFragmentOpt() {
    return findChildByType(LIST_FRAGMENT_OPT);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitNonStatementListFragment(this);
    else super.accept(visitor);
  }

}
