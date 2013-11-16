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

public class DylanPunctuationImpl extends DylanCompositeElementImpl implements DylanPunctuation {

  public DylanPunctuationImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBracketingPunctuation getBracketingPunctuation() {
    return findChildByClass(DylanBracketingPunctuation.class);
  }

  @Override
  @Nullable
  public DylanNonBracketingPunctuation getNonBracketingPunctuation() {
    return findChildByClass(DylanNonBracketingPunctuation.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitPunctuation(this);
    else super.accept(visitor);
  }

}
