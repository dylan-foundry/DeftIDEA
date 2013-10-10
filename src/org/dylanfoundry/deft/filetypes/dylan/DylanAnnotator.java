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

package org.dylanfoundry.deft.filetypes.dylan;

import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.dylanfoundry.deft.filetypes.dylan.highlight.DylanSyntaxHighlighterColors;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanConstantString;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanVariableName;
import org.jetbrains.annotations.NotNull;

public class DylanAnnotator implements Annotator {
  @Override
  public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
    if (element instanceof DylanConstantString) {
      Annotation annotation = holder.createInfoAnnotation(element, null);
      annotation.setTextAttributes(DylanSyntaxHighlighterColors.CONSTANT_STRING);
    } else if (element instanceof DylanVariableName) {
      DylanVariableName variable = (DylanVariableName) element;
      Annotation annotation = holder.createInfoAnnotation(element, null);
      String name = variable.getText();
      if (name.startsWith("<") && name.endsWith(">")) {
        annotation.setTextAttributes(DylanSyntaxHighlighterColors.CLASS);
      } else if (name.startsWith("$")) {
        annotation.setTextAttributes(DylanSyntaxHighlighterColors.CONSTANT);
      } else if (name.startsWith("*") && name.endsWith("*")) {
        annotation.setTextAttributes(DylanSyntaxHighlighterColors.VARIABLE);
      }
    }
  }
}
