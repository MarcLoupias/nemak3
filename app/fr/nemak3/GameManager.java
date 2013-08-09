package fr.nemak3;

import fr.nemak3.core.Game;
import fr.nemak3.core.Player;

import java.util.ArrayList;
import java.util.List;


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
        List<Game> gameList = new ArrayList<Game>();

        return gameList;
    }
}
