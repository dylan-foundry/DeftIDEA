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

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.dylanfoundry.deft.filetypes.dylan.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DylanFoldingBuilder implements FoldingBuilder, DumbAware {
  @NotNull
  @Override
  public FoldingDescriptor[] buildFoldRegions(@NotNull ASTNode node, @NotNull Document document) {
    List<FoldingDescriptor> list = new ArrayList<FoldingDescriptor>();
    buildFolding(node, list, document);
    FoldingDescriptor[] descriptors = new FoldingDescriptor[list.size()];
    return list.toArray(descriptors);
  }

  private void buildFolding(ASTNode node, List<FoldingDescriptor> list, @NotNull Document document) {
    if (isSingleLine(node.getPsi(), document)) {
      return;
    }
    PsiElement element = node.getPsi();

    int beginOffset = 0;
    int endOffset = node.getTextRange().getEndOffset();
    boolean canFold = false;
    if (node.getElementType() == DylanTypes.DEFINITION_CLASS_DEFINER) {
      DylanDefinitionClassDefiner c = ((DylanDefinitionClassDefiner)element);
      beginOffset = c.getVariableName().getTextRange().getEndOffset() - 1;
      canFold = true;
    } else if (node.getElementType() == DylanTypes.DEFINITION_METHOD_DEFINER) {
      DylanDefinitionMethodDefiner m = ((DylanDefinitionMethodDefiner)element);
      beginOffset = m.getVariableName().getTextRange().getEndOffset() - 1;
      canFold = true;
    } else if (node.getElementType() == DylanTypes.DEFINITION_FUNCTION_DEFINER) {
      DylanDefinitionFunctionDefiner f = ((DylanDefinitionFunctionDefiner)element);
      beginOffset = f.getVariableName().getTextRange().getEndOffset() - 1;
      canFold = true;
    } else if (node.getElementType() == DylanTypes.DEFINITION_LIBRARY_DEFINER) {
      DylanDefinitionLibraryDefiner l = ((DylanDefinitionLibraryDefiner)element);
      beginOffset = l.getVariableName().getTextRange().getEndOffset() - 1;
      canFold = true;
    } else if (node.getElementType() == DylanTypes.DEFINITION_MODULE_DEFINER) {
      DylanDefinitionModuleDefiner m = ((DylanDefinitionModuleDefiner)element);
      beginOffset = m.getVariableName().getTextRange().getEndOffset() - 1;
      canFold = true;
    } else if (node.getElementType() == DylanTypes.DEFINITION_SUITE_DEFINER) {
      DylanDefinitionSuiteDefiner s = ((DylanDefinitionSuiteDefiner)element);
      beginOffset = s.getVariableName().getTextRange().getEndOffset() - 1;
      canFold = true;
    } else if (node.getElementType() == DylanTypes.DEFINITION_TEST_DEFINER) {
      DylanDefinitionTestDefiner t = ((DylanDefinitionTestDefiner)element);
      beginOffset = t.getVariableName().getTextRange().getEndOffset() - 1;
      canFold = true;
    } else if (node.getElementType() == DylanTypes.BEGIN_STATEMENT) {
      DylanBeginStatement b = ((DylanBeginStatement)element);
      beginOffset = b.getFirstChild().getTextRange().getEndOffset() - 1;
      canFold = true;
    }
    if (canFold) {
      TextRange textRange = new TextRange(beginOffset, endOffset);
      list.add(new FoldingDescriptor(node, textRange));
    }
    for (ASTNode child : node.getChildren(null)) {
      buildFolding(child, list, document);
    }
  }

  @Nullable
  @Override
  public String getPlaceholderText(@NotNull ASTNode node) {
    return "{...}";
  }

  @Override
  public boolean isCollapsedByDefault(@NotNull ASTNode node) {
    return false;
  }

  private boolean isSingleLine(PsiElement element, Document document) {
    TextRange range = element.getTextRange();
    return document.getLineNumber(range.getStartOffset()) == document.getLineNumber(range.getEndOffset());
  }
}
