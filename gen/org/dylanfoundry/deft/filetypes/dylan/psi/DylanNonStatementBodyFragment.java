// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanNonStatementBodyFragment extends PsiElement {

  @Nullable
  DylanBodyFragment getBodyFragment();

  @Nullable
  DylanBracketedFragment getBracketedFragment();

  @Nullable
  DylanConstantFragment getConstantFragment();

  @Nullable
  DylanDefinition getDefinition();

  @Nullable
  DylanFunctionMacroCall getFunctionMacroCall();

  @Nullable
  DylanHashWord getHashWord();

  @Nullable
  DylanLocalDeclaration getLocalDeclaration();

  @Nullable
  DylanOperator getOperator();

  @Nullable
  DylanSemicolonFragment getSemicolonFragment();

  @Nullable
  DylanVariableName getVariableName();

}
