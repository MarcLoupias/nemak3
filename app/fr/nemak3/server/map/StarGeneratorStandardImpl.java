package fr.nemak3.server.map;


import fr.nemak3.core.map.Star;
import fr.nemak3.tools.RandomGenerator;
import org.jetbrains.annotations.NotNull;

public class StarGeneratorStandardImpl extends StarGenerator {

  public StarGeneratorStandardImpl(@NotNull StarGeneratorSettings config) {
    super(config);
  }

  @Override
  Star generate() throws StarGeneratorException {
    Star s = new Star();
    s.setName(generateStarName());

    // military
    s.setNbWarriors(RandomGenerator.generateInt(config.getNbWarriorsMin(), config.getNbWarriorsMax()));
    s.setNbLasers(RandomGenerator.generateInt(config.getNbLasersMin(), config.getNbLasersMax()));
    s.setNbMissiles(RandomGenerator.generateInt(config.getNbMissilesMin(), config.getNbMissilesMax()));

    // structure
    s.setMass(RandomGenerator.generateInt(config.getMassMin(), config.getMassMax()));
    s.setPop(RandomGenerator.generateInt(config.getPopMin(), s.getMass()));

    // social
    double probaStatus = RandomGenerator.generateDouble(0.0, 100.0);
    s.setStarStatus( (probaStatus <= config.getStarStatusProbability()) ? Star.StarStatus.PEACE : Star.StarStatus.WAR);
    s.setHappinessRate(RandomGenerator.generateInt(config.getHappinessRateMin(), config.getHappinessRateMax()));
    s.setAuthorityRate(RandomGenerator.generateInt(config.getAuthorityRateMin(), config.getAuthorityRateMax()));

    // economics
    s.setDevelopmentRate(RandomGenerator.generateDouble(config.getDevelopmentRateMin(), config.getDevelopmentRateMax()));
    s.setHabitabilityRate(RandomGenerator.generateInt(config.getHabitabilityRateMin(), config.getHabitabilityRateMax()));

    double probaKlunk = RandomGenerator.generateDouble(0.0, 100.0);
    s.setKlunkDeposit( (probaKlunk <= config.getKlunkDepositProbability()) );
    double probaOsium = RandomGenerator.generateDouble(0.0, 100.0);
    s.setOsiumDeposit( (probaOsium <= config.getOsiumDepositProbability()) );

    return s;
  }
}
