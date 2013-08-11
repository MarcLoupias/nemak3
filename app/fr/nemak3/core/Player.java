package fr.nemak3.core;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Player extends GameObject {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;

    List<Commander> commanderList;

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

    public List<Commander> getCommanderList() {
        return commanderList;
    }

    public void setCommanderList(List<Commander> commanderList) {
        this.commanderList = commanderList;
    }
}
