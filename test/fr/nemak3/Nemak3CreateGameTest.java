package fr.nemak3;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 19:50
 * To change this template use File | Settings | File Templates.
 */
public class Nemak3CreateGameTest extends Nemak3GameManagerDataMockup {
    @Test
    public void testNemak3CreateGame(){
        GameManager.getInstance().createGame();
    }
}
