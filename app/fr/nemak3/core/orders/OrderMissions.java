package fr.nemak3.core.orders;

import fr.nemak3.core.Commander;
import fr.nemak3.core.GameObject;
import fr.nemak3.core.map.Star;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class OrderMissions extends GameObject {

    @NotNull
    @ManyToOne
    private Star targetedStar;

    private int missionType;
    private int shuttleQty;
    private double shuttleEff;

    private int novarsMaxProfit;
    private int mineralMaxProfit;
    private int ceMaxProfit;
    private int erdiMaxProfit;


}
