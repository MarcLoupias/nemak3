package fr.nemak3.core.orders;

import fr.nemak3.core.Commander;
import fr.nemak3.core.GameObject;
import fr.nemak3.core.Turn;
import fr.nemak3.core.orders.OrderTravel;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CommanderOrders extends GameObject {

    @NotNull
    @ManyToOne
    private Commander principal;

    @NotNull
    @ManyToOne
    private Turn turn;

    @Nullable
    @OneToOne
    private OrderTravel orderTravel;

    @Nullable
    @OneToOne
    private OrderProtections orderProtections;

    @Nullable
    @OneToOne
    private OrderInvasions orderInvasions;

    @Nullable
    @OneToOne
    private OrderMissions orderMissions;

    @Nullable
    @OneToOne
    private OrderManufacturings orderManufacturings;

    @Nullable
    @OneToOne
    private OrderInvestments orderInvestments;

    @Nullable
    @OneToOne
    private OrderGunnery orderGunnery;

    @Nullable
    @OneToOne
    private OrderEMADIS orderEMADIS;

    @Nullable
    @OneToOne
    private OrderPHRYST orderPHRYST;

    @Nullable
    @OneToOne
    private OrderSabotage orderSabotage;

    @Nullable
    @OneToOne
    private OrderTeleportation orderTeleportation;

    @Nullable
    @OneToOne
    private OrderGeneticMutation orderGeneticMutation;

}
