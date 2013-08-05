package fr.nemak3.core;

import org.jetbrains.annotations.NotNull;


public class Game extends GameObject {

  @NotNull
  private String name;

  @NotNull
  public String getName() {
    return name;
  }

  public void setName(@NotNull String name) {
    this.name = name;
  }
}
