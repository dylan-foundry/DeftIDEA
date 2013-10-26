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

package org.dylanfoundry.deft.registry;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class DeftRegistryInfo {
  public static final Logger LOG = Logger.getInstance("#org.dylanfoundry.deft.registry");
  private String location;
  private List<DeftRegistryEntryInfo> entries = new ArrayList<DeftRegistryEntryInfo>();

  public DeftRegistryInfo(String location) {
    this.location = location;
    parseRegistry(location);
  }

  public List<DeftRegistryEntryInfo> getEntries() {
    return entries;
  }

  public String getLocation() {
    return location;
  }

  private void parseRegistry(String location) {
    VirtualFile registry = LocalFileSystem.getInstance().findFileByPath(location);
    if (null != registry) {
      for (VirtualFile platformFolder : registry.getChildren()) {
        for (VirtualFile registryEntry : platformFolder.getChildren()) {
          DeftRegistryEntryInfo entryInfo = parseRegistryEntry(registryEntry.getPath());
          if (null != entryInfo) {
            entries.add(entryInfo);
          }
        }
      }
    }
  }

  @Nullable
  public static DeftRegistryEntryInfo parseRegistryEntry(String location) {
    File file = new File(location);

    // registry files are relative
    File sourceRoot = file.getParentFile().getParentFile().getParentFile();

    try {
      // Registry entry files are a single line with a URL on the first line.
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line = reader.readLine();

      URI registryUri = new URI(line);
      if (!registryUri.getScheme().equals("abstract")) {
        LOG.warn("Registry entries should begin with abstract://");
        return null;
      }

      String[] pathComponents = registryUri.getPath().split("/");

      StringBuilder sourcePath = new StringBuilder();
      sourcePath.append(sourceRoot.getAbsolutePath());
      sourcePath.append(File.separator);
      for (int i = 1; i < pathComponents.length; i++) {
        if (i > 1) {
          sourcePath.append(File.separator);
        }

        sourcePath.append(pathComponents[i]);
      }

      String libraryName = file.getName();
      String platformName = file.getParentFile().getName();
      return new DeftRegistryEntryInfo(libraryName, platformName,
              sourcePath.toString());
    } catch (URISyntaxException use) {
      LOG.warn("Invalid registry entry", use);
    } catch (IOException ioe) {
      LOG.warn("Invalid registry file", ioe);
    }

    return null;
  }
}
