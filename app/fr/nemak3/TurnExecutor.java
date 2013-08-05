package fr.nemak3;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
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
