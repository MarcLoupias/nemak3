package fr.nemak3.core.mission;

import org.jetbrains.annotations.NotNull;

public abstract class Mission {

  private String missionName;

  private int novarsMaxProfit;
  private int mineralMaxProfit;
  private int ceMaxProfit;
  private int erdiMaxProfit;

  public String getMissionName() {
    return missionName;
  }

  public void setMissionName(String missionName) {
    this.missionName = missionName;
  }

  public int getNovarsMaxProfit() {
    return novarsMaxProfit;
  }

  public void setNovarsMaxProfit(int novarsMaxProfit) {
    this.novarsMaxProfit = novarsMaxProfit;
  }

  public int getMineralMaxProfit() {
    return mineralMaxProfit;
  }

  public void setMineralMaxProfit(int mineralMaxProfit) {
    this.mineralMaxProfit = mineralMaxProfit;
  }

  public int getCeMaxProfit() {
    return ceMaxProfit;
  }

  public void setCeMaxProfit(int ceMaxProfit) {
    this.ceMaxProfit = ceMaxProfit;
  }

  public int getErdiMaxProfit() {
    return erdiMaxProfit;
  }

  public void setErdiMaxProfit(int erdiMaxProfit) {
    this.erdiMaxProfit = erdiMaxProfit;
  }
}
