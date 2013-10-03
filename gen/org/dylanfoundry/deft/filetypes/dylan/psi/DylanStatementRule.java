// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanStatementRule extends PsiElement {

  @NotNull
  DylanMacroName getMacroName();

  @NotNull
  DylanMaybePatternAndSemicolon getMaybePatternAndSemicolon();

  @NotNull
  DylanRhs getRhs();

}
