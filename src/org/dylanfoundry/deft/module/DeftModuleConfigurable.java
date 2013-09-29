/*
 * Copyright 2013, Konstantin Bulenkov.
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

package org.dylanfoundry.deft.module;

import com.intellij.framework.addSupport.FrameworkSupportInModuleConfigurable;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.roots.ModifiableModelsProvider;
import com.intellij.openapi.roots.ModifiableRootModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DeftModuleConfigurable extends FrameworkSupportInModuleConfigurable {
  public static final String OPEN_DYLAN_SDK_KEY = "OPEN_DYLAN_SDK_NAME";
  private DeftSdkPanel myDeftSdkPanel = new DeftSdkPanel();

  @Nullable
  @Override
  public JComponent createComponent() {
    return myDeftSdkPanel;
  }

  @Override
  public void addSupport(@NotNull Module module, @NotNull ModifiableRootModel model, @NotNull ModifiableModelsProvider provider) {
    module.setOption(OPEN_DYLAN_SDK_KEY, myDeftSdkPanel.getSdkName());
  }
}
