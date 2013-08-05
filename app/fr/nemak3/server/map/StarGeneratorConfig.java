package fr.nemak3.server.map;


import fr.nemak3.core.map.StarStatus;
import fr.nemak3.tools.Nemak3ConfigFile;
import org.apache.commons.configuration.ConfigurationException;

import java.io.File;

public class StarGeneratorConfig extends Nemak3ConfigFile {
  private int nbWarriorsMin;
  private int nbWarriorsMax;
  private int nbLasersMin;
  private int nbLasersMax;
  private int nbMissilesMin;
  private int nbMissilesMax;

  private int massMin;
  private int massMax;
  private int popMin;
  private int popMax;
  private double starStatusProbability;
  private int happinessRateMin;
  private int happinessRateMax;
  private int authorityRateMin;
  private int authorityRateMax;
  private double developmentRateMin;
  private double developmentRateMax;
  private int habitabilityRateMin;
  private int habitabilityRateMax;
  private double klunkDepositProbability;
  private double osiumDepositProbability;

  public int getNbWarriorsMin() {
    return nbWarriorsMin;
  }

  public void setNbWarriorsMin(int nbWarriorsMin) {
    this.nbWarriorsMin = nbWarriorsMin;
  }

  public int getNbWarriorsMax() {
    return nbWarriorsMax;
  }

  public void setNbWarriorsMax(int nbWarriorsMax) {
    this.nbWarriorsMax = nbWarriorsMax;
  }

  public int getNbLasersMin() {
    return nbLasersMin;
  }

  public void setNbLasersMin(int nbLasersMin) {
    this.nbLasersMin = nbLasersMin;
  }

  public int getNbLasersMax() {
    return nbLasersMax;
  }

  public void setNbLasersMax(int nbLasersMax) {
    this.nbLasersMax = nbLasersMax;
  }

  public int getNbMissilesMin() {
    return nbMissilesMin;
  }

  public void setNbMissilesMin(int nbMissilesMin) {
    this.nbMissilesMin = nbMissilesMin;
  }

  public int getNbMissilesMax() {
    return nbMissilesMax;
  }

  public void setNbMissilesMax(int nbMissilesMax) {
    this.nbMissilesMax = nbMissilesMax;
  }

  public int getMassMin() {
    return massMin;
  }

  public void setMassMin(int massMin) {
    this.massMin = massMin;
  }

  public int getMassMax() {
    return massMax;
  }

  public void setMassMax(int massMax) {
    this.massMax = massMax;
  }

  public int getPopMin() {
    return popMin;
  }

  public void setPopMin(int popMin) {
    this.popMin = popMin;
  }

  public int getPopMax() {
    return popMax;
  }

  public void setPopMax(int popMax) {
    this.popMax = popMax;
  }

  public double getStarStatusProbability() {
    return starStatusProbability;
  }

  public void setStarStatusProbability(double starStatusProbability) {
    this.starStatusProbability = starStatusProbability;
  }

  public int getHappinessRateMin() {
    return happinessRateMin;
  }

  public void setHappinessRateMin(int happinessRateMin) {
    this.happinessRateMin = happinessRateMin;
  }

  public int getHappinessRateMax() {
    return happinessRateMax;
  }

  public void setHappinessRateMax(int happinessRateMax) {
    this.happinessRateMax = happinessRateMax;
  }

  public int getAuthorityRateMin() {
    return authorityRateMin;
  }

  public void setAuthorityRateMin(int authorityRateMin) {
    this.authorityRateMin = authorityRateMin;
  }

  public int getAuthorityRateMax() {
    return authorityRateMax;
  }

  public void setAuthorityRateMax(int authorityRateMax) {
    this.authorityRateMax = authorityRateMax;
  }

  public double getDevelopmentRateMin() {
    return developmentRateMin;
  }

  public void setDevelopmentRateMin(double developmentRateMin) {
    this.developmentRateMin = developmentRateMin;
  }

  public double getDevelopmentRateMax() {
    return developmentRateMax;
  }

  public void setDevelopmentRateMax(double developmentRateMax) {
    this.developmentRateMax = developmentRateMax;
  }

  public int getHabitabilityRateMin() {
    return habitabilityRateMin;
  }

  public void setHabitabilityRateMin(int habitabilityRateMin) {
    this.habitabilityRateMin = habitabilityRateMin;
  }

