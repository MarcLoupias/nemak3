package fr.nemak3.core;

import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.MapPosition;
import fr.nemak3.core.map.Sector;
import fr.nemak3.core.map.Star;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.persistence.*;

@Entity
public class CommanderRadarStar extends GameObject {

    private int lastTurnDataUpdate;

    @NotNull
    @ManyToOne
    private Commander radarStarCommanderOwner;

    @NotNull
    @ManyToOne
    private Galaxy galaxy;

    @NotNull
    @ManyToOne
    private Sector sector;

    @NotNull
    @Column(length = 5)
    private String name;

    @Nullable
    @ManyToOne
    private Commander commanderOwner;

    @NotNull
    @Embedded
    private MapPosition position;

    private int nbWarriors;
    private int nbLasers;
    private int nbMissiles;

    private int mass;
    private int pop;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Star.StarStatus starStatus;
    private int happinessRate;
    private int authorityRate;

    private double developmentRate;
    private int habitabilityRate;
    private boolean klunkDeposit;
    private boolean osiumDeposit;

    public int getLastTurnDataUpdate() {
        return lastTurnDataUpdate;
    }

    public void setLastTurnDataUpdate(int lastTurnDataUpdate) {
        this.lastTurnDataUpdate = lastTurnDataUpdate;
    }

    @NotNull
    public Commander getRadarStarCommanderOwner() {
        return radarStarCommanderOwner;
    }

    public void setRadarStarCommanderOwner(@NotNull Commander radarStarCommanderOwner) {
        this.radarStarCommanderOwner = radarStarCommanderOwner;
    }

    @NotNull
    public Galaxy getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(@NotNull Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    @NotNull
    public Sector getSector() {
        return sector;
    }

    public void setSector(@NotNull Sector sector) {
        this.sector = sector;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @Nullable
    public Commander getCommanderOwner() {
        return commanderOwner;
    }

    public void setCommanderOwner(@Nullable Commander commanderOwner) {
        this.commanderOwner = commanderOwner;
    }

    @NotNull
    public MapPosition getPosition() {
        return position;
    }

    public void setPosition(@NotNull MapPosition position) {
        this.position = position;
    }

    public int getNbWarriors() {
        return nbWarriors;
    }

    public void setNbWarriors(int nbWarriors) {
        this.nbWarriors = nbWarriors;
    }

    public int getNbLasers() {
        return nbLasers;
    }

    public void setNbLasers(int nbLasers) {
        this.nbLasers = nbLasers;
    }

    public int getNbMissiles() {
        return nbMissiles;
    }

    public void setNbMissiles(int nbMissiles) {
        this.nbMissiles = nbMissiles;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    @NotNull
    public Star.StarStatus getStarStatus() {
        return starStatus;
    }

    public void setStarStatus(@NotNull Star.StarStatus starStatus) {
        this.starStatus = starStatus;
    }

    public int getHappinessRate() {
        return happinessRate;
    }

    public void setHappinessRate(int happinessRate) {
        this.happinessRate = happinessRate;
    }

    public int getAuthorityRate() {
        return authorityRate;
    }

    public void setAuthorityRate(int authorityRate) {
        this.authorityRate = authorityRate;
    }

    public double getDevelopmentRate() {
        return developmentRate;
    }

    public void setDevelopmentRate(double developmentRate) {
        this.developmentRate = developmentRate;
    }

    public int getHabitabilityRate() {
        return habitabilityRate;
    }

    public void setHabitabilityRate(int habitabilityRate) {
        this.habitabilityRate = habitabilityRate;
    }

    public boolean isKlunkDeposit() {
        return klunkDeposit;
    }

    public void setKlunkDeposit(boolean klunkDeposit) {
        this.klunkDeposit = klunkDeposit;
    }

    public boolean isOsiumDeposit() {
        return osiumDeposit;
    }

    public void setOsiumDeposit(boolean osiumDeposit) {
        this.osiumDeposit = osiumDeposit;
    }
}
