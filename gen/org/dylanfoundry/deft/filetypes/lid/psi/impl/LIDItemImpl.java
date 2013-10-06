// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.lid.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dylanfoundry.deft.filetypes.lid.psi.LIDTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.dylanfoundry.deft.filetypes.lid.psi.*;

public class LIDItemImpl extends ASTWrapperPsiElement implements LIDItem {

  public LIDItemImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public LIDValues getValues() {
    return findNotNullChildByClass(LIDValues.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LIDVisitor) ((LIDVisitor)visitor).visitItem(this);
    else super.accept(visitor);
  }

  public String getKey() {
    return LIDPsiImplUtil.getKey(this);
  }

}
