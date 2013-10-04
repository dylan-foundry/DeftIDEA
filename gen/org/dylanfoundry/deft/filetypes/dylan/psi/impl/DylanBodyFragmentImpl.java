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

public class DylanBodyFragmentImpl extends ASTWrapperPsiElement implements DylanBodyFragment {

  public DylanBodyFragmentImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanNonStatementBodyFragment getNonStatementBodyFragment() {
    return findChildByClass(DylanNonStatementBodyFragment.class);
  }

  @Override
  @Nullable
  public DylanStatement getStatement() {
    return findChildByClass(DylanStatement.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitBodyFragment(this);
    else super.accept(visitor);
  }

}
