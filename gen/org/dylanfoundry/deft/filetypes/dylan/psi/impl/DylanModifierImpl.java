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

public class DylanModifierImpl extends DylanCompositeElementImpl implements DylanModifier {

  public DylanModifierImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DylanNondefiningName getNondefiningName() {
    return findNotNullChildByClass(DylanNondefiningName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitModifier(this);
    else super.accept(visitor);
  }

}
