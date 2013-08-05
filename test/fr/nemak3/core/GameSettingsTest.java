package fr.nemak3.core;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 26/06/13
 * Time: 00:00
 * To change this template use File | Settings | File Templates.
 */
@Test
public class GameSettingsTest {

  @Test
  public void privateConstructorTest() {
    GameSettings gs = GameSettings.getInstance();

  }
}
