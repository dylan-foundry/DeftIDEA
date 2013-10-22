// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import javax.swing.Icon;
import com.intellij.navigation.ItemPresentation;

public interface DylanDefinitionVariableDefiner extends DylanDefinition {

  @NotNull
  DylanExpression getExpression();

  @Nullable
  DylanModifiers getModifiers();

  @Nullable
  DylanVariable getVariable();

  @Nullable
  DylanVariableList getVariableList();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  Icon getPresentationIcon();

  ItemPresentation getPresentation();

}
