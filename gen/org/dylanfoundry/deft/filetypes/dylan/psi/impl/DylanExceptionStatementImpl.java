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

public class DylanExceptionStatementImpl extends DylanStatementImpl implements DylanExceptionStatement {

  public DylanExceptionStatementImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBody getBody() {
    return findChildByClass(DylanBody.class);
  }

  @Override
  @NotNull
  public List<DylanExceptionOptions> getExceptionOptionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanExceptionOptions.class);
  }

  @Override
  @NotNull
  public DylanVariable getVariable() {
    return findNotNullChildByClass(DylanVariable.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitExceptionStatement(this);
    else super.accept(visitor);
  }

}
