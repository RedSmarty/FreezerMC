public class Version {
  private String versionType;
  private int versionNumber;
  private String gitRepo;
  private boolean nottifyOnUpdate;
  public Version(String versionType, int versionNumber, String gitRepo, boolean notifyOnUpdate) {
    this.versionType = versionType;
    this.versionNumber = versionNumber;
    this.gitRepo = gitRepo;
    this.notifyOnUpdate = notifyOnUpdate;
  }
}
