// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanDefinitionMacroCall extends PsiElement {

  @Nullable
  DylanDefineBodyWord getDefineBodyWord();

  @Nullable
  DylanDefineListWord getDefineListWord();

  @Nullable
  DylanDefinitionTail getDefinitionTail();

  @Nullable
  PsiElement getBodyFragmentOpt();

  @Nullable
  PsiElement getListFragmentOpt();

  @Nullable
  PsiElement getModifiersOpt();

}
