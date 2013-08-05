package fr.nemak3.server.map;

import fr.nemak3.core.map.Galaxy;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class GalaxyGeneratorTest {

  @Test(enabled = false)
  public void galaxyGeneratorStandardImplTest() {
    GalaxyGeneratorConfig config = null;
    try {
      config = new GalaxyGeneratorConfig("test");
    } catch (ConfigurationException e) {
      Assert.fail("", e);
    }

    config.setStarsBySector(100);
    config.setSectorWidth(1000);
    config.setSectorHeight(1000);
    config.setNbSectors(9);

    GalaxyGeneratorFactory factory = GalaxyGeneratorFactory.getInstance();
    GalaxyGenerator gen = null;

    try {
      gen = factory.getGenerator(GalaxyGeneratorFactory.STANDARD_SIZE, config);
    } catch (GalaxyGeneratorException e) {
      Assert.fail("Failed to get GalaxyGeneratorFactory.STANDARD_SIZE", e);
    } catch (ConfigurationException e) {
      Assert.fail("Failed to load GalaxyGeneratorFactory.STANDARD_SIZE config file " +
              config.getConfig().getFile().getAbsolutePath(), e);
    }

    Galaxy g = null;

    try {
      g = gen.generate();
    } catch (GalaxyGeneratorException e) {
      Assert.fail("Failed to generate galaxy with impl : " + GalaxyGeneratorFactory.STANDARD_SIZE, e);
    } catch (StarGeneratorException e) {
      Assert.fail("Failed to generate galaxy with impl : " + GalaxyGeneratorFactory.STANDARD_SIZE, e);
    } catch (ConfigurationException e) {
      Assert.fail("Failed to generate galaxy with impl : " + GalaxyGeneratorFactory.STANDARD_SIZE, e);
    }

    Assert.assertNotNull(g);

  }
}
