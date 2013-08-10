package fr.nemak3;

import fr.nemak3.core.Game;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 10/08/13
 * Time: 13:33
 * To change this template use File | Settings | File Templates.
 */
public class UT_GameManager extends UT_GameManagerDataMockup {

    @Test
    public void testCreateGame() {

    }

    @Test
    public void testListGames() {
        List<Game> gameList = GameManager.getInstance().listGames(gameOwnerToto);
        assertNotNull(gameList);
    }

    @Test
    public void testLoadGame() {

    }

    @Test
    public void testExecuteTurn() {

    }

    @Test
    public void testCloseGame() {

    }



}
