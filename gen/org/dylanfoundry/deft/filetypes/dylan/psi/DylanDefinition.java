// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface DylanDefinition extends PsiElement {

  @Nullable
  DylanDefinitionClassDefiner getDefinitionClassDefiner();

  @Nullable
  DylanDefinitionConstantDefiner getDefinitionConstantDefiner();

  @Nullable
  DylanDefinitionCopyDownMethodDefiner getDefinitionCopyDownMethodDefiner();

  @Nullable
  DylanDefinitionDomainDefiner getDefinitionDomainDefiner();

  @Nullable
  DylanDefinitionFunctionDefiner getDefinitionFunctionDefiner();

  @Nullable
  DylanDefinitionGenericDefiner getDefinitionGenericDefiner();

  @Nullable
  DylanDefinitionLibraryDefiner getDefinitionLibraryDefiner();

  @Nullable
  DylanDefinitionMacroCall getDefinitionMacroCall();

  @Nullable
  DylanDefinitionMacroDefiner getDefinitionMacroDefiner();

  @Nullable
  DylanDefinitionMethodDefiner getDefinitionMethodDefiner();

  @Nullable
  DylanDefinitionModuleDefiner getDefinitionModuleDefiner();

  @Nullable
  DylanDefinitionSharedSymbolsDefiner getDefinitionSharedSymbolsDefiner();

  @Nullable
  DylanDefinitionSuiteDefiner getDefinitionSuiteDefiner();

  @Nullable
  DylanDefinitionTableDefiner getDefinitionTableDefiner();

  @Nullable
  DylanDefinitionTestDefiner getDefinitionTestDefiner();

  @Nullable
  DylanDefinitionVariableDefiner getDefinitionVariableDefiner();

  ItemPresentation getPresentation();

}
