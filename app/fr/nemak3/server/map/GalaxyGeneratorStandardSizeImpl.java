package fr.nemak3.server.map;


import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.Sector;
import org.apache.commons.configuration.ConfigurationException;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

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

  protected GalaxyGeneratorStandardSizeImpl(@NotNull GalaxyGeneratorConfig config) throws ConfigurationException {
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
