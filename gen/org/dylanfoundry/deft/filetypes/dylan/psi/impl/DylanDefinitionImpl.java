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
import com.intellij.navigation.ItemPresentation;

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
  public DylanDefinitionFunctionDefiner getDefinitionFunctionDefiner() {
    return findChildByClass(DylanDefinitionFunctionDefiner.class);
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
  public DylanDefinitionSuiteDefiner getDefinitionSuiteDefiner() {
    return findChildByClass(DylanDefinitionSuiteDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionTableDefiner getDefinitionTableDefiner() {
    return findChildByClass(DylanDefinitionTableDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionTestDefiner getDefinitionTestDefiner() {
    return findChildByClass(DylanDefinitionTestDefiner.class);
  }

  @Override
  @Nullable
  public DylanDefinitionVariableDefiner getDefinitionVariableDefiner() {
    return findChildByClass(DylanDefinitionVariableDefiner.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinition(this);
    else super.accept(visitor);
  }

  public ItemPresentation getPresentation() {
    return DylanPsiImplUtil.getPresentation(this);
  }

}
