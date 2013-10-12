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

package org.dylanfoundry.deft.filetypes.dylan.formatter.settings;

import com.intellij.application.options.IndentOptionsEditor;
import com.intellij.application.options.SmartIndentOptionsEditor;
import com.intellij.lang.Language;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import org.dylanfoundry.deft.filetypes.dylan.DylanLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DylanLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider{
  @NotNull
  @Override
  public Language getLanguage() {
    return DylanLanguage.INSTANCE;
  }

  @Nullable
  @Override
  public IndentOptionsEditor getIndentOptionsEditor() {
    return new SmartIndentOptionsEditor();
  }

  @Nullable
  @Override
  public CommonCodeStyleSettings getDefaultCommonSettings() {
    CommonCodeStyleSettings defaultSettings = new CommonCodeStyleSettings(getLanguage());
    CommonCodeStyleSettings.IndentOptions indentOptions = defaultSettings.initIndentOptions();

    indentOptions.INDENT_SIZE = 2;
    indentOptions.CONTINUATION_INDENT_SIZE = 4;
    indentOptions.TAB_SIZE = 2;

    return defaultSettings;
  }

  @Override
  public String getCodeSample(@NotNull SettingsType settingsType) {
    return DEFAULT_CODE_SAMPLE;
  }

  private static final String DEFAULT_CODE_SAMPLE =
    "Module:    plonker\n" +
    "Synopsis:  Play with MIDI\n" +
    "Author:    Keith Playford\n" +
    "Copyright:    Original Code is Copyright (c) 1995-2004 Functional Objects, Inc.\n" +
    "              All rights reserved.\n" +
    "License:      See License.txt in this distribution for details.\n" +
    "Warranty:     Distributed WITHOUT WARRANTY OF ANY KIND\n" +
    "\n" +
    "//// A hack at some scale utilities.\n" +
    "\n" +
    "define method cycle (val, #rest vals) => (cycle :: <list>)\n" +
    "  let l = pair(val, as(<list>, vals));\n" +
    "  for (cursor = l then cursor.tail, until: cursor.tail == #())\n" +
    "  finally\n" +
    "    cursor.tail := l;\n" +
    "  end;\n" +
    "  l\n" +
    "end method;\n" +
    "\n" +
    "define method scale-to-naturals\n" +
    "    (scale :: <sequence>)\n" +
    " => (naturals :: <sequence>)\n" +
    "  let naturals = make(<simple-object-vector>, size: 7, fill: #());\n" +
    "  for (i from 0 below 7)\n" +
    "    let prev-i = modulo(i - 1, 7);\n" +
    "    let step = modulo(scale[i] - scale[prev-i], 12);\n" +
    "    if (step > 1)\n" +
    "      naturals[i]      := pair(#\"flat\", naturals[i]);\n" +
    "      naturals[prev-i] := pair(#\"sharp\", naturals[prev-i]);\n" +
    "    end;\n" +
    "  end;\n" +
    "  naturals\n" +
    "end method;\n" +
    "\n" +
    "//// The major pentatonic (I think!)\n" +
    "\n" +
    "define constant $major-scale\n" +
    "  = #[0, 2, 4, 5, 7, 9, 11, 12];\n" +
    "\n" +
    "define constant $major-scale-naturals\n" +
    "  = scale-to-naturals($major-scale);\n" +
    "\n" +
    "define constant $major-scale-naturals-cycle\n" +
    "  = apply(cycle, $major-scale-naturals);\n";
}
