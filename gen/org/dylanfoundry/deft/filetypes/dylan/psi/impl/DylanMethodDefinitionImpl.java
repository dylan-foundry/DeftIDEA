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

public class DylanMethodDefinitionImpl extends ASTWrapperPsiElement implements DylanMethodDefinition {

  public DylanMethodDefinitionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBody getBody() {
    return findChildByClass(DylanBody.class);
  }

  @Override
  @NotNull
  public DylanMethodDefinitionTail getMethodDefinitionTail() {
    return findNotNullChildByClass(DylanMethodDefinitionTail.class);
  }

  @Override
  @NotNull
  public DylanParameterList getParameterList() {
    return findNotNullChildByClass(DylanParameterList.class);
  }

  @Override
  @NotNull
  public DylanVariableName getVariableName() {
    return findNotNullChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitMethodDefinition(this);
    else super.accept(visitor);
  }

}
