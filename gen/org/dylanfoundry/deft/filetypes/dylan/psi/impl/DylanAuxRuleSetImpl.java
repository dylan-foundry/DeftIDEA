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

public class DylanAuxRuleSetImpl extends DylanCompositeElementImpl implements DylanAuxRuleSet {

  public DylanAuxRuleSetImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DylanAuxRules getAuxRules() {
    return findNotNullChildByClass(DylanAuxRules.class);
  }

  @Override
  @NotNull
  public DylanSymbol getSymbol() {
    return findNotNullChildByClass(DylanSymbol.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitAuxRuleSet(this);
    else super.accept(visitor);
  }

}
