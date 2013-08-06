package fr.nemak3.server.map;


import fr.nemak3.core.map.Galaxy;
import org.jetbrains.annotations.NotNull;

/**
 * <p>Standard size is 9 sectors</p>
 * <pre>
 * +--+--+--+
 * |A1|A2|A3|
 * +--+--+--+
 * |B1|B2|B3|
 * +--+--+--+
 * |C1|C2|C3|
 * +--+--+--+
 * </pre>
 */
public class GalaxyGeneratorStandardSizeImpl extends GalaxyGenerator {

  protected GalaxyGeneratorStandardSizeImpl(@NotNull GalaxyGeneratorSettings config) {
    super(config);
  }

  @Override
  Galaxy generate() throws GalaxyGeneratorException {
    return null;
  }

  protected void initialize(){

  }

  protected void generateStars(){

  }
}
