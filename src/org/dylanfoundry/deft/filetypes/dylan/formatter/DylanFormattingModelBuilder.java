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
  @NotNull
  @Override
  public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
    CommonCodeStyleSettings commonSettings = settings.getCommonSettings(DylanLanguage.INSTANCE);
    DylanCodeStyleSettings dylanSettings = settings.getCustomSettings(DylanCodeStyleSettings.class);
    SpacingBuilder spacingBuilder = createSpacingBuilder(commonSettings, dylanSettings);
    final DylanFormattingBlock block = new DylanFormattingBlock(element.getNode(), null, null, null, commonSettings, dylanSettings, spacingBuilder);
    return FormattingModelProvider.createFormattingModelForPsiFile(element.getContainingFile(), block, settings);
  }

  private static SpacingBuilder createSpacingBuilder(CommonCodeStyleSettings settings, DylanCodeStyleSettings dylanSettings) {
    return new SpacingBuilder(settings.getRootSettings())
      .before(COMMA).spaceIf(settings.SPACE_BEFORE_COMMA)
      .after(COMMA).spaceIf(settings.SPACE_AFTER_COMMA)
      .before(SEMICOLON).none()

      .around(BINARY_OPERATOR).spaces(1)
      ;
  }

  @Nullable
  @Override
  public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
    return null;
  }
}
