package fr.nemak3;

import fr.nemak3.core.Game;
import fr.nemak3.core.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 20:14
 * To change this template use File | Settings | File Templates.
 */
public class GameManager {

    private static GameManager instance = new GameManager();

    public static GameManager getInstance() {
        return instance;
    }

    public Game createGame() {
        return new Game();  //To change body of created methods use File | Settings | File Templates.
    }

    public Game loadGame(Player gameOwner, String gameName) {
        Game game = new Game();



        return game;
    }

    public List<Game> listGames(Player gameOwnerToto) {
        List<Game> gameList = new ArrayList<>();

        return gameList;
    }
}
