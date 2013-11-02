// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes.*;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;

public class DylanMacroStatementImpl extends DylanStatementImpl implements DylanMacroStatement {

  public DylanMacroStatementImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DylanBeginWord getBeginWord() {
    return findNotNullChildByClass(DylanBeginWord.class);
  }

  @Override
  @Nullable
  public DylanBody getBody() {
    return findChildByClass(DylanBody.class);
  }

  @Override
  @Nullable
  public DylanBracketedFragment getBracketedFragment() {
    return findChildByClass(DylanBracketedFragment.class);
  }

  @Override
  @NotNull
  public DylanEndClause getEndClause() {
    return findNotNullChildByClass(DylanEndClause.class);
  }

  @Override
  @Nullable
  public DylanVariableName getVariableName() {
    return findChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitMacroStatement(this);
    else super.accept(visitor);
  }

}
