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

public class DylanNextRestKeyParameterListImpl extends ASTWrapperPsiElement implements DylanNextRestKeyParameterList {

  public DylanNextRestKeyParameterListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanRestKeyParameterList getRestKeyParameterList() {
    return findChildByClass(DylanRestKeyParameterList.class);
  }

  @Override
  @Nullable
  public DylanVariableName getVariableName() {
    return findChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitNextRestKeyParameterList(this);
    else super.accept(visitor);
  }

}
