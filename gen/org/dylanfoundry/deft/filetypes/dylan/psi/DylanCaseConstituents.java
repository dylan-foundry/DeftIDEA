// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanCaseConstituents extends PsiElement {

  @Nullable
  DylanCaseTail getCaseTail();

  @Nullable
  DylanDefinition getDefinition();

  @Nullable
  DylanExpression getExpression();

  @Nullable
  DylanLocalDeclaration getLocalDeclaration();

  @Nullable
  DylanUnparenthesizedExpression getUnparenthesizedExpression();

}
