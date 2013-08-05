package fr.nemak3.server.map;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

@Test
public class GalaxyGeneratorConfigTest {
  private static final Logger logger = Logger.getLogger(GalaxyGeneratorConfigTest.class);

  @Test
  public void configFileTest(){
    GalaxyGeneratorConfig config;
    File f = new File("game-server/src/main/resources/galaxy-generator-test.properties");
    logger.debug("GalaxyGeneratorConfigTest config file path " + f.getAbsolutePath());

    try {

      config = new GalaxyGeneratorConfig(f);
      config.setNbSectors(9);
      config.setSectorHeight(1000);
      config.setSectorWidth(1000);
      config.setStarsBySector(100);
      config.save();

      config = new GalaxyGeneratorConfig(f);
      config.load();
      Assert.assertEquals(config.getNbSectors(), 9);
      Assert.assertEquals(config.getSectorHeight(), 1000);
      Assert.assertEquals(config.getSectorWidth(), 1000);
      Assert.assertEquals(config.getStarsBySector(), 100);

    } catch (ConfigurationException e) {
      Assert.fail("Exception on GalaxyGeneratorConfig", e);
    }

    Assert.assertTrue(f.exists(), "Config file " + f.getAbsolutePath() + " does not exist.");
  }
}
