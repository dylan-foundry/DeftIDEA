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

public class DylanListStyleDefinitionRuleImpl extends DylanCompositeElementImpl implements DylanListStyleDefinitionRule {

  public DylanListStyleDefinitionRuleImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DylanPattern getPattern() {
    return findNotNullChildByClass(DylanPattern.class);
  }

  @Override
  @NotNull
  public DylanRhs getRhs() {
    return findNotNullChildByClass(DylanRhs.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitListStyleDefinitionRule(this);
    else super.accept(visitor);
  }

}
