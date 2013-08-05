package fr.nemak3.core.mission;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 23/06/13
 * Time: 16:28
 * To change this template use File | Settings | File Templates.
 */
@Test
public class MissionExecutorConfigTest {
  private static final Logger logger = Logger.getLogger(MissionExecutorConfigTest.class);

  @Test
  public void missionExecutorConfigTest() {
    MissionExecutorConfig config;
    File f = new File("src/main/resources/mission-generator-test.properties");
    logger.debug("MissionExecutorConfigTest config file path " + f.getAbsolutePath());

    try {

      config = new MissionExecutorConfig(f);
      //config.setNbSectors(9);
      //config.save();

      config = new MissionExecutorConfig(f);
      //config.load();
      //Assert.assertEquals(config.getNbSectors(), 9);

    } catch (ConfigurationException e) {
      Assert.fail("Exception on MissionExecutorConfig", e);
    }

    Assert.assertTrue(f.exists(), "Config file " + f.getAbsolutePath() + " does not exist.");
  }
}
