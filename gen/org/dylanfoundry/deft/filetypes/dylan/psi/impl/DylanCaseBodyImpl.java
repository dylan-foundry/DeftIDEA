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

public class DylanCaseBodyImpl extends ASTWrapperPsiElement implements DylanCaseBody {

  public DylanCaseBodyImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DylanCaseConstituents getCaseConstituents() {
    return findNotNullChildByClass(DylanCaseConstituents.class);
  }

  @Override
  @NotNull
  public DylanCaseLabel getCaseLabel() {
    return findNotNullChildByClass(DylanCaseLabel.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitCaseBody(this);
    else super.accept(visitor);
  }

}
