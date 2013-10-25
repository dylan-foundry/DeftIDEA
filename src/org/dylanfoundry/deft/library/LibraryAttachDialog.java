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

package org.dylanfoundry.deft.library;

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import org.dylanfoundry.deft.registry.DeftRegistryInfo;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LibraryAttachDialog extends DialogWrapper {
  @NonNls
  private static final String PROPERTY_REGISTRY_PATH = "Registry.Path";

  private final Project project;
  private String registryFile;
  private List<DeftRegistryInfo> registryEntries = new ArrayList<DeftRegistryInfo>();
  private JPanel mainPanel;
  private TextFieldWithBrowseButton myDirectoryField;
  private JList matchedRegistryEntries;

  public LibraryAttachDialog(@Nullable Project project) {
    super(project, true);

    this.project = project;

    PropertiesComponent storage = PropertiesComponent.getInstance(project);
    boolean registryPathSet = storage.isValueSet(PROPERTY_REGISTRY_PATH);
    if (registryPathSet) {
      String value = storage.getValue(PROPERTY_REGISTRY_PATH);
      myDirectoryField.getTextField().setText(value);
      registryFile = value;
    }

    final FileChooserDescriptor descriptor = FileChooserDescriptorFactory.createSingleLocalFileDescriptor();
    descriptor.putUserData(FileChooserDialog.PREFER_LAST_OVER_TO_SELECT, Boolean.TRUE);
    myDirectoryField.addBrowseFolderListener("Choose registry", "Choose registry file for library", null, descriptor);

    myDirectoryField.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        if (!myDirectoryField.getTextField().getText().isEmpty()) {
          registryFile = myDirectoryField.getTextField().getText();

          registryEntries.clear();

          registryEntries.add(LibraryAttachHandler.parseRegistryEntry(myDirectoryField.getTextField().getText()));

          matchedRegistryEntries.setListData(registryEntries.toArray(new DeftRegistryInfo[registryEntries.size()]));
        }

        setOKActionEnabled(!registryEntries.isEmpty());
      }
    });

    setOKActionEnabled(false);
    init();
  }

  @Override
  protected void dispose() {
    final PropertiesComponent storage = PropertiesComponent.getInstance(project);

    storage.setValue(PROPERTY_REGISTRY_PATH, myDirectoryField.getTextField().getText());

    super.dispose();
  }

  @Nullable
  @Override
  protected JComponent createCenterPanel() {
    return null;
  }

  @Nullable
  @Override
  protected JComponent createNorthPanel() {
    return mainPanel;
  }

  @Nullable
  @Override
  public JComponent getPreferredFocusedComponent() {
    return myDirectoryField;
  }

  public String getRegistryFile() {
    return registryFile;
  }

  public List<DeftRegistryInfo> getRegistryEntries() {
    return registryEntries;
  }
}
