package fr.nemak3.server.map;


import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.Sector;
import org.jetbrains.annotations.NotNull;

public abstract class GalaxyGenerator {

  @NotNull
  protected Galaxy galaxy;

  @NotNull
  protected GalaxyGeneratorSettings config;

  protected Sector[][] sectorsStructure;

  protected GalaxyGenerator(@NotNull GalaxyGeneratorSettings config) {
    this.config = config;
  }

  @NotNull
  protected Galaxy getGalaxy() {
    return galaxy;
  }

  @NotNull
  protected GalaxyGeneratorSettings getConfig() {
    return config;
  }

  protected Sector[][] getSectorsStructure() {
    return sectorsStructure;
  }

  abstract protected void initialize();

  abstract protected void generateStars() throws StarGeneratorException;

  abstract Galaxy generate() throws GalaxyGeneratorException, StarGeneratorException;
}
