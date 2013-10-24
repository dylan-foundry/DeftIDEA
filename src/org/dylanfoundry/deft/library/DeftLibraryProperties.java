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

import com.intellij.openapi.roots.libraries.LibraryProperties;
import com.intellij.openapi.util.Comparing;
import com.intellij.util.xmlb.annotations.Attribute;
import org.jetbrains.annotations.Nullable;

public class DeftLibraryProperties extends LibraryProperties<DeftLibraryProperties> {
  private String libraryName;

  public DeftLibraryProperties() {
  }

  public DeftLibraryProperties(String libraryName) {
    this.libraryName = libraryName;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof DeftLibraryProperties &&
        Comparing.equal(libraryName, ((DeftLibraryProperties) obj).libraryName);
  }

  @Override
  public int hashCode() {
    return Comparing.hashcode(libraryName);
  }

  @Nullable
  @Override
  public DeftLibraryProperties getState() {
    return this;
  }

  @Override
  public void loadState(DeftLibraryProperties state) {
    this.libraryName = state.libraryName;
  }

  @Attribute("library-name")
  public String getLibraryName() {
    return libraryName;
  }

  public void setLibraryName(String libraryName) {
    this.libraryName = libraryName;
  }
}
