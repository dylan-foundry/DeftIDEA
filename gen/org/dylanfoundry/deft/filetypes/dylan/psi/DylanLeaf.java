// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanLeaf extends PsiElement {

  @Nullable
  DylanExpression getExpression();

  @Nullable
  DylanFunctionMacroCall getFunctionMacroCall();

  @Nullable
  DylanLiteral getLiteral();

  @Nullable
  DylanStatement getStatement();

  @Nullable
  DylanVariableName getVariableName();

}
