// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanExceptionStatement extends PsiElement {

  @Nullable
  DylanBody getBody();

  @NotNull
  List<DylanExceptionOptions> getExceptionOptionsList();

  @NotNull
  DylanVariable getVariable();

}
