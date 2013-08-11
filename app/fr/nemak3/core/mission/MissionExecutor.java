package fr.nemak3.core.mission;

import fr.nemak3.core.map.Star;

public abstract class MissionExecutor {
  public final static int MISSION_COMM = 1;
  public final static int MISSION_PILL = 2;
  public final static int MISSION_ERDI = 3;

  private double novarsProfitCoef;
  private double mineralProfitCoef;
  private double ceProfitCoef;
  private double erdiProfitCoef;
  private double profitCoef;
  private double devRateDivisor;

  private int missionShuttlesLossesBaseRate;
  private double habitabilityInfluenceCoefOnShuttlesLossesRate;
  private double shuttleEfficiencyInfluenceCoefOnShuttlesLossesRate;
  private int starOwnershipInfluenceOnShuttlesLossesRate;
  private int starStatusInfluenceOnShuttlesLossesRate;

  public double getNovarsProfitCoef() {
    return novarsProfitCoef;
  }

  public void setNovarsProfitCoef(double novarsProfitCoef) {
    this.novarsProfitCoef = novarsProfitCoef;
  }

  public double getMineralProfitCoef() {
    return mineralProfitCoef;
  }

  public void setMineralProfitCoef(double mineralProfitCoef) {
    this.mineralProfitCoef = mineralProfitCoef;
  }

  public double getCeProfitCoef() {
    return ceProfitCoef;
  }

  public void setCeProfitCoef(double ceProfitCoef) {
    this.ceProfitCoef = ceProfitCoef;
  }

  public double getErdiProfitCoef() {
    return erdiProfitCoef;
  }

  public void setErdiProfitCoef(double erdiProfitCoef) {
    this.erdiProfitCoef = erdiProfitCoef;
  }

  public double getProfitCoef() {
    return profitCoef;
  }

  public void setProfitCoef(double profitCoef) {
    this.profitCoef = profitCoef;
  }

  public double getDevRateDivisor() {
    return devRateDivisor;
  }

  public void setDevRateDivisor(double devRateDivisor) {
    this.devRateDivisor = devRateDivisor;
  }

  public double getHabitabilityInfluenceCoefOnShuttlesLossesRate() {
    return habitabilityInfluenceCoefOnShuttlesLossesRate;
  }

  public void setHabitabilityInfluenceCoefOnShuttlesLossesRate(double habitabilityInfluenceCoefOnShuttlesLossesRate) {
    this.habitabilityInfluenceCoefOnShuttlesLossesRate = habitabilityInfluenceCoefOnShuttlesLossesRate;
  }

  public double getShuttleEfficiencyInfluenceCoefOnShuttlesLossesRate() {
    return shuttleEfficiencyInfluenceCoefOnShuttlesLossesRate;
  }

  public void setShuttleEfficiencyInfluenceCoefOnShuttlesLossesRate(double shuttleEfficiencyInfluenceCoefOnShuttlesLossesRate) {
    this.shuttleEfficiencyInfluenceCoefOnShuttlesLossesRate = shuttleEfficiencyInfluenceCoefOnShuttlesLossesRate;
  }

  public int getStarOwnershipInfluenceOnShuttlesLossesRate() {
    return starOwnershipInfluenceOnShuttlesLossesRate;
  }

  public void setStarOwnershipInfluenceOnShuttlesLossesRate(int starOwnershipInfluenceOnShuttlesLossesRate) {
    this.starOwnershipInfluenceOnShuttlesLossesRate = starOwnershipInfluenceOnShuttlesLossesRate;
  }

  public int getStarStatusInfluenceOnShuttlesLossesRate() {
    return starStatusInfluenceOnShuttlesLossesRate;
  }

  public void setStarStatusInfluenceOnShuttlesLossesRate(int starStatusInfluenceOnShuttlesLossesRate) {
    this.starStatusInfluenceOnShuttlesLossesRate = starStatusInfluenceOnShuttlesLossesRate;
  }

  public int getMissionShuttlesLossesBaseRate() {
    return missionShuttlesLossesBaseRate;
  }

