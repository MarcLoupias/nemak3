package fr.nemak3.core;

import fr.nemak3.core.map.MapPosition;
import fr.nemak3.core.map.Star;
import fr.nemak3.core.orders.CommanderOrders;
import fr.nemak3.core.results.CommanderResults;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.persistence.*;
import java.util.Collection;

@Entity
public class Commander extends GameObject {

    public enum CommanderType {
        PLAYER_COMMANDER, NON_PLAYER_COMMANDER
    }

    @NotNull
    private String name;

    @NotNull
    @ManyToOne
    private Game game;

    @NotNull
    @ManyToOne
    private Player playerOwner;

    @NotNull
    private CommanderType commanderType;

    @Nullable
    @OneToMany(mappedBy = "principal")
    private Collection<CommanderOrders> commanderOrders;

    @Nullable
    @OneToMany(mappedBy = "principal")
    private Collection<CommanderResults> commanderResults;

    @Nullable
    @OneToMany(mappedBy = "commanderOwner")
    private Collection<Star> ownedStars;

    private double armouring;

    @NotNull
    @Embedded
    private CommanderTechnologies commanderTechnologies;

    @NotNull
    @Embedded
    private CommanderCrewRacialDistribution commanderCrewRacialDistribution;

    @NotNull
    @Embedded
    private CommanderEconomicInventory commanderEconomicInventory;

    @NotNull
    @Embedded
    private CommanderArmy commanderArmy;

    @NotNull
    @Embedded
    private CommanderCrew commanderCrew;

    @NotNull
    @Embedded
    private MapPosition commanderMapPosition;

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    public Game getGame() {
        return game;
    }

    public void setGame(@NotNull Game game) {
        this.game = game;
    }

    @NotNull
    public Player getPlayerOwner() {
        return playerOwner;
    }

    public void setPlayerOwner(@NotNull Player playerOwner) {
        this.playerOwner = playerOwner;
    }

    public CommanderType getCommanderType() {
        return commanderType;
    }

    public void setCommanderType(CommanderType commanderType) {
        this.commanderType = commanderType;
    }

    @NotNull
    public CommanderTechnologies getCommanderTechnologies() {
        return commanderTechnologies;
    }

    public void setCommanderTechnologies(@NotNull CommanderTechnologies commanderTechnologies) {
        this.commanderTechnologies = commanderTechnologies;
    }

    @NotNull
    public CommanderCrewRacialDistribution getCommanderCrewRacialDistribution() {
        return commanderCrewRacialDistribution;
    }

    public void setCommanderCrewRacialDistribution(@NotNull CommanderCrewRacialDistribution commanderCrewRacialDistribution) {
        this.commanderCrewRacialDistribution = commanderCrewRacialDistribution;
    }

    @NotNull
    public CommanderEconomicInventory getCommanderEconomicInventory() {
        return commanderEconomicInventory;
    }

    public void setCommanderEconomicInventory(@NotNull CommanderEconomicInventory commanderEconomicInventory) {
        this.commanderEconomicInventory = commanderEconomicInventory;
    }

    @NotNull
    public CommanderArmy getCommanderArmy() {
        return commanderArmy;
    }

    public void setCommanderArmy(@NotNull CommanderArmy commanderArmy) {
        this.commanderArmy = commanderArmy;
    }

    @NotNull
    public CommanderCrew getCommanderCrew() {
        return commanderCrew;
    }

    public void setCommanderCrew(@NotNull CommanderCrew commanderCrew) {
        this.commanderCrew = commanderCrew;
    }

    @NotNull
    public MapPosition getCommanderMapPosition() {
        return commanderMapPosition;
    }

    public void setCommanderMapPosition(@NotNull MapPosition commanderMapPosition) {
        this.commanderMapPosition = commanderMapPosition;
    }

    public Commander() {
    }
}
