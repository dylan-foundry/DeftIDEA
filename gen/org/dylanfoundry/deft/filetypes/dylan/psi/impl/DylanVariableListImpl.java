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

public class DylanVariableListImpl extends DylanCompositeElementImpl implements DylanVariableList {

  public DylanVariableListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanVariable> getVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanVariable.class);
  }

  @Override
  @Nullable
  public DylanVariableName getVariableName() {
    return findChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitVariableList(this);
    else super.accept(visitor);
  }

}
