// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;

public class DylanStatementImpl extends ASTWrapperPsiElement implements DylanStatement {

  public DylanStatementImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBeginStatement getBeginStatement() {
    return findChildByClass(DylanBeginStatement.class);
  }

  @Override
  @Nullable
  public DylanBeginWord getBeginWord() {
    return findChildByClass(DylanBeginWord.class);
  }

  @Override
  @Nullable
  public DylanBlockStatement getBlockStatement() {
    return findChildByClass(DylanBlockStatement.class);
  }

  @Override
  @Nullable
  public DylanBodyFragment getBodyFragment() {
    return findChildByClass(DylanBodyFragment.class);
  }

  @Override
  @Nullable
  public DylanCaseStatement getCaseStatement() {
    return findChildByClass(DylanCaseStatement.class);
  }

  @Override
  @Nullable
  public DylanEndClause getEndClause() {
    return findChildByClass(DylanEndClause.class);
  }

  @Override
  @Nullable
  public DylanForStatement getForStatement() {
    return findChildByClass(DylanForStatement.class);
  }

  @Override
  @Nullable
  public DylanIfStatement getIfStatement() {
    return findChildByClass(DylanIfStatement.class);
  }

  @Override
  @Nullable
  public DylanMethodStatement getMethodStatement() {
    return findChildByClass(DylanMethodStatement.class);
  }

  @Override
  @Nullable
  public DylanSelectStatement getSelectStatement() {
    return findChildByClass(DylanSelectStatement.class);
  }

  @Override
  @Nullable
  public DylanUnlessStatement getUnlessStatement() {
    return findChildByClass(DylanUnlessStatement.class);
  }

  @Override
  @Nullable
  public DylanUntilStatement getUntilStatement() {
    return findChildByClass(DylanUntilStatement.class);
  }

  @Override
  @Nullable
  public DylanWhenStatement getWhenStatement() {
    return findChildByClass(DylanWhenStatement.class);
  }

  @Override
  @Nullable
  public DylanWhileStatement getWhileStatement() {
    return findChildByClass(DylanWhileStatement.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitStatement(this);
    else super.accept(visitor);
  }

}
