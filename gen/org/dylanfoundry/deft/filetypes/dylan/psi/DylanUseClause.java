// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanUseClause extends PsiElement {

  @NotNull
  List<DylanClauseOption> getClauseOptionList();

  @Nullable
  DylanEscapedName getEscapedName();

  @Nullable
  DylanNonexpressionWord getNonexpressionWord();

}
