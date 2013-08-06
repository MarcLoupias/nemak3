package fr.nemak3.server.map;

import org.jetbrains.annotations.NotNull;

public class GalaxyGeneratorFactory {
  private static GalaxyGeneratorFactory ourInstance = new GalaxyGeneratorFactory();

  public static final int UNKNOWN = 0;
  public static final int TINY_SIZE = 1;
  public static final int SMALL_SIZE = 2;
  public static final int STANDARD_SIZE = 3;
  //public static final int BIG_SIZE = 4;

  public static GalaxyGeneratorFactory getInstance() {
    return ourInstance;
  }

  private GalaxyGeneratorFactory() {
  }

  public GalaxyGenerator getGenerator(int impl, @NotNull GalaxyGeneratorSettings config)
          throws GalaxyGeneratorException {
    switch(impl) {
      case TINY_SIZE:{
        return new GalaxyGeneratorTinySizeImpl(config);
      }
      case SMALL_SIZE:{
        return new GalaxyGeneratorSmallSizeImpl(config);
      }
      case STANDARD_SIZE:{
        return new GalaxyGeneratorStandardSizeImpl(config);
      }
      case UNKNOWN:{
        throw new GalaxyGeneratorException("GalaxyGenerator impl is unknown");
      }
      default:{
        throw new GalaxyGeneratorException("GalaxyGenerator impl is unknown");
      }
    }
  }
}
