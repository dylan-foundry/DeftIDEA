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

public class DylanCaseConstituentsImpl extends ASTWrapperPsiElement implements DylanCaseConstituents {

  public DylanCaseConstituentsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanCaseTail getCaseTail() {
    return findChildByClass(DylanCaseTail.class);
  }

  @Override
  @Nullable
  public DylanDefinition getDefinition() {
    return findChildByClass(DylanDefinition.class);
  }

  @Override
  @Nullable
  public DylanExpression getExpression() {
    return findChildByClass(DylanExpression.class);
  }

  @Override
  @Nullable
  public DylanLocalDeclaration getLocalDeclaration() {
    return findChildByClass(DylanLocalDeclaration.class);
  }

  @Override
  @Nullable
  public DylanUnparenthesizedExpression getUnparenthesizedExpression() {
    return findChildByClass(DylanUnparenthesizedExpression.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitCaseConstituents(this);
    else super.accept(visitor);
  }

}
