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

package org.dylanfoundry.deft.filetypes.dylan.documentation;

import com.intellij.lang.documentation.AbstractDocumentationProvider;
import com.intellij.openapi.editor.colors.EditorColorsManager;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.ui.GuiUtils;
import org.dylanfoundry.deft.filetypes.dylan.highlight.DylanSyntaxHighlighterColors;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanDefinition;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public class DylanDefinitionDocumentationProvider extends AbstractDocumentationProvider {
  @Nullable
  public String getQuickNavigateInfo(PsiElement element, PsiElement originalElement) {
    if (element instanceof DylanDefinition) {
      return "\"" + ((DylanDefinition)element).getName() + "\"" + getLocationString(element);
    }
    return null;
  }

  @NotNull
  private static String getLocationString(PsiElement element) {
    PsiFile file = element.getContainingFile();
    return file != null ? " [" + file.getName() + "]" : "";
  }

  public String generateDoc(final PsiElement element, @Nullable final PsiElement originalElement) {
    if (element instanceof DylanDefinition) {
      DylanDefinition definition = (DylanDefinition)element;
      String text = "Not supported yet";

      @NonNls String info = "";
      if (text != null) {
        TextAttributes attributes = EditorColorsManager.getInstance().getGlobalScheme().getAttributes(DylanSyntaxHighlighterColors.COMMENT).clone();
        Color background = attributes.getBackgroundColor();
        if (background != null) {
          info +="<div bgcolor=#"+ GuiUtils.colorToHex(background)+">";
        }
        String doc = StringUtil.join(StringUtil.split(text, "\n"), "<br>");
        info += "<font color=#" + GuiUtils.colorToHex(attributes.getForegroundColor()) + ">" + doc + "</font>\n<br>";
        if (background != null) {
          info += "</div>";
        }
      }
      info += "\n<b>" + definition.getName() + "</b>";
      info += getLocationString(element);
      return info;
    }
    return null;
  }
}
