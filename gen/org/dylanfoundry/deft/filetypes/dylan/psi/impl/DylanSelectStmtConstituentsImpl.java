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

public class DylanSelectStmtConstituentsImpl extends DylanCompositeElementImpl implements DylanSelectStmtConstituents {

  public DylanSelectStmtConstituentsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanSelectStmtConstituent> getSelectStmtConstituentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanSelectStmtConstituent.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSelectStmtConstituents(this);
    else super.accept(visitor);
  }

}
