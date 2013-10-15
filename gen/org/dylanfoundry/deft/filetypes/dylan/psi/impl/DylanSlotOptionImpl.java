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

public class DylanSlotOptionImpl extends ASTWrapperPsiElement implements DylanSlotOption {

  public DylanSlotOptionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanInitFunctionOption getInitFunctionOption() {
    return findChildByClass(DylanInitFunctionOption.class);
  }

  @Override
  @Nullable
  public DylanInitKeywordOption getInitKeywordOption() {
    return findChildByClass(DylanInitKeywordOption.class);
  }

  @Override
  @Nullable
  public DylanInitValueOption getInitValueOption() {
    return findChildByClass(DylanInitValueOption.class);
  }

  @Override
  @Nullable
  public DylanRequiredInitKeywordOption getRequiredInitKeywordOption() {
    return findChildByClass(DylanRequiredInitKeywordOption.class);
  }

  @Override
  @Nullable
  public DylanSetterOption getSetterOption() {
    return findChildByClass(DylanSetterOption.class);
  }

  @Override
  @Nullable
  public DylanTypeOption getTypeOption() {
    return findChildByClass(DylanTypeOption.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSlotOption(this);
    else super.accept(visitor);
  }

}
