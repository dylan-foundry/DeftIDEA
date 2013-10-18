// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanDefinitionMacroCall extends PsiElement {

  @Nullable
  DylanBodyFragment getBodyFragment();

  @Nullable
  DylanBracketedFragment getBracketedFragment();

  @Nullable
  DylanConstantFragment getConstantFragment();

  @Nullable
  DylanDefineBodyWord getDefineBodyWord();

  @Nullable
  DylanDefineListWord getDefineListWord();

  @Nullable
  DylanDefinitionTail getDefinitionTail();

  @Nullable
  DylanFunctionMacroCall getFunctionMacroCall();

  @Nullable
  DylanHashWord getHashWord();

  @Nullable
  DylanModifiers getModifiers();

  @Nullable
  DylanOperator getOperator();

  @Nullable
  DylanStatement getStatement();

  @Nullable
  DylanVariableName getVariableName();

}
