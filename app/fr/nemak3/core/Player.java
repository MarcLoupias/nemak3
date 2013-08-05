package fr.nemak3.core;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 26/01/13
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 */
public class Player extends GameObject {
  @NotNull
  private String firstName;
  @NotNull
  private String lastName;
  @NotNull
  private String email;

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
}
