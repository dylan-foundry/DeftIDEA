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

public class DylanMainRuleSetImpl extends ASTWrapperPsiElement implements DylanMainRuleSet {

  public DylanMainRuleSetImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBodyStyleDefinitionRules getBodyStyleDefinitionRules() {
    return findChildByClass(DylanBodyStyleDefinitionRules.class);
  }

  @Override
  @Nullable
  public DylanFunctionRules getFunctionRules() {
    return findChildByClass(DylanFunctionRules.class);
  }

  @Override
  @Nullable
  public DylanListStyleDefinitionRules getListStyleDefinitionRules() {
    return findChildByClass(DylanListStyleDefinitionRules.class);
  }

  @Override
  @Nullable
  public DylanStatementRules getStatementRules() {
    return findChildByClass(DylanStatementRules.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitMainRuleSet(this);
    else super.accept(visitor);
  }

}
