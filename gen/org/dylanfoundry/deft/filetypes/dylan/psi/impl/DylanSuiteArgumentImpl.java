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

public class DylanSuiteArgumentImpl extends ASTWrapperPsiElement implements DylanSuiteArgument {

  public DylanSuiteArgumentImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DylanSuiteArgumentCleanupFunction getSuiteArgumentCleanupFunction() {
    return findChildByClass(DylanSuiteArgumentCleanupFunction.class);
  }

  @Override
  @Nullable
  public DylanSuiteArgumentDescription getSuiteArgumentDescription() {
    return findChildByClass(DylanSuiteArgumentDescription.class);
  }

  @Override
  @Nullable
  public DylanSuiteArgumentSetupFunction getSuiteArgumentSetupFunction() {
    return findChildByClass(DylanSuiteArgumentSetupFunction.class);
  }

  @Override
  @Nullable
  public DylanSuiteTestTags getSuiteTestTags() {
    return findChildByClass(DylanSuiteTestTags.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DylanVisitor) ((DylanVisitor)visitor).visitSuiteArgument(this);
    else super.accept(visitor);
  }

}
