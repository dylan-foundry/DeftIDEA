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

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.text.StringUtil;

import javax.swing.*;

public class DeftModuleWizardStep extends ModuleWizardStep {
  private final DeftSdkPanel sdkPanel = new DeftSdkPanel();
  private DeftModuleBuilder myBuilder;

  public DeftModuleWizardStep(DeftModuleBuilder builder) {
    myBuilder = builder;
  }

  @Override
  public JComponent getComponent() {
    return sdkPanel;
  }

  @Override
  public void updateDataModel() {
    myBuilder.setSdk(sdkPanel.getSdk());
  }


  @Override
  public boolean validate() throws ConfigurationException {
    if (StringUtil.isEmpty(sdkPanel.getSdkName())) {
      throw new ConfigurationException("Specify Open Dylan SDK");
    }
    return super.validate();
  }
}
