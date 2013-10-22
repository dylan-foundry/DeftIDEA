// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import javax.swing.Icon;
import com.intellij.navigation.ItemPresentation;

public interface DylanDefinitionLibraryDefiner extends DylanDefinition {

  @NotNull
  List<DylanExportClause> getExportClauseList();

  @NotNull
  DylanLibraryDefinitionTail getLibraryDefinitionTail();

  @NotNull
  List<DylanUseClause> getUseClauseList();

  @NotNull
  DylanVariableName getVariableName();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  Icon getPresentationIcon();

  ItemPresentation getPresentation();

}
