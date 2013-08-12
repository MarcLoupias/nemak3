package fr.nemak3.core;

import fr.nemak3.core.map.Star;
import org.jetbrains.annotations.NotNull;

import org.jetbrains.annotations.Nullable;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Brotherhood extends GameObject {

    @NotNull
    @ManyToOne
    private Game game;

    @NotNull
    @OneToOne
    private Commander magister;

    @Nullable
    @OneToMany
    private Collection<Commander> members;

    @NotNull
    @OneToOne
    private Star headquarter;

    private int novarsCapital;
    private int novarsAvailable;

    @NotNull
    @Embedded
    private BrotherhoodStock brotherhoodStock;

}
