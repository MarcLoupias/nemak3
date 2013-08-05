package fr.nemak3.server.execution;


import fr.nemak3.core.Game;
import org.jetbrains.annotations.NotNull;

public class GameServer extends Game {

  @NotNull
  private static final GameServer instance = new GameServer();

  private GameServerContext gameServerContext;


  private GameServer(){

  }

  @NotNull
  public GameServer getInstance() {
    return instance;
  }


  public void startNewGame() {

  }

  public void loadExistingGame(long gameId) {

  }

}
