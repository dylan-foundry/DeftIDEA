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

public class DylanOperandTailsImpl extends ASTWrapperPsiElement implements DylanOperandTails {

  public DylanOperandTailsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanOperandTail getOperandTail() {
    return findChildByClass(DylanOperandTail.class);
  }

  @Override
  @Nullable
  public DylanOperandTails getOperandTails() {
    return findChildByClass(DylanOperandTails.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitOperandTails(this);
    else super.accept(visitor);
  }

}
