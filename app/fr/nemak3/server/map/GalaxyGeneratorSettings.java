package fr.nemak3.server.map;

import org.jetbrains.annotations.NotNull;

public class GalaxyGeneratorSettings {

    @NotNull
    private String galaxyName = "Seshwan";

    private int nbSectors = 9;
    private int sectorWidth = 1000;
    private int sectorHeight = 1000;

    private int starsBySector = 100;


    public int getNbSectors() {
        return nbSectors;
    }

    public void setNbSectors(int nbSectors) {
        this.nbSectors = nbSectors;
    }

    public int getSectorWidth() {
        return sectorWidth;
    }

    public void setSectorWidth(int sectorWidth) {
        this.sectorWidth = sectorWidth;
    }

    public int getSectorHeight() {
        return sectorHeight;
    }

    public void setSectorHeight(int sectorHeight) {
        this.sectorHeight = sectorHeight;
    }

    public int getStarsBySector() {
        return starsBySector;
    }

    public void setStarsBySector(int starsBySector) {
        this.starsBySector = starsBySector;
    }

    @NotNull
    public String getGalaxyName() {
        return galaxyName;
    }

    public void setGalaxyName(@NotNull String galaxyName) {
        this.galaxyName = galaxyName;
    }
}
