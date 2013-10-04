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

public class DylanUnparenthesizedOperandImpl extends ASTWrapperPsiElement implements DylanUnparenthesizedOperand {

  public DylanUnparenthesizedOperandImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanOperandTail> getOperandTailList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanOperandTail.class);
  }

  @Override
  @NotNull
  public DylanUnparenthesizedLeaf getUnparenthesizedLeaf() {
    return findNotNullChildByClass(DylanUnparenthesizedLeaf.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitUnparenthesizedOperand(this);
    else super.accept(visitor);
  }

}
