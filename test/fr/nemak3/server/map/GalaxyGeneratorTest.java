package fr.nemak3.server.map;

import fr.nemak3.core.GameSettings;
import fr.nemak3.core.map.Galaxy;
import org.junit.Assert;
import org.junit.Test;

public class GalaxyGeneratorTest {

    //@Test
    public void galaxyGeneratorStandardImplTest() {
        GalaxyGeneratorSettings config = GameSettings.getInstance().getGalaxyGeneratorSettings();

        config.setStarsBySector(100);
        config.setSectorWidth(1000);
        config.setSectorHeight(1000);
        config.setNbSectors(9);

        GalaxyGeneratorFactory factory = GalaxyGeneratorFactory.getInstance();
        GalaxyGenerator gen = null;

        try {
            gen = factory.getGenerator(GalaxyGeneratorFactory.STANDARD_SIZE, config);
        } catch (GalaxyGeneratorException e) {
            Assert.fail("Failed to get GalaxyGeneratorFactory.STANDARD_SIZE " + e.getMessage());
        }

        Galaxy g = null;

        try {
            g = gen.generate();
        } catch (GalaxyGeneratorException | StarGeneratorException e) {
            Assert.fail("Failed to generate galaxy with impl : " + GalaxyGeneratorFactory.STANDARD_SIZE + " " + e.getMessage());
        }

        Assert.assertNotNull(g);

    }
}
