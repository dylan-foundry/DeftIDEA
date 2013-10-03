// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanSourceRecords extends PsiElement {

  @Nullable
  DylanBody getBody();

  @Nullable
  DylanCaseBody getCaseBody();

  @Nullable
  DylanExpression getExpression();

  @Nullable
  DylanMacro getMacro();

  @Nullable
  DylanName getName();

  @Nullable
  DylanSourceRecord getSourceRecord();

  @Nullable
  DylanToken getToken();

  @Nullable
  DylanVariable getVariable();

}
