package fr.nemak3;

public class TurnExecutor {

    public enum TurnPhase {
        INSCRIPTIONS, ORDERS_ENTRY, BLOCK_ORDERS, EXECUTE_ORDERS, GENERATE_RESULTS
    }

    private static TurnExecutor instance = new TurnExecutor();

    public static TurnExecutor getInstance() {
        return instance;
    }

    public void execute() {
        //To change body of created methods use File | Settings | File Templates.
    }
}
