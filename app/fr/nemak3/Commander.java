package fr.nemak3;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 20:20
 * To change this template use File | Settings | File Templates.
 */
public class Commander extends GameObject {
    private String name;

    public enum CommanderType {
        PLAYER_COMMANDER, NON_PLAYER_COMMANDER
    }

    private CommanderType commanderType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommanderType getCommanderType() {
        return commanderType;
    }

    public void setCommanderType(CommanderType commanderType) {
        this.commanderType = commanderType;
    }
}
