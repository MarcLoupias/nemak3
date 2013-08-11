package fr.nemak3.core;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class Player extends GameObject {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;

    @Nullable
    @OneToMany(mappedBy = "playerOwner")
    private Collection<Commander> commanders;

    @Nullable
    @OneToMany(mappedBy = "gameOwner")
    private Collection<Game> ownedGames;

    @Nullable
    @ManyToMany
    private Collection<Game> playedGames;

    @NotNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull String lastName) {
        this.lastName = lastName;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    @Nullable
    public Collection<Commander> getCommanders() {
        return commanders;
    }

    public void setCommanders(@Nullable Collection<Commander> commanders) {
        this.commanders = commanders;
    }

    @Nullable
    public Collection<Game> getOwnedGames() {
        return ownedGames;
    }

    public void setOwnedGames(@Nullable Collection<Game> ownedGames) {
        this.ownedGames = ownedGames;
    }

    @Nullable
    public Collection<Game> getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(@Nullable Collection<Game> playedGames) {
        this.playedGames = playedGames;
    }
}
