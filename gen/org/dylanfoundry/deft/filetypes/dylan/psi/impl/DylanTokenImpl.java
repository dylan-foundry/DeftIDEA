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

public class DylanTokenImpl extends ASTWrapperPsiElement implements DylanToken {

  public DylanTokenImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanHashWord getHashWord() {
    return findChildByClass(DylanHashWord.class);
  }

  @Override
  @Nullable
  public DylanPunctuation getPunctuation() {
    return findChildByClass(DylanPunctuation.class);
  }

  @Override
  @Nullable
  public DylanString getString() {
    return findChildByClass(DylanString.class);
  }

  @Override
  @Nullable
  public DylanSymbol getSymbol() {
    return findChildByClass(DylanSymbol.class);
  }

  @Override
  @Nullable
  public DylanWordName getWordName() {
    return findChildByClass(DylanWordName.class);
  }

  @Override
  @Nullable
  public PsiElement getOperator() {
    return findChildByType(OPERATOR);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitToken(this);
    else super.accept(visitor);
  }

}