  public int getHabitabilityRateMax() {
    return habitabilityRateMax;
  }

  public void setHabitabilityRateMax(int habitabilityRateMax) {
    this.habitabilityRateMax = habitabilityRateMax;
  }

  public double getKlunkDepositProbability() {
    return klunkDepositProbability;
  }

  public void setKlunkDepositProbability(double klunkDepositProbability) {
    this.klunkDepositProbability = klunkDepositProbability;
  }

  public double getOsiumDepositProbability() {
    return osiumDepositProbability;
  }

  public void setOsiumDepositProbability(double osiumDepositProbability) {
    this.osiumDepositProbability = osiumDepositProbability;
  }

  public StarGeneratorConfig(String path) throws ConfigurationException {
    super(path);
  }
  public StarGeneratorConfig(File f) throws ConfigurationException {
    super(f);
  }

  public void load() throws ConfigurationException {
    config.load();

    this.nbWarriorsMin = config.getInt("star-generator.nbWarriorsMin");
    this.nbWarriorsMax = config.getInt("star-generator.nbWarriorsMax");
    this.nbLasersMin = config.getInt("star-generator.nbLasersMin");
    this.nbLasersMax = config.getInt("star-generator.nbLasersMax");
    this.nbMissilesMin = config.getInt("star-generator.nbMissilesMin");
    this.nbMissilesMax = config.getInt("star-generator.nbMissilesMax");

    this.massMin = config.getInt("star-generator.massMin");
    this.massMax = config.getInt("star-generator.massMax");
    this.popMin = config.getInt("star-generator.popMin");
    this.popMax = config.getInt("star-generator.popMax");

    this.starStatusProbability = config.getDouble("star-generator.starStatus");
    this.happinessRateMin = config.getInt("star-generator.happinessRateMin");
    this.happinessRateMax = config.getInt("star-generator.happinessRateMax");
    this.authorityRateMin = config.getInt("star-generator.authorityRateMin");
    this.authorityRateMax = config.getInt("star-generator.authorityRateMax");

    this.developmentRateMin = config.getDouble("star-generator.developmentRateMin");
    this.developmentRateMax = config.getDouble("star-generator.developmentRateMax");
    this.habitabilityRateMin = config.getInt("star-generator.habitabilityRateMin");
    this.habitabilityRateMax = config.getInt("star-generator.habitabilityRateMax");
    this.klunkDepositProbability = config.getDouble("star-generator.klunkDepositProbability");
    this.osiumDepositProbability = config.getDouble("star-generator.osiumDepositProbability");
  }

  public void save() throws ConfigurationException {
    config.clear();
    configLayout.setHeaderComment("star-generator config file");

    config.setProperty("star-generator.nbWarriorsMin", this.nbWarriorsMin);
    config.setProperty("star-generator.nbWarriorsMax", this.nbWarriorsMax);
    config.setProperty("star-generator.nbLasersMin", this.nbLasersMin);
    config.setProperty("star-generator.nbLasersMax", this.nbLasersMax);
    config.setProperty("star-generator.nbMissilesMin", this.nbMissilesMin);
    config.setProperty("star-generator.nbMissilesMax", this.nbMissilesMax);

    config.setProperty("star-generator.massMin", this.massMin);
    config.setProperty("star-generator.massMax", this.massMax);
    config.setProperty("star-generator.popMin", this.popMin);
    config.setProperty("star-generator.popMax", this.popMax);

    config.setProperty("star-generator.starStatus", this.starStatusProbability);
    config.setProperty("star-generator.happinessRateMin", this.happinessRateMin);
    config.setProperty("star-generator.happinessRateMax", this.happinessRateMax);
    config.setProperty("star-generator.authorityRateMin", this.authorityRateMin);
    config.setProperty("star-generator.authorityRateMax", this.authorityRateMax);

    config.setProperty("star-generator.developmentRateMin", this.developmentRateMin);
    config.setProperty("star-generator.developmentRateMax", this.developmentRateMax);
    config.setProperty("star-generator.habitabilityRateMin", this.habitabilityRateMin);
    config.setProperty("star-generator.habitabilityRateMax", this.habitabilityRateMax);
    config.setProperty("star-generator.klunkDepositProbability", this.klunkDepositProbability);
    config.setProperty("star-generator.osiumDepositProbability", this.osiumDepositProbability);

    config.save();
  }


}
