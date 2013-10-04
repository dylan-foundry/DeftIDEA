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

public class DylanSubstitutionImpl extends ASTWrapperPsiElement implements DylanSubstitution {

  public DylanSubstitutionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanNamePrefix getNamePrefix() {
    return findChildByClass(DylanNamePrefix.class);
  }

  @Override
  @Nullable
  public DylanNameStringOrSymbol getNameStringOrSymbol() {
    return findChildByClass(DylanNameStringOrSymbol.class);
  }

  @Override
  @Nullable
  public DylanNameSuffix getNameSuffix() {
    return findChildByClass(DylanNameSuffix.class);
  }

  @Override
  @Nullable
  public DylanSeparator getSeparator() {
    return findChildByClass(DylanSeparator.class);
  }

  @Override
  @Nullable
  public DylanWordName getWordName() {
    return findChildByClass(DylanWordName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSubstitution(this);
    else super.accept(visitor);
  }

}
