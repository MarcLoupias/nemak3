package fr.nemak3.core;

import fr.nemak3.server.map.GalaxyGeneratorSettings;
import fr.nemak3.server.map.StarGeneratorSettings;
import org.jetbrains.annotations.NotNull;

public class GameSettings extends Game {
    private static final GameSettings instance = new GameSettings();

    private static final int STOCK_MIN = 0;
    private static final int STOCK_MAX = 999999;
    private static final double EFFICIENCY_MIN = 1.0;
    private static final double EFFICIENCY_MAX = 9.99;

    @NotNull
    private GalaxyGeneratorSettings galaxyGeneratorSettings;
    @NotNull
    private StarGeneratorSettings starGeneratorSettings;

    public static GameSettings getInstance() {
        return instance;
    }

    private GameSettings() {
        galaxyGeneratorSettings = new GalaxyGeneratorSettings();
        starGeneratorSettings = new StarGeneratorSettings();
    }

    public GalaxyGeneratorSettings getGalaxyGeneratorSettings() {
        return galaxyGeneratorSettings;
    }

    public void setGalaxyGeneratorSettings(GalaxyGeneratorSettings galaxyGeneratorSettings) {
        this.galaxyGeneratorSettings = galaxyGeneratorSettings;
    }

    public StarGeneratorSettings getStarGeneratorSettings() {
        return starGeneratorSettings;
    }

    public void setStarGeneratorSettings(StarGeneratorSettings starGeneratorSettings) {
        this.starGeneratorSettings = starGeneratorSettings;
    }
}
