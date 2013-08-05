package fr.nemak3.core;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 26/05/13
 * Time: 19:24
 * To change this template use File | Settings | File Templates.
 */
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
