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

public class DylanArgumentsImpl extends ASTWrapperPsiElement implements DylanArguments {

  public DylanArgumentsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DylanArgument getArgument() {
    return findNotNullChildByClass(DylanArgument.class);
  }

  @Override
  @Nullable
  public DylanArguments getArguments() {
    return findChildByClass(DylanArguments.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitArguments(this);
    else super.accept(visitor);
  }

}
