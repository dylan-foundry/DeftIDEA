// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanDefinitionFunctionDefiner extends PsiElement {

  @NotNull
  DylanBodyFragment getBodyFragment();

  @NotNull
  DylanFunctionDefinitionTail getFunctionDefinitionTail();

  @Nullable
  DylanModifiers getModifiers();

  @NotNull
  DylanVariableName getVariableName();

}
