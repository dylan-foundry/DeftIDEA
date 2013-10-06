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

public class DylanConstantFragmentImpl extends ASTWrapperPsiElement implements DylanConstantFragment {

  public DylanConstantFragmentImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanConstant getConstant() {
    return findChildByClass(DylanConstant.class);
  }

  @Override
  @Nullable
  public DylanConstants getConstants() {
    return findChildByClass(DylanConstants.class);
  }

  @Override
  @Nullable
  public DylanString getString() {
    return findChildByClass(DylanString.class);
  }

  @Override
  @Nullable
  public DylanSymbol getSymbol() {
    return findChildByClass(DylanSymbol.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitConstantFragment(this);
    else super.accept(visitor);
  }

}