  public void setMissionShuttlesLossesBaseRate(int missionShuttlesLossesBaseRate) {
    this.missionShuttlesLossesBaseRate = missionShuttlesLossesBaseRate;
  }

  public abstract MissionResult execute(MissionOrder missionOrder) throws MissionExecutorException;

  protected int calculateNovarsProfit(MissionOrder missionOrder) {
    int shuttleQty = missionOrder.getShuttleQty();
    double shuttleEff = missionOrder.getShuttleEff();
    double coef = this.getNovarsProfitCoef();
    int max = missionOrder.getNovarsMaxProfit();

    int profit = 0;
    profit = (int)Math.ceil( (shuttleQty * shuttleEff) * coef);
    if(profit > max){
      profit = max;
    }

    return profit;
  }

  protected int calculateMineralsProfit(MissionOrder missionOrder) {
    int shuttleQty = missionOrder.getShuttleQty();
    double shuttleEff = missionOrder.getShuttleEff();
    double coef = this.getMineralProfitCoef();
    int max = missionOrder.getMineralMaxProfit();

    int profit = 0;
    profit = (int)Math.ceil( (shuttleQty * shuttleEff) * coef);
    if(profit > max){
      profit = max;
    }

    return profit;
  }

  protected int calculateElectronicComponentsProfit(MissionOrder missionOrder) {
    int shuttleQty = missionOrder.getShuttleQty();
    double shuttleEff = missionOrder.getShuttleEff();
    double coef = this.getCeProfitCoef();
    int max = missionOrder.getCeMaxProfit();

    int profit = 0;
    profit = (int)Math.ceil( (shuttleQty * shuttleEff) * coef);
    if(profit > max){
      profit = max;
    }

    return profit;
  }

  protected int calculateErdividiumProfit(MissionOrder missionOrder) {
    int shuttleQty = missionOrder.getShuttleQty();
    double shuttleEff = missionOrder.getShuttleEff();
    double coef = this.getErdiProfitCoef();
    int max = missionOrder.getErdiMaxProfit();

    int profit = 0;
    profit = (int)Math.ceil( (shuttleQty * shuttleEff) * coef);
    if(profit > max){
      profit = max;
    }

    return profit;
  }

  protected abstract void applyMissionCoef(MissionResult missionResult);

  protected abstract void applyStarDevRate(MissionResult missionResult, Star star) throws MissionExecutorException;

  protected int calculateShuttlesLossesRate(MissionResult missionResult, Star star) {
    int lossesRate = this.getMissionShuttlesLossesBaseRate();
    if(star.getStarStatus() == Star.StarStatus.WAR){
      lossesRate += this.getStarStatusInfluenceOnShuttlesLossesRate();
    }
    if(star.getCommanderOwner().getId() == missionResult.getCommanderOwnerId()){
      lossesRate -= this.getStarOwnershipInfluenceOnShuttlesLossesRate();
    }
    if(star.getHabitabilityRate() <=4){
      lossesRate += (this.getHabitabilityInfluenceCoefOnShuttlesLossesRate() * (9 - star.getHabitabilityRate()));
    } else{
      lossesRate -= (this.getHabitabilityInfluenceCoefOnShuttlesLossesRate() * (star.getHabitabilityRate() - 4));
    }
    lossesRate -= (int)Math.ceil(this.getShuttleEfficiencyInfluenceCoefOnShuttlesLossesRate() * missionResult.getShuttleEff());

    if(lossesRate < 0){
      return 0;
    }
    if(lossesRate > 100){
      return 100;
    }

    return lossesRate;
  }

  protected void calculateShuttlesLosses(MissionResult missionResult, Star star) {
    int losses = (int) Math.ceil(missionResult.getShuttleQty() * calculateShuttlesLossesRate(missionResult, star) / 100);
    if(losses > missionResult.getShuttleQty()){
      missionResult.setShuttleLossesQty(missionResult.getShuttleQty());
    } else if (losses <= 0){
      missionResult.setShuttleLossesQty(0);
    } else {
      missionResult.setShuttleLossesQty(losses);
    }
  }
}
