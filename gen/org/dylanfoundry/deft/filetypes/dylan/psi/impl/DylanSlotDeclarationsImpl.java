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

public class DylanSlotDeclarationsImpl extends DylanCompositeElementImpl implements DylanSlotDeclarations {

  public DylanSlotDeclarationsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanInheritedSlotSpec> getInheritedSlotSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanInheritedSlotSpec.class);
  }

  @Override
  @NotNull
  public List<DylanInitArgSpec> getInitArgSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanInitArgSpec.class);
  }

  @Override
  @NotNull
  public List<DylanSlotSpec> getSlotSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanSlotSpec.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSlotDeclarations(this);
    else super.accept(visitor);
  }

}
