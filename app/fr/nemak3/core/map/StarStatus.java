package fr.nemak3.core.map;

import org.jetbrains.annotations.NotNull;

public enum StarStatus {
  PEACE ("P", "Paix"),
  WAR ("W", "Guerre");

  @NotNull
  private String statusId;
  @NotNull
  private String statusName;

  @NotNull
  public String getStatusId() {
    return statusId;
  }

  @NotNull
  public String getStatusName() {
    return statusName;
  }

  StarStatus(@NotNull String statusId, @NotNull String statusName){
    this.statusId = statusId;
    this.statusName = statusName;
  }

  public static StarStatus getStarStatusById(@NotNull String statusId){
    if(statusId.equals(PEACE.getStatusId())){
      return PEACE;
    } else {
      return WAR;
    }
  }

}
