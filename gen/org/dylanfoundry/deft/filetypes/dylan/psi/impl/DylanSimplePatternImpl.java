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

public class DylanSimplePatternImpl extends DylanCompositeElementImpl implements DylanSimplePattern {

  public DylanSimplePatternImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBindingPattern getBindingPattern() {
    return findChildByClass(DylanBindingPattern.class);
  }

  @Override
  @Nullable
  public DylanBracketedPattern getBracketedPattern() {
    return findChildByClass(DylanBracketedPattern.class);
  }

  @Override
  @Nullable
  public DylanNameNotEnd getNameNotEnd() {
    return findChildByClass(DylanNameNotEnd.class);
  }

  @Override
  @Nullable
  public DylanPatternVariable getPatternVariable() {
    return findChildByClass(DylanPatternVariable.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSimplePattern(this);
    else super.accept(visitor);
  }

}
