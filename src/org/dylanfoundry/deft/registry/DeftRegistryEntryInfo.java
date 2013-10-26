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

import java.io.File;

public class DeftRegistryEntryInfo {
  private String libraryName;
  private String platformName;
  private String location;

  public DeftRegistryEntryInfo(String libraryName, String platformName, String location) {
    this.libraryName = libraryName;
    this.platformName = platformName;
    this.location = location;
  }

  public String getLibraryName() {
    return libraryName;
  }

  public String getPlatformName() {
    return platformName;
  }

  public String getLocation() {
    return location;
  }

  public String getSourceDirectory() {
    File file = new File(location);
    return file.getParent();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("DeftRegistryEntryInfo{");
    sb.append("libraryName='").append(libraryName).append('\'');
    sb.append(", platformName='").append(platformName).append('\'');
    sb.append(", location='").append(location).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
