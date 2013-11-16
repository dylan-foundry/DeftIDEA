package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanCompositeElement;
import org.jetbrains.annotations.NotNull;

public class DylanCompositeElementImpl extends ASTWrapperPsiElement implements DylanCompositeElement {
  public DylanCompositeElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public String toString() {
    return getNode().getElementType().toString();
  }

  @Override
  public boolean processDeclarations(@NotNull PsiScopeProcessor processor, @NotNull ResolveState state,
                                     PsiElement lastParent, @NotNull PsiElement place) {
    if (!processor.execute(this, state)) {
      return false;
    } else {
      return ResolveUtil.processChildren(this, processor, state, lastParent, place);
    }
  }
}
