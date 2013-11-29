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

public class DylanBasicFragmentImpl extends DylanCompositeElementImpl implements DylanBasicFragment {

  public DylanBasicFragmentImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanNonStatementBasicFragment getNonStatementBasicFragment() {
    return findChildByClass(DylanNonStatementBasicFragment.class);
  }

  @Override
  @Nullable
  public DylanStatement getStatement() {
    return findChildByClass(DylanStatement.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitBasicFragment(this);
    else super.accept(visitor);
  }

}
