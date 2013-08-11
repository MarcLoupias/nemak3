package fr.nemak3.core;

import javax.persistence.Embeddable;

@Embeddable
public class CommanderEconomicInventory {
    private int novars;
    private int minerals;
    private int electronicsComponents;
    private int kozium;
    private int erdividium;
    private int osium;

    public int getNovars() {
        return novars;
    }

    public void setNovars(int novars) {
        this.novars = novars;
    }

    public int getMinerals() {
        return minerals;
    }

    public void setMinerals(int minerals) {
        this.minerals = minerals;
    }

    public int getElectronicsComponents() {
        return electronicsComponents;
    }

    public void setElectronicsComponents(int electronicsComponents) {
        this.electronicsComponents = electronicsComponents;
    }

    public int getKozium() {
        return kozium;
    }

    public void setKozium(int kozium) {
        this.kozium = kozium;
    }

    public int getErdividium() {
        return erdividium;
    }

    public void setErdividium(int erdividium) {
        this.erdividium = erdividium;
    }

    public int getOsium() {
        return osium;
    }

    public void setOsium(int osium) {
        this.osium = osium;
    }
}
