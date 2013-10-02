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

public class LIDItemsImpl extends ASTWrapperPsiElement implements LIDItems {

  public LIDItemsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<LIDItem> getItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LIDItem.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LIDVisitor) ((LIDVisitor)visitor).visitItems(this);
    else super.accept(visitor);
  }

}
