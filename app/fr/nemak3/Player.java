package fr.nemak3;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 20:19
 * To change this template use File | Settings | File Templates.
 */
public class Player extends GameObject {
    private String login;
    private List<Commander> commanderList;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<Commander> getCommanderList() {
        return commanderList;
    }

    public void setCommanderList(List<Commander> commanderList) {
        this.commanderList = commanderList;
    }
}
