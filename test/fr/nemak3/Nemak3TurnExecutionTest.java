package fr.nemak3;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 23:01
 * To change this template use File | Settings | File Templates.
 */
public class Nemak3TurnExecutionTest extends Nemak3GameExecutorDataMockup {

    @Test
    public void testNemak3TurnExecution() {
        TurnExecutor.getInstance().execute();
    }
}
