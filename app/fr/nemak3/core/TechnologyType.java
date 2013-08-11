package fr.nemak3.core;

import org.jetbrains.annotations.NotNull;

public enum TechnologyType {
  MILITARY ("M", "Militaire"),
  DEFENSIVE ("D", "Défensive"),
  COMBINATORY ("C", "Combinatoire");

  @NotNull
  private String code;
  @NotNull
  private String name;

  @NotNull
  public String getCode() {
    return code;
  }

  @NotNull
  public String getName() {
    return name;
  }

  private TechnologyType(@NotNull String code, @NotNull String name) {
    this.code = code;
    this.name = name;
  }
}
