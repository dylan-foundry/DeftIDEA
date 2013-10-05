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

public class DylanDefinitionSharedSymbolsDefinerImpl extends ASTWrapperPsiElement implements DylanDefinitionSharedSymbolsDefiner {

  public DylanDefinitionSharedSymbolsDefinerImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanModifiers getModifiers() {
    return findChildByClass(DylanModifiers.class);
  }

  @Override
  @Nullable
  public DylanSharedSymbols getSharedSymbols() {
    return findChildByClass(DylanSharedSymbols.class);
  }

  @Override
  @NotNull
  public DylanSharedSymbolsDefinitionTail getSharedSymbolsDefinitionTail() {
    return findNotNullChildByClass(DylanSharedSymbolsDefinitionTail.class);
  }

  @Override
  @NotNull
  public DylanVariableName getVariableName() {
    return findNotNullChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinitionSharedSymbolsDefiner(this);
    else super.accept(visitor);
  }

}
