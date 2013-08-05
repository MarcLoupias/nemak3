package fr.nemak3.core.mission;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 23/06/13
 * Time: 17:04
 * To change this template use File | Settings | File Templates.
 */
public class MissionOrder extends Mission {

  private int commanderOwnerId;
  private int starTargetId;

  private int missionType;
  private int shuttleQty;
  private double shuttleEff;

  public int getCommanderOwnerId() {
    return commanderOwnerId;
  }

  public void setCommanderOwnerId(int commanderOwnerId) {
    this.commanderOwnerId = commanderOwnerId;
  }

  public int getStarTargetId() {
    return starTargetId;
  }

  public void setStarTargetId(int starTargetId) {
    this.starTargetId = starTargetId;
  }

  public int getMissionType() {
    return missionType;
  }

  public void setMissionType(int missionType) {
    this.missionType = missionType;
  }

  public int getShuttleQty() {
    return shuttleQty;
  }

  public void setShuttleQty(int shuttleQty) {
    this.shuttleQty = shuttleQty;
  }

  public double getShuttleEff() {
    return shuttleEff;
  }

  public void setShuttleEff(double shuttleEff) {
    this.shuttleEff = shuttleEff;
  }

}
