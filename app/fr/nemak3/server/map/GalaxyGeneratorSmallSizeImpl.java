package fr.nemak3.server.map;

import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.Sector;
import org.jetbrains.annotations.NotNull;

/**
 * <p>Small size is 4 sectors</p>
 * <pre>
 * +--+--+
 * |A1|A2|
 * +--+--+
 * |B1|B2|
 * +--+--+
 * </pre>
 */
public class GalaxyGeneratorSmallSizeImpl extends GalaxyGenerator {

  protected GalaxyGeneratorSmallSizeImpl(@NotNull GalaxyGeneratorSettings config) {
    super(config);
  }

  @Override
  Galaxy generate() throws GalaxyGeneratorException, StarGeneratorException {
    initialize();
    generateStars();
    return galaxy;
  }

  protected void initialize(){
    int sW = config.getSectorWidth();
    int sH = config.getSectorHeight();

    galaxy = new Galaxy(config.getGalaxyName());
    galaxy.setWidth(sW);
    galaxy.setHeight(sH);

    Sector A1 = new Sector();
    A1.setName("A1");
//    A1.setSectorArea(
//            new MapArea(
//                    calculateGalaxyPosA(),
//                    calculateGalaxyPosB(1, sW),
//                    calculateGalaxyPosC(1, sW, sH),
//                    calculateGalaxyPosD(1, sH)
//            )
//    );

    Sector A2 = new Sector();
    A2.setName("A2");

    Sector B1 = new Sector();
    B1.setName("B1");

    Sector B2 = new Sector();
    B2.setName("B2");

    Sector[][] tmpSectorsStructure = { { A1, A2, B1, B2 } };
    sectorsStructure = tmpSectorsStructure.clone();
  }

  protected void generateStars() throws StarGeneratorException {

  }

}
