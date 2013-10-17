// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanSelectStatement extends DylanStatement {

  @NotNull
  List<DylanExpression> getExpressionList();

  @NotNull
  List<DylanSelectStmtClause> getSelectStmtClauseList();

  @NotNull
  DylanSelectStmtTail getSelectStmtTail();

}
