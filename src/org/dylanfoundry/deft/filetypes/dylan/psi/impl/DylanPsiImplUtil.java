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

package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiElementFilter;
import com.intellij.psi.util.PsiTreeUtil;
import org.dylanfoundry.deft.DeftIcons;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DylanPsiImplUtil {
  public static String getKey(DylanHeader element) {
    ASTNode keyNode = element.getNode().findChildByType(DylanTypes.KEY);
    if (keyNode != null) {
      return keyNode.getText();
    } else {
      return null;
    }
  }

  public static PsiElement[] getValues(DylanHeaderValues element) {
    return PsiTreeUtil.collectElements(element, new PsiElementFilter() {
      @Override
      public boolean isAccepted(PsiElement e) {
        return (e.getNode().getElementType() == DylanTypes.VALUE);
      }
    });
  }

  public static String getName(DylanDefinitionClassDefiner element) {
    return "Class " + element.getVariableName().getText();
  }

  public static PsiElement setName(DylanDefinitionClassDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionClassDefiner element) {
    return element.getVariableName();
  }

  public static String getName(DylanDefinitionConstantDefiner element) {
    return "Constant " + element.getVariableName().getText();
  }

  public static PsiElement setName(DylanDefinitionConstantDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionConstantDefiner element) {
    return element.getVariableName();
  }

  public static String getName(DylanDefinitionCopyDownMethodDefiner element) {
    return "Copy-down-method " + element.getFunctionMacroCall().getText();
  }

  public static PsiElement setName(DylanDefinitionCopyDownMethodDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionCopyDownMethodDefiner element) {
    return element.getFunctionMacroCall().getFunctionWord();
  }

  public static String getName(DylanDefinitionDomainDefiner element) {
    return "Domain " + element.getVariableName().getText();
  }

  public static PsiElement setName(DylanDefinitionDomainDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionDomainDefiner element) {
    return element.getVariableName();
  }

  public static String getName(DylanDefinitionFunctionDefiner element) {
    return "Function " + element.getVariableName().getText();
  }

  public static PsiElement setName(DylanDefinitionFunctionDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionFunctionDefiner element) {
    return element.getVariableName();
  }

  public static String getName(DylanDefinitionGenericDefiner element) {
    return "Generic " + element.getText();
  }

  public static PsiElement setName(DylanDefinitionGenericDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionGenericDefiner element) {
    return element.getFunctionMacroCall();
  }

  public static String getName(DylanDefinitionLibraryDefiner element) {
    return "Library " + element.getVariableName().getText();
  }

  public static PsiElement setName(DylanDefinitionLibraryDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionLibraryDefiner element) {
    return element.getVariableName();
  }

  public static String getName(DylanDefinitionMacroDefiner element) {
    return "Macro " + element.getVariableName().getText();
  }

  public static PsiElement setName(DylanDefinitionMacroDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionMacroDefiner element) {
    return element.getVariableName();
  }

  public static String getName(DylanDefinitionMethodDefiner element) {
    return "Method " + element.getVariableName().getText();
  }

  public static PsiElement setName(DylanDefinitionMethodDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionMethodDefiner element) {
    return element.getVariableName();
  }

  public static String getName(DylanDefinitionModuleDefiner element) {
    return "Module " + element.getVariableName().getText();
  }

  public static PsiElement setName(DylanDefinitionModuleDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionModuleDefiner element) {
    return element.getVariableName();
  }

  public static String getName(DylanDefinitionVariableDefiner element) {
    return "Variable " + element.getVariableName().getText();
  }

  public static PsiElement setName(DylanDefinitionVariableDefiner element, String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionVariableDefiner element) {
    return element.getVariableName();
  }

  public static ItemPresentation getPresentation(final DylanDefinition element) {
    return new ItemPresentation() {
      @Nullable
      @Override
      public String getPresentableText() {
        return ((DylanDefiner)(element.getFirstChild())).getName();
      }

      @Nullable
      @Override
      public String getLocationString() {
        return element.getContainingFile().getName();
      }

      @Nullable
      @Override
      public Icon getIcon(boolean unused) {
        return DeftIcons.DYLAN_FILE;
      }
    };
  }

  public static ItemPresentation getPresentation(final DylanDefiner element) {
    return new ItemPresentation() {
      @Nullable
      @Override
      public String getPresentableText() {
        return element.getName();
      }

      @Nullable
      @Override
      public String getLocationString() {
        return element.getContainingFile().getName();
      }

      @Nullable
      @Override
      public Icon getIcon(boolean b) {
        return DeftIcons.DYLAN_FILE;
      }
    };
  }
}
