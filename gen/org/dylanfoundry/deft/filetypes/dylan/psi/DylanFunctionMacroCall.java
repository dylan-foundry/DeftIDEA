// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanFunctionMacroCall extends PsiElement {

  @Nullable
  DylanBracketedFragment getBracketedFragment();

  @Nullable
  DylanConstantFragment getConstantFragment();

  @Nullable
  DylanDefinition getDefinition();

  @Nullable
  DylanFunctionMacroCall getFunctionMacroCall();

  @NotNull
  DylanFunctionWord getFunctionWord();

  @Nullable
  DylanHashWord getHashWord();

  @Nullable
  DylanLocalDeclaration getLocalDeclaration();

  @Nullable
  DylanOperator getOperator();

  @Nullable
  DylanSemicolonFragment getSemicolonFragment();

  @Nullable
  DylanStatement getStatement();

  @Nullable
  DylanVariableName getVariableName();

}
