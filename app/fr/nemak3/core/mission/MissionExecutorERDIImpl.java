package fr.nemak3.core.mission;

import fr.nemak3.core.map.Star;
import fr.nemak3.services.CoreServices;

public class MissionExecutorERDIImpl extends MissionExecutor {

  @Override
  public MissionResult execute(MissionOrder missionOrder) throws MissionExecutorException {
    MissionResult missionResult = new MissionResult();
    Star star = CoreServices.getInstance().getStarById(missionOrder.getStarTargetId());

    missionResult.setErdiProfit(calculateErdividiumProfit(missionOrder));

    applyMissionCoef(missionResult);
    applyStarDevRate(missionResult, star);
    calculateShuttlesLosses(missionResult, star);

    return missionResult;
  }

  @Override
  protected void applyMissionCoef(MissionResult missionResult) {
    missionResult.setErdiProfit((int) Math.ceil(missionResult.getErdiProfit() * this.getProfitCoef()));
  }

  @Override
  protected void applyStarDevRate(MissionResult missionResult, Star star) throws MissionExecutorException {
    if(this.getDevRateDivisor() <= 0){
      throw new MissionExecutorException("Mission configuration missing or not properly loaded - devRateDivisor is " + this.getDevRateDivisor());
    }
    double bonusCoef = 1 + ( (star.getDevelopmentRate() / this.getDevRateDivisor() / 2) );

    missionResult.setErdiProfit((int)Math.ceil(missionResult.getErdiProfit() * bonusCoef));
  }
}
