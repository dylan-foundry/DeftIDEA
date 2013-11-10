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
import org.jetbrains.annotations.NotNull;
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

  public static String getName(DylanDefinition element) {
    return null;
  }

  public static PsiElement setName(DylanDefinition element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinition element) {
    return null;
  }

  public static Icon getPresentationIcon(DylanDefinition element) {
    return DeftIcons.DEFINER_UNKNOWN;
  }

  public static String getName(DylanDefinitionClassDefiner element) {
    if (element.getVariableName() != null) {
      return element.getVariableName().getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionClassDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionClassDefiner element) {
    return element.getVariableName();
  }

  public static Icon getPresentationIcon(DylanDefinitionClassDefiner element) {
    return DeftIcons.DEFINER_CLASS;
  }

  public static String getName(DylanDefinitionConstantDefiner element) {
    PsiElement nameIdentifier = getNameIdentifier(element);
    if (nameIdentifier != null) {
      return nameIdentifier.getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionConstantDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionConstantDefiner element) {
    if (element.getVariable() != null) {
      return element.getVariable();
    } else if (element.getVariableList() != null) {
      return element.getVariableList();
    }
    return null;
  }

  public static Icon getPresentationIcon(DylanDefinitionConstantDefiner element) {
    return DeftIcons.DEFINER_CONSTANT;
  }

  public static String getName(DylanDefinitionCopyDownMethodDefiner element) {
    if ((element.getVariableName() != null) && (element.getListFragment() != null)) {
      return cleanText(element.getVariableName().getText() + element.getListFragment().getText());
    } else if (element.getVariableName() != null) {
      return cleanText(element.getVariableName().getText());
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionCopyDownMethodDefiner element, @NotNull String newName) {
    return null;
  }

  public static Icon getPresentationIcon(DylanDefinitionCopyDownMethodDefiner element) {
    return DeftIcons.DEFINER_COPYDOWN;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionCopyDownMethodDefiner element) {
    return element.getVariableName();
  }

  public static String getName(DylanDefinitionDomainDefiner element) {
    if (element.getVariableName() != null) {
      return "sealed domain" + element.getVariableName().getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionDomainDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionDomainDefiner element) {
    return element.getVariableName();
  }

  public static Icon getPresentationIcon(DylanDefinitionDomainDefiner element) {
    return DeftIcons.DEFINER_DOMAIN;
  }

  public static String getName(DylanDefinitionFunctionDefiner element) {
    if ((element.getVariableName() != null) && (element.getParameterList() != null)) {
      return cleanText(element.getVariableName().getText() + element.getParameterList().getText());
    } else if (element.getVariableName() != null) {
      return cleanText(element.getVariableName().getText());
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionFunctionDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionFunctionDefiner element) {
    return element.getVariableName();
  }

  public static Icon getPresentationIcon(DylanDefinitionFunctionDefiner element) {
    return DeftIcons.DEFINER_FUNCTION;
  }

  public static String getName(DylanDefinitionGenericDefiner element) {
    if ((element.getVariableName() != null) && (element.getParameterList() != null)) {
      return cleanText(element.getVariableName().getText() + element.getParameterList().getText());
    } else if (element.getVariableName() != null) {
      return cleanText(element.getVariableName().getText());
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionGenericDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionGenericDefiner element) {
    return element.getVariableName();
  }

  public static Icon getPresentationIcon(DylanDefinitionGenericDefiner element) {
    return DeftIcons.DEFINER_GENERIC;
  }

  public static String getName(DylanDefinitionLibraryDefiner element) {
    if (element.getVariableName() != null) {
      return element.getVariableName().getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionLibraryDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionLibraryDefiner element) {
    return element.getVariableName();
  }

  public static Icon getPresentationIcon(DylanDefinitionLibraryDefiner element) {
    return DeftIcons.DEFINER_LIBRARY;
  }

  public static String getName(DylanDefinitionMacroDefiner element) {
    PsiElement nameIdentifier = getNameIdentifier(element);
    if (nameIdentifier != null) {
      return nameIdentifier.getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionMacroDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionMacroDefiner element) {
    if ((element.getMacroDefinition() != null) && (element.getMacroDefinition().getMacroNameList() != null)) {
      return element.getMacroDefinition().getMacroNameList().get(0);
    }
    return null;
  }

  public static Icon getPresentationIcon(DylanDefinitionMacroDefiner element) {
    return DeftIcons.DEFINER_MACRO;
  }

  public static String getName(DylanDefinitionMethodDefiner element) {
    if ((element.getVariableName() != null) && (element.getParameterList() != null)) {
      return cleanText(element.getVariableName().getText() + element.getParameterList().getText());
    } else if (element.getVariableName() != null) {
      return cleanText(element.getVariableName().getText());
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionMethodDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionMethodDefiner element) {
    return element.getVariableName();
  }

  public static Icon getPresentationIcon(DylanDefinitionMethodDefiner element) {
    return DeftIcons.DEFINER_METHOD;
  }

  public static String getName(DylanDefinitionModuleDefiner element) {
    if (element.getVariableName() != null) {
      return element.getVariableName().getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionModuleDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionModuleDefiner element) {
    return element.getVariableName();
  }

  public static Icon getPresentationIcon(DylanDefinitionModuleDefiner element) {
    return DeftIcons.DEFINER_MODULE;
  }

  public static String getName(DylanDefinitionSuiteDefiner element) {
    PsiElement nameIdentifier = getNameIdentifier(element);
    if (nameIdentifier != null) {
      return nameIdentifier.getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionSuiteDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionSuiteDefiner element) {
    return element.getVariableName();
  }

  public static Icon getPresentationIcon(DylanDefinitionSuiteDefiner element) {
    return DeftIcons.DEFINER_SUITE;
  }

  public static String getName(DylanDefinitionTableDefiner element) {
    PsiElement nameIdentifier = getNameIdentifier(element);
    if (nameIdentifier != null) {
      return nameIdentifier.getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionTableDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionTableDefiner element) {
    return element.getVariable();
  }

  public static Icon getPresentationIcon(DylanDefinitionTableDefiner element) {
    return DeftIcons.DEFINER_CONSTANT;
  }

  public static String getName(DylanDefinitionTestDefiner element) {
    PsiElement nameIdentifier = getNameIdentifier(element);
    if (nameIdentifier != null) {
      return nameIdentifier.getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionTestDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionTestDefiner element) {
    return element.getVariableName();
  }

  public static Icon getPresentationIcon(DylanDefinitionTestDefiner element) {
    return DeftIcons.DEFINER_TEST;
  }

  public static String getName(DylanDefinitionVariableDefiner element) {
    PsiElement nameIdentifier = getNameIdentifier(element);
    if (nameIdentifier != null) {
      return nameIdentifier.getText();
    }
    return null;
  }

  public static PsiElement setName(DylanDefinitionVariableDefiner element, @NotNull String newName) {
    return null;
  }

  public static PsiElement getNameIdentifier(DylanDefinitionVariableDefiner element) {
    if (element.getVariable() != null) {
      return element.getVariable();
    } else if (element.getVariableList() != null) {
      return element.getVariableList();
    }
    return null;
  }

  public static Icon getPresentationIcon(DylanDefinitionVariableDefiner element) {
    return DeftIcons.DEFINER_VARIABLE;
  }

  public static ItemPresentation getPresentation(final DylanDefinition element) {
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
        return element.getPresentationIcon();
      }
    };
  }

  static String cleanText(String text) {
    // collapse all whitespace
    return text.replaceAll("\\s+", " ");
  }
}
