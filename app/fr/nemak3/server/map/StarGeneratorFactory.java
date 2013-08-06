package fr.nemak3.server.map;

import org.jetbrains.annotations.NotNull;

public class StarGeneratorFactory {
  private static StarGeneratorFactory ourInstance = new StarGeneratorFactory();

  public static final int UNKNOWN = 0;
  public static final int STANDARD = 1;

  public static StarGeneratorFactory getInstance() {
    return ourInstance;
  }

  private StarGeneratorFactory() {
  }

  public StarGenerator getGenerator(int impl, @NotNull StarGeneratorSettings config)
          throws StarGeneratorException {
    switch(impl) {
      case STANDARD:{
        return new StarGeneratorStandardImpl(config);
      }
      case UNKNOWN:{
        throw new StarGeneratorException("StarGenerator impl is unknown");
      }
      default:{
        throw new StarGeneratorException("StarGenerator impl is unknown");
      }
    }
  }
}
