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

package org.dylanfoundry.deft.module.facet;

import com.intellij.facet.ui.FacetEditorTab;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.util.text.StringUtil;
import org.dylanfoundry.deft.module.DeftSdkPanel;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DeftFacetEditorTab extends FacetEditorTab {

  private final DeftSdkPanel mySdkPanel;
  private final DeftModuleSettings mySettings;

  public DeftFacetEditorTab(DeftModuleSettings settings) {
    mySettings = settings;
    mySdkPanel = new DeftSdkPanel();
  }

  @Nls
  @Override
  public String getDisplayName() {
    return "Open Dylan";
  }

  @Nullable
  @Override
  public JComponent createComponent() {
    return mySdkPanel;
  }

  @Override
  public boolean isModified() {
    return !StringUtil.equals(mySettings.openDylanSdkName, mySdkPanel.getSdkName());
  }

  @Override
  public void apply() throws ConfigurationException {
    mySettings.openDylanSdkName = mySdkPanel.getSdkName();
  }

  @Override
  public void reset() {
    final Sdk sdk = ProjectJdkTable.getInstance().findJdk(mySettings.openDylanSdkName);
    if (sdk != null) {
      mySdkPanel.setSdk(sdk);
    }
  }

  @Override
  public void disposeUIResources() {
  }
}
