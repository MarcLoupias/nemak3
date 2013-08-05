package fr.nemak3.server.map;


import fr.nemak3.core.map.Star;
import fr.nemak3.tools.RandomGenerator;
import org.apache.commons.configuration.ConfigurationException;
import org.jetbrains.annotations.NotNull;

public abstract class StarGenerator {

  @NotNull
  protected StarGeneratorConfig config;

  protected StarGenerator(@NotNull StarGeneratorConfig config) throws ConfigurationException {
    this.config = config;
    this.config.load();
  }

  abstract Star generate() throws StarGeneratorException;

  @NotNull
  protected String generateStarName() {
    StringBuilder name = new StringBuilder();

    char[] consonantList = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
                            'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};
    char[] vowelList = {'A', 'E', 'I', 'O', 'U', 'Y'};

    name.append( consonantList[RandomGenerator.generateInt(0, (consonantList.length - 1))] );
    name.append( vowelList[RandomGenerator.generateInt(0, (vowelList.length - 1))] );
    name.append( consonantList[RandomGenerator.generateInt(0, (consonantList.length - 1))] );
    name.append( vowelList[RandomGenerator.generateInt(0, (vowelList.length - 1))] );
    name.append( consonantList[RandomGenerator.generateInt(0, (consonantList.length - 1))] );

    return name.toString();
  }
}