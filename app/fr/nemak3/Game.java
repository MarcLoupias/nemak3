package fr.nemak3;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 20:16
 * To change this template use File | Settings | File Templates.
 */
public class Game extends GameObject {
    private String name;
    private Player gameOwner;
    private List<Player> playerList;
    private Galaxy galaxy;
    private GameStatus gameStatus;

    public enum GameStatus {
        AWAITING_ORDERS, EXECUTE_ORDERS
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getGameOwner() {
        return gameOwner;
    }

    public void setGameOwner(Player gameOwner) {
        this.gameOwner = gameOwner;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Galaxy getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(Galaxy galaxy) {
        this.galaxy = galaxy;
    }
}
