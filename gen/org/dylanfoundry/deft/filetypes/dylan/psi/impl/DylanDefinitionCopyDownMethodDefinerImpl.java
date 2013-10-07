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

public class DylanDefinitionCopyDownMethodDefinerImpl extends DylanNamedElementImpl implements DylanDefinitionCopyDownMethodDefiner {

  public DylanDefinitionCopyDownMethodDefinerImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanBracketedFragment getBracketedFragment() {
    return findChildByClass(DylanBracketedFragment.class);
  }

  @Override
  @Nullable
  public DylanConstantFragment getConstantFragment() {
    return findChildByClass(DylanConstantFragment.class);
  }

  @Override
  @Nullable
  public DylanFunctionMacroCall getFunctionMacroCall() {
    return findChildByClass(DylanFunctionMacroCall.class);
  }

  @Override
  @Nullable
  public DylanHashWord getHashWord() {
    return findChildByClass(DylanHashWord.class);
  }

  @Override
  @Nullable
  public DylanModifiers getModifiers() {
    return findChildByClass(DylanModifiers.class);
  }

  @Override
  @Nullable
  public DylanOperator getOperator() {
    return findChildByClass(DylanOperator.class);
  }

  @Override
  @Nullable
  public DylanStatement getStatement() {
    return findChildByClass(DylanStatement.class);
  }

  @Override
  @NotNull
  public List<DylanVariableName> getVariableNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitDefinitionCopyDownMethodDefiner(this);
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

}
