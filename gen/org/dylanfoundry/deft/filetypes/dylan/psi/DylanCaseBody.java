// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanCaseBody extends PsiElement {

  @Nullable
  DylanCaseTail getCaseTail();

  @Nullable
  DylanExpression getExpression();

  @Nullable
  DylanExpressions getExpressions();

  @Nullable
  DylanNonExpressionConstituent getNonExpressionConstituent();

  @Nullable
  DylanOperandTails getOperandTails();

  @Nullable
  DylanUnparenthesizedExpression getUnparenthesizedExpression();

  @Nullable
  PsiElement getCaseConstiuents();

  @Nullable
  PsiElement getCaseLabel();

}
