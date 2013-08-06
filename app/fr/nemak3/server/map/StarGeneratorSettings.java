package fr.nemak3.server.map;

public class StarGeneratorSettings {
    private int nbWarriorsMin = 2000;
    private int nbWarriorsMax = 5000;
    private int nbLasersMin = 2000;
    private int nbLasersMax = 5000;
    private int nbMissilesMin = 100;
    private int nbMissilesMax = 500;

    private int massMin = 100;
    private int massMax = 999;
    private int popMin = 100;
    private int popMax = 999;
    private double starStatusProbability = 90.0;
    private int happinessRateMin = 10;
    private int happinessRateMax = 99;
    private int authorityRateMin = 1000;
    private int authorityRateMax = 9999;
    private double developmentRateMin = 1.0;
    private double developmentRateMax = 5.0;
    private int habitabilityRateMin = 1;
    private int habitabilityRateMax = 9;
    private double klunkDepositProbability = 20.0;
    private double osiumDepositProbability = 30.0;

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
}
