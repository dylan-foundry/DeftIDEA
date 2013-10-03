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

public class DylanDefinitionImpl extends ASTWrapperPsiElement implements DylanDefinition {

  public DylanDefinitionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanDefinitionMacroCall getDefinitionMacroCall() {
    return findChildByClass(DylanDefinitionMacroCall.class);
  }

  @Override
  @Nullable
  public DylanMacroDefinition getMacroDefinition() {
    return findChildByClass(DylanMacroDefinition.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinition(this);
    else super.accept(visitor);
  }

}
