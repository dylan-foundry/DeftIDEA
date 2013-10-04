// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanParameterList extends PsiElement {

  @Nullable
  DylanParameters getParameters();

  @Nullable
  DylanValuesList getValuesList();

  @Nullable
  DylanVariable getVariable();

  @Nullable
  PsiElement getSemicolon();

}
