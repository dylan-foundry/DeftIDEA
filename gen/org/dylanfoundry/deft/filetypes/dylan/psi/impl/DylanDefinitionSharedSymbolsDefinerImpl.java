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

public class DylanDefinitionSharedSymbolsDefinerImpl extends DylanDefinitionImpl implements DylanDefinitionSharedSymbolsDefiner {

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
  @Nullable
  public DylanSharedSymbolsDefinitionTail getSharedSymbolsDefinitionTail() {
    return findChildByClass(DylanSharedSymbolsDefinitionTail.class);
  }

  @Override
  @Nullable
  public DylanVariableName getVariableName() {
    return findChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinitionSharedSymbolsDefiner(this);
    else super.accept(visitor);
  }

}
