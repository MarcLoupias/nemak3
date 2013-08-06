package fr.nemak3;

import fr.nemak3.core.Game;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 20:57
 * To change this template use File | Settings | File Templates.
 */
public class Nemak3ListGameTest extends Nemak3GameManagerDataMockup {

    @Test
    public void testNemak3ListGame() {
        List<Game> gameList = GameManager.getInstance().listGames(gameOwnerToto);
        assertNotNull(gameList);
    }
}
