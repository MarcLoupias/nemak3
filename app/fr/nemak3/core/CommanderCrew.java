package fr.nemak3.core;

import javax.persistence.Embeddable;

@Embeddable
public class CommanderCrew {
    private int warriorsQty;
    private double warriorsEff;
    private int diplomatsQty;
    private double diplomatsEff;
    private int workersQty;
    private double workersEff;
    private int commandosQty;
    private double commandosEff;
    private int engineersQty;
    private double engineersEff;
    private int rangersQty;
    private double rangersEff;

    public int getWarriorsQty() {
        return warriorsQty;
    }

    public void setWarriorsQty(int warriorsQty) {
        this.warriorsQty = warriorsQty;
    }

    public double getWarriorsEff() {
        return warriorsEff;
    }

    public void setWarriorsEff(double warriorsEff) {
        this.warriorsEff = warriorsEff;
    }

    public int getDiplomatsQty() {
        return diplomatsQty;
    }

    public void setDiplomatsQty(int diplomatsQty) {
        this.diplomatsQty = diplomatsQty;
    }

    public double getDiplomatsEff() {
        return diplomatsEff;
    }

    public void setDiplomatsEff(double diplomatsEff) {
        this.diplomatsEff = diplomatsEff;
    }

    public int getWorkersQty() {
        return workersQty;
    }

    public void setWorkersQty(int workersQty) {
        this.workersQty = workersQty;
    }

    public double getWorkersEff() {
        return workersEff;
    }

    public void setWorkersEff(double workersEff) {
        this.workersEff = workersEff;
    }

    public int getCommandosQty() {
        return commandosQty;
    }

    public void setCommandosQty(int commandosQty) {
        this.commandosQty = commandosQty;
    }

    public double getCommandosEff() {
        return commandosEff;
    }

    public void setCommandosEff(double commandosEff) {
        this.commandosEff = commandosEff;
    }

    public int getEngineersQty() {
        return engineersQty;
    }

    public void setEngineersQty(int engineersQty) {
        this.engineersQty = engineersQty;
    }

    public double getEngineersEff() {
        return engineersEff;
    }

    public void setEngineersEff(double engineersEff) {
        this.engineersEff = engineersEff;
    }

    public int getRangersQty() {
        return rangersQty;
    }

    public void setRangersQty(int rangersQty) {
        this.rangersQty = rangersQty;
    }

    public double getRangersEff() {
        return rangersEff;
    }

    public void setRangersEff(double rangersEff) {
        this.rangersEff = rangersEff;
    }
}
