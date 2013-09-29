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

import com.intellij.ide.util.projectWizard.WizardInputField;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.util.Condition;

import javax.swing.*;

public class DeftWizardInputField extends WizardInputField {
  private final DeftSdkComboBox myCombo;

  protected DeftWizardInputField() {
    super("OPEN_DYLAN_SDK", findMostRecentSdkPath());
    myCombo = new DeftSdkComboBox();
  }

  private static String findMostRecentSdkPath() {
    Sdk sdk = ProjectJdkTable.getInstance().findMostRecentSdk(new Condition<Sdk>() {
      @Override
      public boolean value(Sdk sdk) {
        return sdk.getSdkType() instanceof DeftSdkType;
      }
    });
    return sdk != null ? sdk.getName() : null;
  }

  @Override
  public String getLabel() {
    return "Open Dylan SDK";
  }

  @Override
  public JComponent getComponent() {
    return myCombo;
  }

  @Override
  public String getValue() {
    Sdk sdk = myCombo.getSelectedSdk();
    return sdk == null ? "" : sdk.getHomePath();
  }
}
