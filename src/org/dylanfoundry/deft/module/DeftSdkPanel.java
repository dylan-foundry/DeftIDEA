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

import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.ui.components.labels.ActionLink;

import javax.swing.*;
import java.awt.*;

public class DeftSdkPanel extends JPanel {

  private JPanel myRoot;
  private DeftSdkComboBox mySdkComboBox;

  public DeftSdkPanel() {
    super(new BorderLayout());
    add(myRoot, BorderLayout.CENTER);
  }

  private void createUIComponents() {
  }

  public String getSdkName() {
    final Sdk selectedSdk = mySdkComboBox.getSelectedSdk();
    return selectedSdk == null ? null : selectedSdk.getName();
  }

  public Sdk getSdk() {
    return mySdkComboBox.getSelectedSdk();
  }

  public void setSdk(Sdk sdk) {
    mySdkComboBox.getComboBox().setSelectedItem(sdk);
  }
}
