package org.dylanfoundry.deft.registry;

/**
 * @author robert@robertroland.org
 * @since 10/23/13
 */
public class DeftRegistryInfo {
  private String libraryName;
  private String platformName;
  private String location;

  public DeftRegistryInfo(String libraryName, String platformName, String location) {
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

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("DeftRegistryInfo{");
    sb.append("libraryName='").append(libraryName).append('\'');
    sb.append(", platformName='").append(platformName).append('\'');
    sb.append(", location='").append(location).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
