package fr.nemak3;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 19:50
 * To change this template use File | Settings | File Templates.
 */
public class Nemak3ManageGameTest extends Nemak3GameManagerDataMockup {
    @Test
    public void testNemak3ManageGame() {

        String gameName = "lapartiedetoto";

        Game myGame = GameManager.getInstance().loadGame(gameOwnerToto, gameName);

        assertNotNull(myGame);
    }
}
