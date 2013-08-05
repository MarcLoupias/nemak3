package fr.nemak3.core.map;


import fr.nemak3.core.GameObject;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Sector extends GameObject {

  @NotNull
  private String name;
  @NotNull
  private MapArea sectorArea;
  @NotNull
  private Map<String, Star> starsIdMap = new HashMap<String, Star>();

  //private SectorType sectorType;


  @NotNull
  public String getName() {
    return name;
  }

  public void setName(@NotNull String name) {
    this.name = name;
  }

  @NotNull
  public MapArea getSectorArea() {
    return sectorArea;
  }

  public void setSectorArea(@NotNull MapArea sectorArea) {
    this.sectorArea = sectorArea;
  }

  @NotNull
  public Map<String, Star> getStarsIdMap() {
    return starsIdMap;
  }

  public void setStarsIdMap(@NotNull Map<String, Star> starsIdMap) {
    this.starsIdMap = starsIdMap;
  }
}
