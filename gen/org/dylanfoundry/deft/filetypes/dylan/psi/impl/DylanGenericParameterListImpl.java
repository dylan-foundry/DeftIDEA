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

public class DylanGenericParameterListImpl extends DylanCompositeElementImpl implements DylanGenericParameterList {

  public DylanGenericParameterListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanGenericParameters getGenericParameters() {
    return findChildByClass(DylanGenericParameters.class);
  }

  @Override
  @Nullable
  public DylanValuesList getValuesList() {
    return findChildByClass(DylanValuesList.class);
  }

  @Override
  @Nullable
  public DylanVariable getVariable() {
    return findChildByClass(DylanVariable.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitGenericParameterList(this);
    else super.accept(visitor);
  }

}
