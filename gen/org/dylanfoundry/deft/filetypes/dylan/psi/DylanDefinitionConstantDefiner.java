// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface DylanDefinitionConstantDefiner extends DylanDefiner {

  @Nullable
  DylanBracketedFragment getBracketedFragment();

  @Nullable
  DylanConstantFragment getConstantFragment();

  @Nullable
  DylanFunctionMacroCall getFunctionMacroCall();

  @Nullable
  DylanHashWord getHashWord();

  @Nullable
  DylanModifiers getModifiers();

  @Nullable
  DylanOperator getOperator();

  @Nullable
  DylanStatement getStatement();

  @Nullable
  DylanVariableName getVariableName();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
