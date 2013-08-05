package fr.nemak3.core.mission;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 23/06/13
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
public class MissionExecutorFactory {
  private static MissionExecutorFactory instance = new MissionExecutorFactory();

  public static MissionExecutorFactory getInstance() {
    return instance;
  }

  private MissionExecutorFactory() {

  }

  public MissionExecutor getMissionExecutor(int missionType) {
    switch(missionType){
      case MissionExecutor.MISSION_COMM:{
        return new MissionExecutorCOMMImpl();
      }
      case MissionExecutor.MISSION_PILL:{
        return new MissionExecutorPILLImpl();
      }
      case MissionExecutor.MISSION_ERDI:{
        return new MissionExecutorERDIImpl();
      }
      default:{
        return null;
      }
    }
  }
}
