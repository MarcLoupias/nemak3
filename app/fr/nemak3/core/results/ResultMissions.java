package fr.nemak3.core.results;

import fr.nemak3.core.ECrewType;
import fr.nemak3.core.GameObject;
import fr.nemak3.core.orders.OrderMissions;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
public class ResultMissions extends GameObject {

    @NotNull
    @OneToOne
    private OrderMissions orderMissions;

    private int novarsProfit;
    private int mineralProfit;
    private int ceProfit;
    private int erdiProfit;

    private int shuttleLossesQty;
    private int crewLosses;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ECrewType crewType;
}
