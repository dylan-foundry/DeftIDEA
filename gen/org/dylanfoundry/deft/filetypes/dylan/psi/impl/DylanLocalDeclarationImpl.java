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

public class DylanLocalDeclarationImpl extends DylanCompositeElementImpl implements DylanLocalDeclaration {

  public DylanLocalDeclarationImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBindings getBindings() {
    return findChildByClass(DylanBindings.class);
  }

  @Override
  @Nullable
  public DylanCondition getCondition() {
    return findChildByClass(DylanCondition.class);
  }

  @Override
  @Nullable
  public DylanHandler getHandler() {
    return findChildByClass(DylanHandler.class);
  }

  @Override
  @Nullable
  public DylanLocalMethods getLocalMethods() {
    return findChildByClass(DylanLocalMethods.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitLocalDeclaration(this);
    else super.accept(visitor);
  }

}
