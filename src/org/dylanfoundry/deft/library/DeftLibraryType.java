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
import com.intellij.openapi.roots.libraries.LibraryType;
import com.intellij.openapi.roots.libraries.NewLibraryConfiguration;
import com.intellij.openapi.roots.libraries.PersistentLibraryKind;
import com.intellij.openapi.roots.libraries.ui.LibraryEditorComponent;
import com.intellij.openapi.roots.libraries.ui.LibraryPropertiesEditor;
import com.intellij.openapi.vfs.VirtualFile;
import org.dylanfoundry.deft.DeftIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DeftLibraryType extends LibraryType<DeftLibraryProperties> {
  private static final PersistentLibraryKind<DeftLibraryProperties> LIBRARY_KIND =
      new PersistentLibraryKind<DeftLibraryProperties>("deft") {
        @NotNull
        @Override
        public DeftLibraryProperties createDefaultProperties() {
          return new DeftLibraryProperties();
        }
      };

  public static DeftLibraryType getInstance() {
    return EP_NAME.findExtension(DeftLibraryType.class);
  }

  public DeftLibraryType() {
    super(LIBRARY_KIND);
  }

  @Nullable
  @Override
  public String getCreateActionName() {
    return "From Registry";
  }

  @Nullable
  @Override
  public NewLibraryConfiguration createNewLibrary(@NotNull JComponent parentComponent,
                                                  @Nullable VirtualFile contextDirectory,
                                                  @NotNull Project project) {
    // LibraryAttachHandler.parseRegistryEntry(contextDirectory.getCanonicalPath())
    return LibraryAttachHandler.chooseLibrary(project,
        parentComponent);
  }

  @Nullable
  @Override
  public LibraryPropertiesEditor createPropertiesEditor(
      @NotNull LibraryEditorComponent<DeftLibraryProperties> editorComponent) {
    return new DeftLibraryEditor(editorComponent, this);
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return DeftIcons.DEFT;
  }

  @Nullable
  @Override
  public String getDescription(@NotNull DeftLibraryProperties properties) {
    return "Library " + properties.getLibraryName() + " from registry";
  }
}
