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

public class DylanPatternListImpl extends DylanCompositeElementImpl implements DylanPatternList {

  public DylanPatternListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanPatternList getPatternList() {
    return findChildByClass(DylanPatternList.class);
  }

  @Override
  @Nullable
  public DylanPatternSequence getPatternSequence() {
    return findChildByClass(DylanPatternSequence.class);
  }

  @Override
  @Nullable
  public DylanPropertyListPattern getPropertyListPattern() {
    return findChildByClass(DylanPropertyListPattern.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitPatternList(this);
    else super.accept(visitor);
  }

}
