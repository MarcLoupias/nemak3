package fr.nemak3.core.map;

import org.jetbrains.annotations.NotNull;

/**
 *  A      B
 *   +----+
 *   |    |
 *   |    |
 *   +----+
 *  D      C
 */
public class MapArea {

  @NotNull
  private MapPosition pA;
  @NotNull
  private MapPosition pB;
  @NotNull
  private MapPosition pC;
  @NotNull
  private MapPosition pD;

  @NotNull
  public MapPosition getpA() {
    return pA;
  }

  @NotNull
  public MapPosition getpB() {
    return pB;
  }

  @NotNull
  public MapPosition getpC() {
    return pC;
  }

  @NotNull
  public MapPosition getpD() {
    return pD;
  }

  private MapArea(){

  }

  public MapArea(@NotNull MapPosition pA, @NotNull MapPosition pB, @NotNull MapPosition pC, @NotNull MapPosition pD){
    this.pA = pA;
    this.pB = pB;
    this.pC = pC;
    this.pD = pD;
  }

  public int calculateWidth(){
    return this.pC.getX();
  }

  public int calculateHeight(){
    return this.pD.getY();
  }
}
