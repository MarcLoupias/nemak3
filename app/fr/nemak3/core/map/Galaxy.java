package fr.nemak3.core.map;


import fr.nemak3.core.GameObject;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Galaxy extends GameObject {

  @NotNull
  private String name;

  private int width;
  private int height;

  private Map<String, Star> starsIdMap = new HashMap<String, Star>();
  private Map<String, Sector> sectorsIdList = new HashMap<String, Sector>();

  @NotNull
  public String getName() {
    return name;
  }

  public void setName(@NotNull String name) {
    this.name = name;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public Map<String, Star> getStarsIdMap() {
    return starsIdMap;
  }

  public void setStarsIdMap(Map<String, Star> starsIdMap) {
    this.starsIdMap = starsIdMap;
  }

  public Map<String, Sector> getSectorsIdList() {
    return sectorsIdList;
  }

  public void setSectorsIdList(Map<String, Sector> sectorsIdList) {
    this.sectorsIdList = sectorsIdList;
  }

  private Galaxy(){

  }

  public Galaxy(@NotNull String name){
    this.name = name;
  }

}
