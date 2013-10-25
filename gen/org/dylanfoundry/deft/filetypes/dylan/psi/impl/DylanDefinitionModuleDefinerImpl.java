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

public class DylanDefinitionModuleDefinerImpl extends DylanDefinitionImpl implements DylanDefinitionModuleDefiner {

  public DylanDefinitionModuleDefinerImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DylanCreateClause> getCreateClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanCreateClause.class);
  }

  @Override
  @NotNull
  public List<DylanExportClause> getExportClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanExportClause.class);
  }

  @Override
  @Nullable
  public DylanModuleDefinitionTail getModuleDefinitionTail() {
    return findChildByClass(DylanModuleDefinitionTail.class);
  }

  @Override
  @NotNull
  public List<DylanUseClause> getUseClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanUseClause.class);
  }

  @Override
  @Nullable
  public DylanVariableName getVariableName() {
    return findChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinitionModuleDefiner(this);
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
