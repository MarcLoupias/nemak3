package fr.nemak3.core;

import fr.nemak3.core.orders.CommanderOrders;
import fr.nemak3.core.results.CommanderResults;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

@Entity
public class Turn extends GameObject {

    @NotNull
    private Date date;
    @NotNull
    @ManyToOne
    private Game game;

    @Nullable
    @OneToMany(mappedBy = "turn")
    private Collection<CommanderOrders> commanderOrders;

    @Nullable
    @OneToMany(mappedBy = "turn")
    private Collection<CommanderResults> commanderResults;

    @NotNull
    public Date getDate() {
        return date;
    }

    public void setDate(@NotNull Date date) {
        this.date = date;
    }

    @NotNull
    public Game getGame() {
        return game;
    }

    public void setGame(@NotNull Game game) {
        this.game = game;
    }
}
