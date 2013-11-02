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

package org.dylanfoundry.deft.filetypes.dylan.formatter;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import org.dylanfoundry.deft.filetypes.dylan.DylanLanguage;
import org.dylanfoundry.deft.filetypes.dylan.formatter.settings.DylanCodeStyleSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.dylanfoundry.deft.filetypes.dylan.psi.DylanTypes.*;

public class DylanFormattingModelBuilder implements FormattingModelBuilder {
  private static final boolean DUMP_FORMATTING_AST = false;

  @NotNull
  public FormattingModel createModel(@NotNull PsiElement element,
                                     @NotNull CodeStyleSettings settings,
                                     @NotNull FormattingMode mode) {
    if (DUMP_FORMATTING_AST) {
      ASTNode fileNode = element.getContainingFile().getNode();
      System.out.println("AST tree for " + element.getContainingFile().getName() + ":");
      printAST(fileNode, 0);
    }
    final DylanFormattingBlockContext context = new DylanFormattingBlockContext(settings, createSpacingBuilder(settings), mode);
    final DylanFormattingBlock block = new DylanFormattingBlock(null, element.getNode(), null, Indent.getNoneIndent(), null, context);
    if (DUMP_FORMATTING_AST) {
      FormattingModelDumper.dumpFormattingModel(block, 2, System.out);
    }
    return FormattingModelProvider.createFormattingModelForPsiFile(element.getContainingFile(), block, settings);
  }

  @NotNull
  @Override
  public FormattingModel createModel(PsiElement psiElement, CodeStyleSettings codeStyleSettings) {
    return createModel(psiElement, codeStyleSettings, FormattingMode.REFORMAT);
  }

  private static SpacingBuilder createSpacingBuilder(CodeStyleSettings settings) {
    final CommonCodeStyleSettings commonSettings = settings.getCommonSettings(DylanLanguage.INSTANCE);
    return new SpacingBuilder(commonSettings.getRootSettings())
      .before(COMMA).spaceIf(commonSettings.SPACE_BEFORE_COMMA)
      .after(COMMA).spaceIf(commonSettings.SPACE_AFTER_COMMA)
      .before(SEMICOLON).none()

      .around(BINARY_OPERATOR).spaces(1)
      ;
  }

  @Nullable
  @Override
  public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
    return null;
  }

  private static void printAST(ASTNode node, int indent) {
    while (node != null) {
      for (int i = 0; i < indent; i++) {
        System.out.print(" ");
      }
      System.out.println(node.toString() + " " + node.getTextRange().toString());
      printAST(node.getFirstChildNode(), indent + 2);
      node = node.getTreeNext();
    }
  }

}
