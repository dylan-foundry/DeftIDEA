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

public class DylanNameStringOrSymbolImpl extends DylanCompositeElementImpl implements DylanNameStringOrSymbol {

  public DylanNameStringOrSymbolImpl(ASTNode node) {
    super(node);
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

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitNameStringOrSymbol(this);
    else super.accept(visitor);
  }

}
