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

public class DylanReservedWordImpl extends ASTWrapperPsiElement implements DylanReservedWord {

  public DylanReservedWordImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanCoreWord getCoreWord() {
    return findChildByClass(DylanCoreWord.class);
  }

  @Override
  @Nullable
  public DylanDefineBodyWord getDefineBodyWord() {
    return findChildByClass(DylanDefineBodyWord.class);
  }

  @Override
  @Nullable
  public DylanDefineListWord getDefineListWord() {
    return findChildByClass(DylanDefineListWord.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitReservedWord(this);
    else super.accept(visitor);
  }

}
