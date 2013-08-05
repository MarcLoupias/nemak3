package fr.nemak3.server.map;


import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.MapPosition;
import fr.nemak3.core.map.Sector;
import org.apache.commons.configuration.ConfigurationException;
import org.jetbrains.annotations.NotNull;

public abstract class GalaxyGenerator {

  @NotNull
  protected Galaxy galaxy;

  @NotNull
  protected GalaxyGeneratorConfig config;

  protected Sector[][] sectorsStructure;

  protected GalaxyGenerator(@NotNull GalaxyGeneratorConfig config) throws ConfigurationException {
    this.config = config;
    this.config.load();
  }

  @NotNull
  protected Galaxy getGalaxy() {
    return galaxy;
  }

  @NotNull
  protected GalaxyGeneratorConfig getConfig() {
    return config;
  }

  protected Sector[][] getSectorsStructure() {
    return sectorsStructure;
  }

  abstract protected void initialize();

  abstract protected void generateStars() throws ConfigurationException, StarGeneratorException;

  abstract Galaxy generate() throws GalaxyGeneratorException, StarGeneratorException, ConfigurationException;
}
