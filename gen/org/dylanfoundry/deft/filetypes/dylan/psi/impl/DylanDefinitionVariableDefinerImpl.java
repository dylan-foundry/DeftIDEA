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
import javax.swing.Icon;
import com.intellij.navigation.ItemPresentation;

public class DylanDefinitionVariableDefinerImpl extends DylanDefinitionImpl implements DylanDefinitionVariableDefiner {

  public DylanDefinitionVariableDefinerImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanExpression getExpression() {
    return findChildByClass(DylanExpression.class);
  }

  @Override
  @Nullable
  public DylanModifiers getModifiers() {
    return findChildByClass(DylanModifiers.class);
  }

  @Override
  @Nullable
  public DylanVariable getVariable() {
    return findChildByClass(DylanVariable.class);
  }

  @Override
  @Nullable
  public DylanVariableList getVariableList() {
    return findChildByClass(DylanVariableList.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinitionVariableDefiner(this);
    else super.accept(visitor);
  }

  public String getName() {
    return DylanPsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return DylanPsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return DylanPsiImplUtil.getNameIdentifier(this);
  }

  public Icon getPresentationIcon() {
    return DylanPsiImplUtil.getPresentationIcon(this);
  }

  public ItemPresentation getPresentation() {
    return DylanPsiImplUtil.getPresentation(this);
  }

}
