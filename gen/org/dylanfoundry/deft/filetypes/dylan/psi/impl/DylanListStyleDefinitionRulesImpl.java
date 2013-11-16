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

public class DylanListStyleDefinitionRulesImpl extends DylanCompositeElementImpl implements DylanListStyleDefinitionRules {

  public DylanListStyleDefinitionRulesImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanListStyleDefinitionRule> getListStyleDefinitionRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanListStyleDefinitionRule.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitListStyleDefinitionRules(this);
    else super.accept(visitor);
  }

}
