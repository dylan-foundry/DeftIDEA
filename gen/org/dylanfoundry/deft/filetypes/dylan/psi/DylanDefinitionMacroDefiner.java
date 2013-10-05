// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanDefinitionMacroDefiner extends PsiElement {

  @NotNull
  DylanMacroDefinitionTail getMacroDefinitionTail();

  @Nullable
  DylanMainRuleSet getMainRuleSet();

  @Nullable
  DylanModifiers getModifiers();

  @NotNull
  DylanVariableName getVariableName();

}
