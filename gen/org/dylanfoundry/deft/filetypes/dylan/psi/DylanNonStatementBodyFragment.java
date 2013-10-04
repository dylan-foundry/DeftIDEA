// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanNonStatementBodyFragment extends PsiElement {

  @Nullable
  DylanBodyFragment getBodyFragment();

  @Nullable
  DylanDefinition getDefinition();

  @Nullable
  DylanLocalDeclaration getLocalDeclaration();

  @Nullable
  DylanSemicolonFragment getSemicolonFragment();

  @Nullable
  DylanSimpleFragment getSimpleFragment();

  @Nullable
  DylanSlotDeclaration getSlotDeclaration();

}
