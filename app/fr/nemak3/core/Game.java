package fr.nemak3.core;

import fr.nemak3.core.map.Galaxy;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Game extends GameObject {

    @NotNull
    private String name;
    @NotNull
    @ManyToOne
    private Player gameOwner;
    @NotNull
    @OneToOne
    private Galaxy galaxy;

    @Nullable
    @ManyToMany(mappedBy = "playedGames")
    private Collection<Player> players;

    @Nullable
    @OneToMany(mappedBy = "game")
    private Collection<Commander> commanders;

    @Nullable
    @OneToMany(mappedBy = "game")
    private Collection<Turn> turns;

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    public Player getGameOwner() {
        return gameOwner;
    }

    public void setGameOwner(@NotNull Player gameOwner) {
        this.gameOwner = gameOwner;
    }

    @NotNull
    public Galaxy getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(@NotNull Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    @Nullable
    public Collection<Player> getPlayers() {
        return players;
    }

    public void setPlayers(@Nullable Collection<Player> players) {
        this.players = players;
    }

    @Nullable
    public Collection<Commander> getCommanders() {
        return commanders;
    }

    public void setCommanders(@Nullable Collection<Commander> commanders) {
        this.commanders = commanders;
    }

    @Nullable
    public Collection<Turn> getTurns() {
        return turns;
    }

    public void setTurns(@Nullable Collection<Turn> turns) {
        this.turns = turns;
    }
}
