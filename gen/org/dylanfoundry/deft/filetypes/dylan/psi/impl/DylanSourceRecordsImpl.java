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

public class DylanSourceRecordsImpl extends ASTWrapperPsiElement implements DylanSourceRecords {

  public DylanSourceRecordsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanCaseBody getCaseBody() {
    return findChildByClass(DylanCaseBody.class);
  }

  @Override
  @NotNull
  public List<DylanDefinition> getDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanDefinition.class);
  }

  @Override
  @NotNull
  public List<DylanExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanExpression.class);
  }

  @Override
  @NotNull
  public List<DylanLocalDeclaration> getLocalDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DylanLocalDeclaration.class);
  }

  @Override
  @Nullable
  public DylanMacro getMacro() {
    return findChildByClass(DylanMacro.class);
  }

  @Override
  @Nullable
  public DylanToken getToken() {
    return findChildByClass(DylanToken.class);
  }

  @Override
  @Nullable
  public DylanVariable getVariable() {
    return findChildByClass(DylanVariable.class);
  }

  @Override
  @Nullable
  public DylanWordName getWordName() {
    return findChildByClass(DylanWordName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSourceRecords(this);
    else super.accept(visitor);
  }

}
