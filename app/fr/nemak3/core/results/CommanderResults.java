package fr.nemak3.core.results;

import fr.nemak3.core.Commander;
import fr.nemak3.core.GameObject;
import fr.nemak3.core.Turn;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CommanderResults extends GameObject {

    @NotNull
    @ManyToOne
    private Commander principal;

    @NotNull
    @ManyToOne
    private Turn turn;

    @Nullable
    @OneToOne
    private ResultTravel resultTravel;

    @Nullable
    @OneToOne
    private ResultProtections resultProtections;

    @Nullable
    @OneToOne
    private ResultInvasions resultInvasions;

    @Nullable
    @OneToOne
    private ResultMissions resultMissions;

    @Nullable
    @OneToOne
    private ResultManufacturings resultManufacturings;

    @Nullable
    @OneToOne
    private ResultInvestments resultInvestments;

    @Nullable
    @OneToOne
    private ResultGunnery resultGunnery;

    @Nullable
    @OneToOne
    private ResultEMADIS resultEMADIS;

    @Nullable
    @OneToOne
    private ResultPHRYST resultPHRYST;

    @Nullable
    @OneToOne
    private ResultSabotage resultSabotage;

    @Nullable
    @OneToOne
    private ResultTeleportation resultTeleportation;

    @Nullable
    @OneToOne
    private ResultGeneticMutation resultGeneticMutation;

}
