// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanListFragment extends PsiElement {

  @Nullable
  DylanBracketedFragment getBracketedFragment();

  @Nullable
  DylanConstantFragment getConstantFragment();

  @Nullable
  DylanFunctionMacroCall getFunctionMacroCall();

  @Nullable
  DylanHashWord getHashWord();

  @Nullable
  DylanListFragment getListFragment();

  @Nullable
  DylanOperator getOperator();

  @Nullable
  DylanStatement getStatement();

  @Nullable
  DylanVariableName getVariableName();

}
