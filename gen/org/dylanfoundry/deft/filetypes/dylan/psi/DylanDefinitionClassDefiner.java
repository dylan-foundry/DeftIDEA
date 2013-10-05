// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanDefinitionClassDefiner extends PsiElement {

  @NotNull
  DylanClassDefinitionTail getClassDefinitionTail();

  @Nullable
  DylanModifiers getModifiers();

  @Nullable
  DylanSlotDeclarations getSlotDeclarations();

  @Nullable
  DylanSupers getSupers();

  @NotNull
  DylanVariableName getVariableName();

}
