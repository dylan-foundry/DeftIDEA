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
  public DylanDefinitionClassDefiner getDefinitionClassDefiner() {
    return findChildByClass(DylanDefinitionClassDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionConstantDefiner getDefinitionConstantDefiner() {
    return findChildByClass(DylanDefinitionConstantDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionCopyDownMethodDefiner getDefinitionCopyDownMethodDefiner() {
    return findChildByClass(DylanDefinitionCopyDownMethodDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionDomainDefiner getDefinitionDomainDefiner() {
    return findChildByClass(DylanDefinitionDomainDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionGenericDefiner getDefinitionGenericDefiner() {
    return findChildByClass(DylanDefinitionGenericDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionLibraryDefiner getDefinitionLibraryDefiner() {
    return findChildByClass(DylanDefinitionLibraryDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionMacroCall getDefinitionMacroCall() {
    return findChildByClass(DylanDefinitionMacroCall.class);
  }

  @Override
  @Nullable
  public DylanDefinitionMacroDefiner getDefinitionMacroDefiner() {
    return findChildByClass(DylanDefinitionMacroDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionMethodDefiner getDefinitionMethodDefiner() {
    return findChildByClass(DylanDefinitionMethodDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionModuleDefiner getDefinitionModuleDefiner() {
    return findChildByClass(DylanDefinitionModuleDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionSharedSymbolsDefiner getDefinitionSharedSymbolsDefiner() {
    return findChildByClass(DylanDefinitionSharedSymbolsDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionVariableDefiner getDefinitionVariableDefiner() {
    return findChildByClass(DylanDefinitionVariableDefiner.class);
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
