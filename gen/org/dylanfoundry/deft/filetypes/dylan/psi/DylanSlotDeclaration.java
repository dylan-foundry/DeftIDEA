// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanSlotDeclaration extends PsiElement {

  @Nullable
  DylanExpression getExpression();

  @Nullable
  DylanInitSpecifications getInitSpecifications();

  @Nullable
  DylanModifiers getModifiers();

  @NotNull
  DylanSemicolonFragment getSemicolonFragment();

  @NotNull
  DylanVariable getVariable();

}
