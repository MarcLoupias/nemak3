package fr.nemak3.core.investment;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 26/06/13
 * Time: 00:07
 * To change this template use File | Settings | File Templates.
 */
public class InvestmentExecutorFactory {
  private static final InvestmentExecutorFactory instance = new InvestmentExecutorFactory();

  public static InvestmentExecutorFactory getInstance(){
    return instance;
  }

  private InvestmentExecutorFactory(){

  }

  public InvestmentExecutor getInvestmentExecutor(int type) {
    switch(type){
      /*case InvestmentExecutor.ARMOURING:{
        return new InvestmentExecutorArmouringImpl();
      }
      case InvestmentExecutor.COUNTER_INTELLIGENCE:{
        return new InvestmentExecutorCounterIntelligenceImpl();
      }
      case InvestmentExecutor.MISSION_ERDI:{
        return new MissionExecutorERDIImpl();
      }*/
      default:{
        return null;
      }
    }
  }
}
