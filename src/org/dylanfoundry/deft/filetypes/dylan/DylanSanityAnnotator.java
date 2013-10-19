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

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanDefinitionClassDefiner;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanDefinitionFunctionDefiner;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanDefinitionMethodDefiner;
import org.jetbrains.annotations.NotNull;

public class DylanSanityAnnotator implements Annotator {
  @Override
  public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
    if (element instanceof DylanDefinitionClassDefiner) {
      DylanDefinitionClassDefiner cls = (DylanDefinitionClassDefiner) element;
      validateClass(cls, holder);
    } else if (element instanceof DylanDefinitionFunctionDefiner) {
      DylanDefinitionFunctionDefiner function = (DylanDefinitionFunctionDefiner) element;
      validateFunction(function, holder);
    } else if (element instanceof DylanDefinitionMethodDefiner) {
      DylanDefinitionMethodDefiner method = (DylanDefinitionMethodDefiner) element;
      validateMethod(method, holder);
    }
  }

  private void validateClass(@NotNull DylanDefinitionClassDefiner cls, @NotNull AnnotationHolder holder) {
    PsiElement tail = cls.getClassDefinitionTail();
    validateDefinitionTail(tail, cls.getVariableName(), holder);
    validateClassName(cls.getVariableName(), holder);
  }

  private void validateFunction(@NotNull DylanDefinitionFunctionDefiner function, @NotNull AnnotationHolder holder) {
    PsiElement tail = function.getFunctionDefinitionTail();
    validateDefinitionTail(tail, function.getVariableName(), holder);
  }

  private void validateMethod(@NotNull DylanDefinitionMethodDefiner method, @NotNull AnnotationHolder holder) {
    PsiElement tail = method.getMethodDefinitionTail();
    validateDefinitionTail(tail, method.getVariableName(), holder);
  }

  private void validateDefinitionTail(PsiElement tail, PsiElement variableName, @NotNull AnnotationHolder holder) {
    if (tail.getChildren().length > 0) {
      PsiElement tailName = tail.getChildren()[0];
      if (!tailName.getText().equals(variableName.getText())) {
        Annotation annotation = holder.createErrorAnnotation(tailName, "Definer end has wrong name, expected '" + variableName.getText() + "'.");
        annotation.setHighlightType(ProblemHighlightType.ERROR);
      }
    }
  }

  private void validateClassName(PsiElement className, @NotNull AnnotationHolder holder) {
    String name = className.getText();
    if (!name.startsWith("<") || !name.endsWith(">")) {
      Annotation annotation = holder.createWarningAnnotation(className, "Class names usually begin with '<' and end with '>'.");
    }
  }
}
