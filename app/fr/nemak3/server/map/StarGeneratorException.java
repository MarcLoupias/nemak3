package fr.nemak3.server.map;


import org.jetbrains.annotations.NotNull;

public class StarGeneratorException extends Exception {
  public StarGeneratorException(){
    super();
  }
  public StarGeneratorException(@NotNull String s){
    super(s);
  }
}
