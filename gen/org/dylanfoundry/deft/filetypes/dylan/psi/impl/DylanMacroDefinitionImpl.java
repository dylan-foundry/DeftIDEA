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
  @NotNull
  public DylanMacroName getMacroName() {
    return findNotNullChildByClass(DylanMacroName.class);
  }

  @Override
  @NotNull
  public DylanMainRuleSet getMainRuleSet() {
    return findNotNullChildByClass(DylanMainRuleSet.class);
  }

  @Override
  @NotNull
  public PsiElement getAuxRuleSetsOpt() {
    return findNotNullChildByType(AUX_RULE_SETS_OPT);
  }

  @Override
  @NotNull
  public PsiElement getMacroNameOpt() {
    return findNotNullChildByType(MACRO_NAME_OPT);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitMacroDefinition(this);
    else super.accept(visitor);
  }

}
