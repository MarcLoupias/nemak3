package fr.nemak3.core;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 25/06/13
 * Time: 23:56
 * To change this template use File | Settings | File Templates.
 */
public class GameSettings extends Game {
  private static final GameSettings instance = new GameSettings();

  private static final int STOCK_MIN = 0;
  private static final int STOCK_MAX = 999999;
  private static final double EFFICIENCY_MIN = 1.0;
  private static final double EFFICIENCY_MAX = 9.99;



  public static GameSettings getInstance() {
    return instance;
  }

  private GameSettings(){

  }

  private void loadGameSettings() {

  }
}
