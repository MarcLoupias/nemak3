package fr.nemak3.core.mission;

import fr.nemak3.core.map.Star;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 23/06/13
 * Time: 19:07
 * To change this template use File | Settings | File Templates.
 */
@Test
public class MissionExecutorCOMMImplTest {
  private static final Logger logger = Logger.getLogger(MissionExecutorTest.class);

  @Test
  public void missionCoefTest() {
    MissionExecutor exe = MissionExecutorFactory.getInstance().getMissionExecutor(MissionExecutor.MISSION_COMM);
    exe.setNovarsProfitCoef(5.0);
    exe.setMineralProfitCoef(2.5);
    exe.setProfitCoef(1.1);

    MissionOrder COMM = new MissionOrder();
    COMM.setMissionType(MissionExecutor.MISSION_COMM);
    COMM.setShuttleQty(500);
    COMM.setShuttleEff(1.0);
    COMM.setNovarsMaxProfit(8000);
    COMM.setMineralMaxProfit(12000);
    MissionResult res = new MissionResult();
    res.setNovarsProfit(exe.calculateNovarsProfit(COMM));
    res.setMineralProfit(exe.calculateMineralsProfit(COMM));
    exe.applyMissionCoef(res);

    Assert.assertEquals(res.getNovarsProfit(), 2750);
    Assert.assertEquals(res.getMineralProfit(), 1375);

    COMM.setShuttleEff(4.5);
    res.setNovarsProfit(exe.calculateNovarsProfit(COMM));
    res.setMineralProfit(exe.calculateMineralsProfit(COMM));
    exe.applyMissionCoef(res);

    Assert.assertEquals(res.getNovarsProfit(), 8800);
    Assert.assertEquals(res.getMineralProfit(), 6188);

    COMM.setShuttleQty(1500);
    COMM.setShuttleEff(9.99);
    res.setNovarsProfit(exe.calculateNovarsProfit(COMM));
    res.setMineralProfit(exe.calculateMineralsProfit(COMM));
    exe.applyMissionCoef(res);

    Assert.assertEquals(res.getNovarsProfit(), 8800);
    Assert.assertEquals(res.getMineralProfit(), 13201);
  }

  public void starDevRateCoefTest(){
    MissionExecutor exe = MissionExecutorFactory.getInstance().getMissionExecutor(MissionExecutor.MISSION_COMM);
    exe.setNovarsProfitCoef(5.0);
    exe.setMineralProfitCoef(2.5);
    exe.setProfitCoef(1.1);
    exe.setDevRateDivisor(10.0);

    MissionOrder COMM = new MissionOrder();
    COMM.setMissionType(MissionExecutor.MISSION_COMM);
    COMM.setShuttleQty(500);
    COMM.setShuttleEff(1.0);
    COMM.setNovarsMaxProfit(8000);
    COMM.setMineralMaxProfit(12000);
    MissionResult res = new MissionResult();
    res.setNovarsProfit(exe.calculateNovarsProfit(COMM));
    res.setMineralProfit(exe.calculateMineralsProfit(COMM));
    exe.applyMissionCoef(res);
    Star s = new Star();
    s.setDevelopmentRate(5.0);
    try {
      exe.applyStarDevRate(res, s);
    } catch (MissionExecutorException e) {
      logger.debug(e.getMessage());
    }

    Assert.assertEquals(res.getNovarsProfit(), 3438);
    Assert.assertEquals(res.getMineralProfit(), 1719);

    s.setDevelopmentRate(9.99);
    try {
      exe.applyStarDevRate(res, s);
    } catch (MissionExecutorException e) {
      logger.debug(e.getMessage());
    }

    Assert.assertEquals(res.getNovarsProfit(), 5156);
    Assert.assertEquals(res.getMineralProfit(), 2578);
  }

  /*public void missionExecutorCOMMImplTest() {
    MissionExecutor exe = MissionExecutorFactory.getInstance().getMissionExecutor(MissionExecutor.MISSION_COMM);
    exe.setNovarsProfitCoef(5.0);
    exe.setMineralProfitCoef(2.5);
    exe.setProfitCoef(1.1);

    MissionOrder COMM = new MissionOrder();
    COMM.setMissionType(MissionExecutor.MISSION_COMM);
    COMM.setShuttleQty(500);
    COMM.setShuttleEff(1.0);
    COMM.setNovarsMaxProfit(8000);
    COMM.setMineralMaxProfit(12000);
    MissionResult res = exe.execute(COMM);

    Assert.assertEquals(res.getNovarsProfit(), 2750);
    Assert.assertEquals(res.getMineralProfit(), 1375);

    COMM.setShuttleEff(4.5);

    Assert.assertEquals(res.getNovarsProfit(), 8800);
    Assert.assertEquals(res.getMineralProfit(), 6188);

    COMM.setShuttleQty(1500);
    COMM.setShuttleEff(9.99);

    Assert.assertEquals(res.getNovarsProfit(), 8800);
    Assert.assertEquals(res.getMineralProfit(), 13201);
  }*/
}
