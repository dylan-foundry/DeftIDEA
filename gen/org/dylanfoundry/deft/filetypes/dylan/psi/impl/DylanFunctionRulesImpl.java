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

public class DylanFunctionRulesImpl extends DylanCompositeElementImpl implements DylanFunctionRules {

  public DylanFunctionRulesImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanFunctionRule> getFunctionRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanFunctionRule.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitFunctionRules(this);
    else super.accept(visitor);
  }

}
