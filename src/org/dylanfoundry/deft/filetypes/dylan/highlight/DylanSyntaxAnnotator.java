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

package org.dylanfoundry.deft.filetypes.dylan.highlight;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.dylanfoundry.deft.filetypes.dylan.highlight.DylanSyntaxHighlighterColors;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;
import org.jetbrains.annotations.NotNull;

public class DylanSyntaxAnnotator implements Annotator {
  @Override
  public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
    if (element instanceof DylanVariableName) {
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
    } else if (element instanceof DylanDefinitionClassDefiner) {
      DylanDefinitionClassDefiner cls = (DylanDefinitionClassDefiner) element;
      highlightModifiers(cls.getModifiers(), holder);
      highlightDefinerType(cls, DylanTypes.CLASS, holder);
      highlightDefinerType(cls.getClassDefinitionTail(), DylanTypes.CLASS, holder);
    } else if (element instanceof DylanDefinitionConstantDefiner) {
      DylanDefinitionConstantDefiner constant = (DylanDefinitionConstantDefiner) element;
      highlightModifiers(constant.getModifiers(), holder);
      highlightDefinerType(constant, DylanTypes.CONSTANT_T, holder);
    } else if (element instanceof DylanDefinitionDomainDefiner) {
      DylanDefinitionDomainDefiner domain = (DylanDefinitionDomainDefiner) element;
      highlightModifiers(domain.getModifiers(), holder);
      highlightDefinerType(domain, DylanTypes.DOMAIN, holder);
    } else if (element instanceof DylanDefinitionFunctionDefiner) {
      DylanDefinitionFunctionDefiner function = (DylanDefinitionFunctionDefiner) element;
      highlightModifiers(function.getModifiers(), holder);
      highlightDefinerType(function, DylanTypes.FUNCTION, holder);
      highlightDefinerType(function.getFunctionDefinitionTail(), DylanTypes.FUNCTION, holder);
    } else if (element instanceof DylanDefinitionGenericDefiner) {
      DylanDefinitionGenericDefiner generic = (DylanDefinitionGenericDefiner) element;
      highlightModifiers(generic.getModifiers(), holder);
      highlightDefinerType(generic, DylanTypes.GENERIC, holder);
    } else if (element instanceof DylanDefinitionMethodDefiner) {
      DylanDefinitionMethodDefiner method = (DylanDefinitionMethodDefiner) element;
      highlightModifiers(method.getModifiers(), holder);
      highlightDefinerType(method, DylanTypes.METHOD, holder);
      highlightDefinerType(method.getMethodDefinitionTail(), DylanTypes.METHOD, holder);
    } else if (element instanceof DylanDefinitionSuiteDefiner) {
      DylanDefinitionSuiteDefiner suite = (DylanDefinitionSuiteDefiner) element;
      highlightDefinerType(suite, DylanTypes.SUITE, holder);
      highlightDefinerType(suite.getSuiteDefinitionTail(), DylanTypes.SUITE, holder);
    } else if (element instanceof DylanDefinitionTestDefiner) {
      DylanDefinitionTestDefiner test = (DylanDefinitionTestDefiner) element;
      highlightDefinerType(test, DylanTypes.TEST, holder);
      highlightDefinerType(test.getTestDefinitionTail(), DylanTypes.TEST, holder);
    } else if (element instanceof DylanDefinitionVariableDefiner) {
      DylanDefinitionVariableDefiner variable = (DylanDefinitionVariableDefiner) element;
      highlightModifiers(variable.getModifiers(), holder);
      highlightDefinerType(variable, DylanTypes.VARIABLE_T, holder);
    }
  }

  private static final void highlightModifiers(DylanModifiers modifiers, @NotNull AnnotationHolder holder) {
    if (modifiers != null) {
      Annotation annotation = holder.createInfoAnnotation(modifiers, null);
      annotation.setTextAttributes(DylanSyntaxHighlighterColors.MODIFIERS);
    }
  }

  private static final void highlightDefinerType(PsiElement element, IElementType type, @NotNull AnnotationHolder holder) {
    ASTNode node = element.getNode().findChildByType(type);
    if (node != null) {
      Annotation annotation = holder.createInfoAnnotation(node, null);
      annotation.setTextAttributes(DylanSyntaxHighlighterColors.KEYWORD);
    }
  }
}
