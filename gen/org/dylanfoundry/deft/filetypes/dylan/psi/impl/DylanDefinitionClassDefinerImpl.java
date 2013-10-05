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

public class DylanDefinitionClassDefinerImpl extends ASTWrapperPsiElement implements DylanDefinitionClassDefiner {

  public DylanDefinitionClassDefinerImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DylanClassDefinitionTail getClassDefinitionTail() {
    return findNotNullChildByClass(DylanClassDefinitionTail.class);
  }

  @Override
  @Nullable
  public DylanModifiers getModifiers() {
    return findChildByClass(DylanModifiers.class);
  }

  @Override
  @Nullable
  public DylanSlotDeclarations getSlotDeclarations() {
    return findChildByClass(DylanSlotDeclarations.class);
  }

  @Override
  @Nullable
  public DylanSupers getSupers() {
    return findChildByClass(DylanSupers.class);
  }

  @Override
  @NotNull
  public DylanVariableName getVariableName() {
    return findNotNullChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinitionClassDefiner(this);
    else super.accept(visitor);
  }

}
