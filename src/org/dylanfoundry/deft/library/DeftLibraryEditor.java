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

import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.libraries.NewLibraryConfiguration;
import com.intellij.openapi.roots.libraries.ui.LibraryEditorComponent;
import com.intellij.openapi.roots.ui.configuration.libraryEditor.LibraryEditorBase;
import com.intellij.openapi.roots.ui.configuration.libraryEditor.LibraryPropertiesEditorBase;

public class DeftLibraryEditor extends LibraryPropertiesEditorBase<DeftLibraryProperties, DeftLibraryType> {
  public DeftLibraryEditor(LibraryEditorComponent<DeftLibraryProperties> component, DeftLibraryType libraryType) {
    super(component, libraryType, null);
  }

  @Override
  protected void edit() {
    final Project project = myEditorComponent.getProject();
    final NewLibraryConfiguration configuration = LibraryAttachHandler.chooseLibrary(project,
        getMainPanel());
    if (configuration == null) return;

    final LibraryEditorBase target = (LibraryEditorBase) myEditorComponent.getLibraryEditor();
    target.removeAllRoots();
    myEditorComponent.renameLibrary(configuration.getDefaultLibraryName());
    target.setType(myLibraryType);
    target.setProperties(configuration.getProperties());
    configuration.addRoots(target);
    myEditorComponent.updateRootsTree();
    setModified();
  }

  @Override
  public void apply() {
  }
}
