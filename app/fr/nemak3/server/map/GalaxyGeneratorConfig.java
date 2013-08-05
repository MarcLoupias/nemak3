package fr.nemak3.server.map;

import fr.nemak3.tools.Nemak3ConfigFile;
import org.apache.commons.configuration.ConfigurationException;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class GalaxyGeneratorConfig extends Nemak3ConfigFile {

  @NotNull
  private String galaxyName;

  private int nbSectors;
  private int sectorWidth;
  private int sectorHeight;

  private int starsBySector;


  public int getNbSectors() {
    return nbSectors;
  }

  public void setNbSectors(int nbSectors) {
    this.nbSectors = nbSectors;
  }

  public int getSectorWidth() {
    return sectorWidth;
  }

  public void setSectorWidth(int sectorWidth) {
    this.sectorWidth = sectorWidth;
  }

  public int getSectorHeight() {
    return sectorHeight;
  }

  public void setSectorHeight(int sectorHeight) {
    this.sectorHeight = sectorHeight;
  }

  public int getStarsBySector() {
    return starsBySector;
  }

  public void setStarsBySector(int starsBySector) {
    this.starsBySector = starsBySector;
  }

  @NotNull
  public String getGalaxyName() {
    return galaxyName;
  }

  public void setGalaxyName(@NotNull String galaxyName) {
    this.galaxyName = galaxyName;
  }

  public GalaxyGeneratorConfig(String path) throws ConfigurationException {
    super(path);
  }

  public GalaxyGeneratorConfig(File f) throws ConfigurationException {
    super(f);
  }

  public void load() throws ConfigurationException {
    config.load();
    this.galaxyName = config.getString("galaxy-generator.galaxyName");
    this.nbSectors = config.getInt("galaxy-generator.nbSectors");
    this.sectorWidth = config.getInt("galaxy-generator.sectorWidth");
    this.sectorHeight = config.getInt("galaxy-generator.sectorHeight");
    this.starsBySector = config.getInt("galaxy-generator.starsBySector");
  }

  public void save() throws ConfigurationException {
    config.clear();
    configLayout.setHeaderComment("galaxy-generator config file");
    config.setProperty("galaxy-generator.galaxyName", this.galaxyName);
    config.setProperty("galaxy-generator.nbSectors", this.nbSectors);
    config.setProperty("galaxy-generator.sectorWidth", this.sectorWidth);
    config.setProperty("galaxy-generator.sectorHeight", this.sectorHeight);
    config.setProperty("galaxy-generator.starsBySector", this.starsBySector);
    config.save();
  }
}
