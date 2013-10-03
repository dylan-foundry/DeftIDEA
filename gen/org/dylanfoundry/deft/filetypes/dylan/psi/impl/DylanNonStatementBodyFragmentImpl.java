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

public class DylanNonStatementBodyFragmentImpl extends ASTWrapperPsiElement implements DylanNonStatementBodyFragment {

  public DylanNonStatementBodyFragmentImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanDefinition getDefinition() {
    return findChildByClass(DylanDefinition.class);
  }

  @Override
  @Nullable
  public DylanLocalDeclaration getLocalDeclaration() {
    return findChildByClass(DylanLocalDeclaration.class);
  }

  @Override
  @Nullable
  public DylanSimpleFragment getSimpleFragment() {
    return findChildByClass(DylanSimpleFragment.class);
  }

  @Override
  @Nullable
  public PsiElement getBodyFragmentOpt() {
    return findChildByType(BODY_FRAGMENT_OPT);
  }

  @Override
  @Nullable
  public PsiElement getSemicolonFragmentOpt() {
    return findChildByType(SEMICOLON_FRAGMENT_OPT);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitNonStatementBodyFragment(this);
    else super.accept(visitor);
  }

}
