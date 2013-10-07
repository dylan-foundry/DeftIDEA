// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;
import com.intellij.navigation.ItemPresentation;

public class DylanDefinitionDomainDefinerImpl extends DylanDefinerImpl implements DylanDefinitionDomainDefiner {

  public DylanDefinitionDomainDefinerImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DylanBracketedFragment getBracketedFragment() {
    return findNotNullChildByClass(DylanBracketedFragment.class);
  }

  @Override
  @Nullable
  public DylanModifiers getModifiers() {
    return findChildByClass(DylanModifiers.class);
  }

  @Override
  @NotNull
  public DylanVariableName getVariableName() {
    return findNotNullChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinitionDomainDefiner(this);
    else super.accept(visitor);
  }

  public String getName() {
    return DylanPsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return DylanPsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return DylanPsiImplUtil.getNameIdentifier(this);
  }

  public ItemPresentation getPresentation() {
    return DylanPsiImplUtil.getPresentation(this);
  }

}
