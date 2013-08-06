package fr.nemak3.server.map;

import fr.nemak3.core.GameSettings;
import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.Sector;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GalaxyGeneratorTinySizeImplTest {

    private GalaxyGenerator getGalaxyGenerator(int starsBySector, int sectorWidth, int sectorHeight, int nbSectors) {
        GalaxyGeneratorSettings config = GameSettings.getInstance().getGalaxyGeneratorSettings();

        config.setGalaxyName("test");
        config.setStarsBySector(starsBySector);
        config.setSectorWidth(sectorWidth);
        config.setSectorHeight(sectorHeight);
        config.setNbSectors(nbSectors);

        GalaxyGeneratorFactory factory = GalaxyGeneratorFactory.getInstance();
        GalaxyGenerator gen = null;

        try {
            gen = factory.getGenerator(GalaxyGeneratorFactory.TINY_SIZE, config);
        } catch (GalaxyGeneratorException e) {
            Assert.fail("Failed to get GalaxyGeneratorFactory.TINY_SIZE " + e.getMessage());
        }

        return gen;
    }

    @Test
    public void initializeTest() {
        GalaxyGeneratorTinySizeImpl gen = (GalaxyGeneratorTinySizeImpl) getGalaxyGenerator(100, 1000, 1000, 1);

        gen.initialize();

        Galaxy g = gen.getGalaxy();
        Assert.assertEquals(g.getWidth(), 1000);
        Assert.assertEquals(g.getHeight(), 1000);

        Sector[][] sectors = gen.getSectorsStructure();
        Sector s = sectors[0][0];
        Assert.assertNotNull(s);
        Assert.assertEquals(s.getName(), "A1");
    }

    @Test
    public void generateStarsTest() {
        GalaxyGeneratorTinySizeImpl gen = (GalaxyGeneratorTinySizeImpl) getGalaxyGenerator(100, 1000, 1000, 1);

        Galaxy g = null;

        try {
            g = gen.generate();
        } catch (GalaxyGeneratorException | StarGeneratorException e) {
            Assert.fail("Failed generate galaxy from GalaxyGeneratorFactory.TINY_SIZE " + e.getMessage());
        }

        Assert.assertNotNull(g.getSectorsIdList());
        Assert.assertNotNull(g.getStarsIdMap());
        Assert.assertEquals(g.getStarsIdMap().values().size(), 100);

        GalaxyMapJpegCreator jpeg = new GalaxyMapJpegCreator(g, "galaxy-map.jpg");
        try {
            jpeg.saveFile();
        } catch (IOException e) {
            Assert.fail("Failed to generate galaxy jpg file from GalaxyGeneratorFactory.TINY_SIZE " + e.getMessage());
        }
    }
}
