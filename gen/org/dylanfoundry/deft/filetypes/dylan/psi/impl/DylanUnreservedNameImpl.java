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

public class DylanUnreservedNameImpl extends DylanCompositeElementImpl implements DylanUnreservedName {

  public DylanUnreservedNameImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanDylanUnreservedName getDylanUnreservedName() {
    return findChildByClass(DylanDylanUnreservedName.class);
  }

  @Override
  @Nullable
  public DylanEscapedName getEscapedName() {
    return findChildByClass(DylanEscapedName.class);
  }

  @Override
  @Nullable
  public DylanUnreservedWord getUnreservedWord() {
    return findChildByClass(DylanUnreservedWord.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitUnreservedName(this);
    else super.accept(visitor);
  }

}
