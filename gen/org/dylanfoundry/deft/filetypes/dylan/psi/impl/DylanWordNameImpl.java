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

public class DylanWordNameImpl extends DylanCompositeElementImpl implements DylanWordName {

  public DylanWordNameImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanReservedWord getReservedWord() {
    return findChildByClass(DylanReservedWord.class);
  }

  @Override
  @Nullable
  public DylanUnreservedName getUnreservedName() {
    return findChildByClass(DylanUnreservedName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitWordName(this);
    else super.accept(visitor);
  }

}
