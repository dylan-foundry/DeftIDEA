// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import javax.swing.Icon;
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
  DylanStatement getStatement();

  @Nullable
  DylanVariableName getVariableName();

  @Nullable
  PsiElement getOperator();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  Icon getPresentationIcon();

  ItemPresentation getPresentation();

}
