package fr.nemak3.core;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 26/01/13
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 */
public class Commander extends GameObject {

    @NotNull
    private String name;

    public enum CommanderType {
        PLAYER_COMMANDER, NON_PLAYER_COMMANDER
    }

    @NotNull
    private CommanderType commanderType;

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public CommanderType getCommanderType() {
        return commanderType;
    }

    public void setCommanderType(CommanderType commanderType) {
        this.commanderType = commanderType;
    }

    public Commander() {
    }
}
