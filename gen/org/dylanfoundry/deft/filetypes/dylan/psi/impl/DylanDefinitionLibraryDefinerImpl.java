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

public class DylanDefinitionLibraryDefinerImpl extends ASTWrapperPsiElement implements DylanDefinitionLibraryDefiner {

  public DylanDefinitionLibraryDefinerImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DylanLibraryDefinitionTail getLibraryDefinitionTail() {
    return findNotNullChildByClass(DylanLibraryDefinitionTail.class);
  }

  @Override
  @Nullable
  public DylanModifiers getModifiers() {
    return findChildByClass(DylanModifiers.class);
  }

  @Override
  @Nullable
  public DylanNamespaceClauses getNamespaceClauses() {
    return findChildByClass(DylanNamespaceClauses.class);
  }

  @Override
  @NotNull
  public DylanVariableName getVariableName() {
    return findNotNullChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinitionLibraryDefiner(this);
    else super.accept(visitor);
  }

}
