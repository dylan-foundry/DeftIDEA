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

public class DylanWhenStatementImpl extends DylanStatementImpl implements DylanWhenStatement {

  public DylanWhenStatementImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBody getBody() {
    return findChildByClass(DylanBody.class);
  }

  @Override
  @NotNull
  public DylanExpression getExpression() {
    return findNotNullChildByClass(DylanExpression.class);
  }

  @Override
  @NotNull
  public DylanWhenTail getWhenTail() {
    return findNotNullChildByClass(DylanWhenTail.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitWhenStatement(this);
    else super.accept(visitor);
  }

}
