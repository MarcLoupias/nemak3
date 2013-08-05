package fr.nemak3.server.map;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

@Test
public class StarGeneratorConfigTest {
  private static final Logger logger = Logger.getLogger(StarGeneratorConfigTest.class);

  @Test
  public void configFileTest(){
    StarGeneratorConfig config;
    File f = new File("src/main/resources/star-generator-test.properties");
    logger.debug("StarGeneratorConfigTest config file path " + f.getAbsolutePath());

    try {

      config = new StarGeneratorConfig(f);
      config.load();

      config.setNbWarriorsMin(2000);
      config.setNbWarriorsMax(5000);
      config.setNbLasersMin(3000);
      config.setNbLasersMax(6000);
      config.save();

      config = new StarGeneratorConfig(f);
      config.load();
      Assert.assertEquals(config.getNbWarriorsMin(), 2000);
      Assert.assertEquals(config.getNbWarriorsMax(), 5000);
      Assert.assertEquals(config.getNbLasersMin(), 3000);
      Assert.assertEquals(config.getNbLasersMax(), 6000);

    } catch (ConfigurationException e) {
      Assert.fail("Exception on StarGeneratorConfig", e);
    }

    Assert.assertTrue(f.exists(), "Config file " + f.getAbsolutePath() + " does not exist.");
  }
}
