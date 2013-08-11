package fr.nemak3.core.mission;

import fr.nemak3.core.map.Star;
import fr.nemak3.core.map.StarStatus;
import org.junit.Assert;
import org.junit.Test;

public class MissionExecutorTest {

  @Test
  public void calculateNovarsProfitTest() {
    MissionExecutor exe = MissionExecutorFactory.getInstance().getMissionExecutor(MissionExecutor.MISSION_COMM);
    exe.setNovarsProfitCoef(5.0);
    int res = 0;

    MissionOrder COMM = new MissionOrder();
    COMM.setMissionType(MissionExecutor.MISSION_COMM);
    COMM.setShuttleQty(500);
    COMM.setShuttleEff(1.0);
    COMM.setNovarsMaxProfit(8000);
    res = exe.calculateNovarsProfit(COMM);
    Assert.assertEquals(res, 2500);

    COMM.setShuttleEff(2.0);
    res = exe.calculateNovarsProfit(COMM);
    Assert.assertEquals(res, 5000);

    COMM.setShuttleEff(6.0);
    res = exe.calculateNovarsProfit(COMM);
    Assert.assertEquals(res, 8000);
  }

  @Test
  public void calculateMineralsProfitTest() {
    MissionExecutor exe = MissionExecutorFactory.getInstance().getMissionExecutor(MissionExecutor.MISSION_COMM);
    exe.setMineralProfitCoef(2.5);
    int res = 0;

    MissionOrder COMM = new MissionOrder();
    COMM.setMissionType(MissionExecutor.MISSION_COMM);
    COMM.setShuttleQty(500);
    COMM.setShuttleEff(1.0);
    COMM.setMineralMaxProfit(12000);
    res = exe.calculateMineralsProfit(COMM);
    Assert.assertEquals(res, 1250);

    COMM.setShuttleEff(2.0);
    res = exe.calculateMineralsProfit(COMM);
    Assert.assertEquals(res, 2500);

    COMM.setShuttleEff(9.99);
    res = exe.calculateMineralsProfit(COMM);
    Assert.assertEquals(res, 12000);
  }

  @Test
  public void calculateElectronicComponentsProfitTest() {
    MissionExecutor exe = MissionExecutorFactory.getInstance().getMissionExecutor(MissionExecutor.MISSION_PILL);
    exe.setCeProfitCoef(0.3);
    int res = 0;

    MissionOrder PILL = new MissionOrder();
    PILL.setMissionType(MissionExecutor.MISSION_PILL);
    PILL.setShuttleQty(250);
    PILL.setShuttleEff(1.0);
    PILL.setCeMaxProfit(1000);
    res = exe.calculateElectronicComponentsProfit(PILL);
    Assert.assertEquals(res, 75);

    PILL.setShuttleEff(2.0);
    res = exe.calculateElectronicComponentsProfit(PILL);
    Assert.assertEquals(res, 150);

    PILL.setShuttleEff(9.99);
    res = exe.calculateElectronicComponentsProfit(PILL);
    Assert.assertEquals(res, 750);

    PILL.setShuttleQty(400);
    res = exe.calculateElectronicComponentsProfit(PILL);
    Assert.assertEquals(res, 1000);
  }

  @Test
  public void calculateErdividiumProfitTest() {
    MissionExecutor exe = MissionExecutorFactory.getInstance().getMissionExecutor(MissionExecutor.MISSION_ERDI);
    exe.setErdiProfitCoef(0.3);
    int res = 0;

    MissionOrder ERDI = new MissionOrder();
    ERDI.setMissionType(MissionExecutor.MISSION_ERDI);
    ERDI.setShuttleQty(250);
    ERDI.setShuttleEff(1.0);
    ERDI.setErdiMaxProfit(500);
    res = exe.calculateErdividiumProfit(ERDI);
    Assert.assertEquals(res, 75);

    ERDI.setShuttleEff(2.0);
    res = exe.calculateErdividiumProfit(ERDI);
    Assert.assertEquals(res, 150);

    ERDI.setShuttleEff(9.99);
    res = exe.calculateErdividiumProfit(ERDI);
    Assert.assertEquals(res, 500);

  }

  @Test
  public void calculateShuttlesLossesRateTest(){
    MissionExecutor exe = MissionExecutorFactory.getInstance().getMissionExecutor(MissionExecutor.MISSION_COMM);
    exe.setHabitabilityInfluenceCoefOnShuttlesLossesRate(2);
    exe.setShuttleEfficiencyInfluenceCoefOnShuttlesLossesRate(5);
    exe.setStarOwnershipInfluenceOnShuttlesLossesRate(20);
    exe.setStarStatusInfluenceOnShuttlesLossesRate(20);
    exe.setMissionShuttlesLossesBaseRate(30);

    MissionResult COMM = new MissionResult();
    COMM.setShuttleQty(500);
    COMM.setShuttleEff(1.0);
    COMM.setMissionType(MissionExecutor.MISSION_COMM);
    COMM.setCommanderOwnerId(38);
    COMM.setStarTargetId(5);
    Star star = new Star();
    star.setId(5l);
    star.setStarStatus(StarStatus.PEACE);
    star.setHabitabilityRate(5);

    int lossesRate = exe.calculateShuttlesLossesRate(COMM, star);
    Assert.assertEquals(lossesRate, 23);

    exe.calculateShuttlesLosses(COMM, star);
    int qtyLosses = COMM.getShuttleLossesQty();
    Assert.assertEquals(qtyLosses, 115);

    COMM.setShuttleEff(9.99);
    lossesRate = exe.calculateShuttlesLossesRate(COMM, star);
    Assert.assertEquals(lossesRate, 0);

    exe.calculateShuttlesLosses(COMM, star);
    qtyLosses = COMM.getShuttleLossesQty();
    Assert.assertEquals(qtyLosses, 0);
  }
}
