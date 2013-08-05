package fr.nemak3.core.mission;

import fr.nemak3.core.Commander;
import fr.nemak3.core.map.Star;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 23/06/13
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 */
public class MissionResult extends MissionOrder {

  private int novarsProfit;
  private int mineralProfit;
  private int ceProfit;
  private int erdiProfit;

  private int shuttleLossesQty;

  public int getNovarsProfit() {
    return novarsProfit;
  }

  public void setNovarsProfit(int novarsProfit) {
    this.novarsProfit = novarsProfit;
  }

  public int getMineralProfit() {
    return mineralProfit;
  }

  public void setMineralProfit(int mineralProfit) {
    this.mineralProfit = mineralProfit;
  }

  public int getCeProfit() {
    return ceProfit;
  }

  public void setCeProfit(int ceProfit) {
    this.ceProfit = ceProfit;
  }

  public int getErdiProfit() {
    return erdiProfit;
  }

  public void setErdiProfit(int erdiProfit) {
    this.erdiProfit = erdiProfit;
  }

  public int getShuttleLossesQty() {
    return shuttleLossesQty;
  }

  public void setShuttleLossesQty(int shuttleLossesQty) {
    this.shuttleLossesQty = shuttleLossesQty;
  }
}
