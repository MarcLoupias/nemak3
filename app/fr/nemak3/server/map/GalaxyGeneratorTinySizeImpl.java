package fr.nemak3.server.map;

import fr.nemak3.core.GameSettings;
import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.MapPosition;
import fr.nemak3.core.map.Sector;
import fr.nemak3.core.map.Star;
import fr.nemak3.tools.RandomGenerator;
import org.jetbrains.annotations.NotNull;

/**
 * Tiny size is 1 sector
 * <pre>
 * +--+
 * |A1|
 * +--+
 * </pre>
 */
public class GalaxyGeneratorTinySizeImpl extends GalaxyGenerator {

  protected GalaxyGeneratorTinySizeImpl(@NotNull GalaxyGeneratorSettings config) {
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

    Sector[][] tmpSectorsStructure = { { A1 } };
    sectorsStructure = tmpSectorsStructure.clone();
  }

  protected void generateStars() throws StarGeneratorException {

    Sector A1 = sectorsStructure[0][0];
    int nbStars = config.getStarsBySector();

    int baseXMax = galaxy.getWidth();
    int baseXMin = 1;
    int baseYMax = galaxy.getHeight();
    int baseYMin = 1;

    for(int i = 1; i <= nbStars; i++){

      // generate position

      MapPosition starPos = new MapPosition(
              RandomGenerator.generateInt( (baseXMin + 1), (baseXMax - 1)),
              RandomGenerator.generateInt( (baseYMin + 1), (baseYMax - 1))
      );
      if(i > 1){
        boolean ok = true;
        while(ok){
          for(Star s : galaxy.getStars().values()){
            if(s.getPosition().isPositionExist(starPos, 100)){
              starPos = new MapPosition(
                      RandomGenerator.generateInt( (baseXMin + 1), (baseXMax - 1)),
                      RandomGenerator.generateInt( (baseYMin + 1), (baseYMax - 1))
              );
              break;
            } else {
              ok = false;
            }
          }
        }
      }

      Star s;
      StarGenerator starG;

      starG = StarGeneratorFactory.getInstance().getGenerator(
              StarGeneratorFactory.STANDARD,
              GameSettings.getInstance().getStarGeneratorSettings()
      );

      // generate star stats & name

      s = starG.generate();
      while(galaxy.getStars().get(s.getName()) != null){
        s.setName(starG.generateStarName());
      }
      s.setPosition(starPos);

      // add star

      galaxy.getStars().put(s.getName(), s);
      A1.getStarsMap().put(s.getName(), s);
    }
  }
}
