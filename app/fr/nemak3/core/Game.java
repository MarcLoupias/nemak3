package fr.nemak3.core;

import fr.nemak3.core.map.Galaxy;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class Game extends GameObject {

    @NotNull
    private String name;
    private Player gameOwner;
    private List<Player> playerList;
    private Galaxy galaxy;
    private GameStatus gameStatus;

    public enum GameStatus {
        AWAITING_ORDERS, EXECUTE_ORDERS
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
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

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}
