package fr.nemak3.core.map;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *  A      B
 *   +----+
 *   |    |
 *   |    |
 *   +----+
 *  D      C
 */
@Embeddable
public class MapArea {

  @NotNull
  @Embedded
  private MapPosition pA;
  @NotNull
  @Embedded
  private MapPosition pB;
  @NotNull
  @Embedded
  private MapPosition pC;
  @NotNull
  @Embedded
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

  public MapArea(){

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
