package fr.nemak3.core.map;


import fr.nemak3.core.GameObject;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import java.util.Map;

@Entity
public class Sector extends GameObject {

    public enum SectorType {
        STANDARD,
        GALAXY_CORE,
        INNER_CIRCLE,
        OUTER_CIRCLE,
        EXTERIOR_BORDER
    }

    @NotNull
    private String name;

    //@NotNull
    //@Embedded
    //private MapArea sectorArea;

    @NotNull
    @OneToMany(mappedBy = "sector")
    @MapKeyColumn(name="name")
    private Map<String, Star> starsMap;

    @NotNull
    private SectorType sectorType;

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    /*@NotNull
    public MapArea getSectorArea() {
        return sectorArea;
    }

    public void setSectorArea(@NotNull MapArea sectorArea) {
        this.sectorArea = sectorArea;
    }*/

    @NotNull
    public Map<String, Star> getStarsMap() {
        return starsMap;
    }

    public void setStarsMap(@NotNull Map<String, Star> starsMap) {
        this.starsMap = starsMap;
    }

    @NotNull
    public SectorType getSectorType() {
        return sectorType;
    }

    public void setSectorType(@NotNull SectorType sectorType) {
        this.sectorType = sectorType;
    }
}
