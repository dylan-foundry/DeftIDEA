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

import com.intellij.formatting.FormattingMode;
import com.intellij.formatting.SpacingBuilder;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import org.dylanfoundry.deft.filetypes.dylan.DylanLanguage;
import org.dylanfoundry.deft.filetypes.dylan.formatter.settings.DylanCodeStyleSettings;

public class DylanFormattingBlockContext {
  private final CommonCodeStyleSettings mySettings;
  private final DylanCodeStyleSettings myDylanSettings;
  private final SpacingBuilder mySpacingBuilder;
  private final FormattingMode myMode;

  public DylanFormattingBlockContext(CodeStyleSettings settings, SpacingBuilder builder, FormattingMode mode) {
    mySettings = settings.getCommonSettings(DylanLanguage.INSTANCE);
    myDylanSettings = settings.getCustomSettings(DylanCodeStyleSettings.class);
    mySpacingBuilder = builder;
    myMode = mode;
  }

  public CommonCodeStyleSettings getSettings() {
    return mySettings;
  }

  public DylanCodeStyleSettings getDylanSettings() {
    return myDylanSettings;
  }

  public SpacingBuilder getSpacingBuilder() {
    return mySpacingBuilder;
  }

  public FormattingMode getMode() {
    return myMode;
  }
}
