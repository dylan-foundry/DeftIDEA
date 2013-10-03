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

public class DylanLocalMethodsImpl extends ASTWrapperPsiElement implements DylanLocalMethods {

  public DylanLocalMethodsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanLocalMethods getLocalMethods() {
    return findChildByClass(DylanLocalMethods.class);
  }

  @Override
  @NotNull
  public DylanMethodDefinition getMethodDefinition() {
    return findNotNullChildByClass(DylanMethodDefinition.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitLocalMethods(this);
    else super.accept(visitor);
  }

}
