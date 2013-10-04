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

public class DylanMacroDefinitionImpl extends ASTWrapperPsiElement implements DylanMacroDefinition {

  public DylanMacroDefinitionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanAuxRuleSets getAuxRuleSets() {
    return findChildByClass(DylanAuxRuleSets.class);
  }

  @Override
  @NotNull
  public List<DylanMacroName> getMacroNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanMacroName.class);
  }

  @Override
  @NotNull
  public DylanMainRuleSet getMainRuleSet() {
    return findNotNullChildByClass(DylanMainRuleSet.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitMacroDefinition(this);
    else super.accept(visitor);
  }

}
