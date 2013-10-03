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

public class LIDItemKeyImpl extends ASTWrapperPsiElement implements LIDItemKey {

  public LIDItemKeyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LIDVisitor) ((LIDVisitor)visitor).visitItemKey(this);
    else super.accept(visitor);
  }

}
