// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanStatement extends PsiElement {

  @Nullable
  DylanBeginStatement getBeginStatement();

  @Nullable
  DylanBeginWord getBeginWord();

  @Nullable
  DylanBlockStatement getBlockStatement();

  @Nullable
  DylanBodyFragment getBodyFragment();

  @Nullable
  DylanCaseStatement getCaseStatement();

  @Nullable
  DylanEndClause getEndClause();

  @Nullable
  DylanForStatement getForStatement();

  @Nullable
  DylanIfStatement getIfStatement();

  @Nullable
  DylanMethodStatement getMethodStatement();

  @Nullable
  DylanSelectStatement getSelectStatement();

  @Nullable
  DylanUnlessStatement getUnlessStatement();

  @Nullable
  DylanUntilStatement getUntilStatement();

  @Nullable
  DylanWhenStatement getWhenStatement();

  @Nullable
  DylanWhileStatement getWhileStatement();

}
