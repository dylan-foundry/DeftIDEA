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

public class DylanFunctionMacroCallImpl extends DylanCompositeElementImpl implements DylanFunctionMacroCall {

  public DylanFunctionMacroCallImpl(ASTNode node) {
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
  public DylanDefinition getDefinition() {
    return findChildByClass(DylanDefinition.class);
  }

  @Override
  @Nullable
  public DylanFunctionMacroCall getFunctionMacroCall() {
    return findChildByClass(DylanFunctionMacroCall.class);
  }

  @Override
  @NotNull
  public DylanFunctionWord getFunctionWord() {
    return findNotNullChildByClass(DylanFunctionWord.class);
  }

  @Override
  @Nullable
  public DylanHashWord getHashWord() {
    return findChildByClass(DylanHashWord.class);
  }

  @Override
  @Nullable
  public DylanLocalDeclaration getLocalDeclaration() {
    return findChildByClass(DylanLocalDeclaration.class);
  }

  @Override
  @Nullable
  public DylanOperator getOperator() {
    return findChildByClass(DylanOperator.class);
  }

  @Override
  @Nullable
  public DylanSemicolonFragment getSemicolonFragment() {
    return findChildByClass(DylanSemicolonFragment.class);
  }

  @Override
  @Nullable
  public DylanStatement getStatement() {
    return findChildByClass(DylanStatement.class);
  }

  @Override
  @Nullable
  public DylanVariableName getVariableName() {
    return findChildByClass(DylanVariableName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitFunctionMacroCall(this);
    else super.accept(visitor);
  }

}
