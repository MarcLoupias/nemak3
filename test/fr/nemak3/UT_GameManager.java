package fr.nemak3;

import fr.nemak3.core.Game;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertNotNull;

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
