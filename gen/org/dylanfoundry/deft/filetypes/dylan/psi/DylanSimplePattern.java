// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanSimplePattern extends DylanCompositeElement {

  @Nullable
  DylanBindingPattern getBindingPattern();

  @Nullable
  DylanBracketedPattern getBracketedPattern();

  @Nullable
  DylanNameNotEnd getNameNotEnd();

  @Nullable
  DylanPatternVariable getPatternVariable();

}
