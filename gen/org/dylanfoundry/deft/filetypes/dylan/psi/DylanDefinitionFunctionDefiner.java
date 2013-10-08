// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface DylanDefinitionFunctionDefiner extends DylanDefiner {

  @NotNull
  DylanBodyFragment getBodyFragment();

  @NotNull
  DylanFunctionDefinitionTail getFunctionDefinitionTail();

  @Nullable
  DylanModifiers getModifiers();

  @NotNull
  DylanVariableName getVariableName();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
