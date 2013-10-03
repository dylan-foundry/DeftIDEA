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

public class DylanParameterListImpl extends ASTWrapperPsiElement implements DylanParameterList {

  public DylanParameterListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanVariable getVariable() {
    return findChildByClass(DylanVariable.class);
  }

  @Override
  @Nullable
  public PsiElement getParametersOpt() {
    return findChildByType(PARAMETERS_OPT);
  }

  @Override
  @Nullable
  public PsiElement getSemicolonOpt() {
    return findChildByType(SEMICOLON_OPT);
  }

  @Override
  @Nullable
  public PsiElement getValuesListOpt() {
    return findChildByType(VALUES_LIST_OPT);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitParameterList(this);
    else super.accept(visitor);
  }

}
