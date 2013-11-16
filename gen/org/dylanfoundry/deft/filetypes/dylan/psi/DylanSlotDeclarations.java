// This is a generated file. Not intended for manual editing.
package org.dylanfoundry.deft.filetypes.dylan.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DylanSlotDeclarations extends DylanCompositeElement {

  @NotNull
  List<DylanInheritedSlotSpec> getInheritedSlotSpecList();

  @NotNull
  List<DylanInitArgSpec> getInitArgSpecList();

  @NotNull
  List<DylanSlotSpec> getSlotSpecList();

}
