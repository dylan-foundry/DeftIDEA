// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanForClause extends DylanCompositeElement {

  @Nullable
  DylanCollectionClause getCollectionClause();

  @Nullable
  DylanExplicitStepClause getExplicitStepClause();

  @Nullable
  DylanKeyedByClause getKeyedByClause();

  @Nullable
  DylanNumericClauses getNumericClauses();

}
