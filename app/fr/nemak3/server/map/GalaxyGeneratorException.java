package fr.nemak3.server.map;

import org.jetbrains.annotations.NotNull;

public class GalaxyGeneratorException extends Exception {

  public GalaxyGeneratorException(){
    super();
  }

  public GalaxyGeneratorException(@NotNull String s){
    super(s);
  }
}
