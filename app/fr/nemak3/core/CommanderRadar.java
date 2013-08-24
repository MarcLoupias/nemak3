package fr.nemak3.core;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.util.List;

@Embeddable
public class CommanderRadar {

    @NotNull
    @OneToMany(mappedBy = "radarStarCommanderOwner")
    private List<CommanderRadarStar> commanderRadarStarList;

    @NotNull
    public List<CommanderRadarStar> getCommanderRadarStarList() {
        return commanderRadarStarList;
    }

    public void setCommanderRadarStarList(@NotNull List<CommanderRadarStar> commanderRadarStarList) {
        this.commanderRadarStarList = commanderRadarStarList;
    }
}
