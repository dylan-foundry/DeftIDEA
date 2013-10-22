// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanIfStatement extends DylanStatement {

  @Nullable
  DylanBody getBody();

  @Nullable
  DylanExpression getExpression();

  @Nullable
  DylanIfTail getIfTail();

  @NotNull
  List<DylanStatement> getStatementList();

}
