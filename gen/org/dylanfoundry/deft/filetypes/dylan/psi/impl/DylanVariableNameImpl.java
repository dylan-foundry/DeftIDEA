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
import com.intellij.psi.PsiReference;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.ResolveState;

public class DylanVariableNameImpl extends DylanCompositeElementImpl implements DylanVariableName {

  public DylanVariableNameImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanEscapedName getEscapedName() {
    return findChildByClass(DylanEscapedName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitVariableName(this);
    else super.accept(visitor);
  }

  @Nullable
  public PsiReference getReference() {
    return DylanPsiImplUtil.getReference(this);
  }

  public boolean processDeclarations(PsiScopeProcessor processor, ResolveState state, PsiElement lastParent, PsiElement place) {
    return DylanPsiImplUtil.processDeclarations(this, processor, state, lastParent, place);
  }

}
