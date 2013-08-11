package fr.nemak3.core.investment;

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
