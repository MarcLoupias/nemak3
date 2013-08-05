package fr.nemak3.server.execution;


public class TurnManager {

  private static final TurnManager instance = new TurnManager();

  public TurnManager getInstance(){
    return instance;
  }

  private TurnManager(){

  }

  public void execute(TurnPhase phase) {
    switch(phase){
      case INSCRIPTIONS:{
        new TurnPhaseExecutorInscriptions().execute();
        break;
      }
      case SITUATIONS_GENERATION:{
        new TurnPhaseExecutorSituationsGeneration().execute();
        break;
      }
      case SITUATIONS_SENDING:{
        new TurnPhaseExecutorSituationsSending().execute();
        break;
      }
      case SITUATIONS_SEND:{
        // just set status
        break;
      }
      case ORDERS_INTEGRATION:{
        new TurnPhaseExecutorOrdersIntegration().execute();
        break;
      }
      case ORDERS_EXECUTION:{
        new TurnPhaseExecutorOrdersExecution().execute();
        break;
      }
      default:{
        // just set error
        break;
      }
    }
  }
}
