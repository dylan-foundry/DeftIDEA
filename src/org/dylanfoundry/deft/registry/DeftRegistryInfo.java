package org.dylanfoundry.deft.registry;

/**
 * @author robert@robertroland.org
 * @since 10/23/13
 */
public class DeftRegistryInfo {
  private String libraryName;
  private String location;

  public DeftRegistryInfo(String libraryName, String location) {
    this.libraryName = libraryName;
    this.location = location;
  }

  public String getLibraryName() {
    return libraryName;
  }

  public String getLocation() {
    return location;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("DeftRegistryInfo{");
    sb.append("libraryName='").append(libraryName).append('\'');
    sb.append(", location='").append(location).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
