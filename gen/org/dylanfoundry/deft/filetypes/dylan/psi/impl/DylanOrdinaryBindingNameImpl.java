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

public class DylanOrdinaryBindingNameImpl extends DylanCompositeElementImpl implements DylanOrdinaryBindingName {

  public DylanOrdinaryBindingNameImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanEscapedName getEscapedName() {
    return findChildByClass(DylanEscapedName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitOrdinaryBindingName(this);
    else super.accept(visitor);
  }

}
