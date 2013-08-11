package fr.nemak3.core;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A simple entity to list available tech per type but not linked with Commander entity.
 * Commander entity just have a value for each type, and we compare the score in when it is relevant in turn exec.
 * So techs are hardcoded.
 */
@Entity
public class Technology extends GameObject {

    public enum TechnologyType {
        MILITARY, DEFENSIVE, COMBINATORY
    }

    private int requiredPoints;
    @NotNull
    @Enumerated(EnumType.STRING)
    private TechnologyType technologyType;
    @NotNull
    private String description;
}
