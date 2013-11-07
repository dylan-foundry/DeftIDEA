/*
 * Copyright 2013, Bruce Mitchener, Jr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dylanfoundry.deft.filetypes.dylan.template;

import com.intellij.codeInsight.template.EverywhereContextType;
import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.util.PsiUtilBase;
import org.dylanfoundry.deft.filetypes.dylan.DylanLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DylanContextType extends TemplateContextType {
  protected DylanContextType(@NotNull @NonNls String id, @NotNull String presentableName, @Nullable Class<? extends TemplateContextType> baseContextType) {
    super(id, presentableName, baseContextType);
  }

  @Override
  public boolean isInContext(@NotNull PsiFile file, int offset) {
    if (!PsiUtilBase.getLanguageAtOffset(file, offset).isKindOf(DylanLanguage.INSTANCE)) return false;
    PsiElement element = file.findElementAt(offset);
    return element != null && isInContext(element);
  }

  protected abstract boolean isInContext(PsiElement element);

  public static class Generic extends DylanContextType {

    protected Generic() {
      super("DYLAN_CODE", "Dylan", EverywhereContextType.class);
    }

    @Override
    protected boolean isInContext(PsiElement element) {
      return true;
    }
  }

  public static class Definition extends DylanContextType {
    protected Definition() {
      super("DYLAN_DEFINITION", "Definition", Generic.class);
    }

    @Override
    protected boolean isInContext(PsiElement element) {
      // TODO: Better check?
      return true;
    }
  }

  public static class Expression extends DylanContextType {
    protected Expression() {
      super("DYLAN_EXPRESSION", "Expression", Generic.class);
    }

    @Override
    protected boolean isInContext(PsiElement element) {
      // TODO: Better check?
      return true;
    }
  }
}
