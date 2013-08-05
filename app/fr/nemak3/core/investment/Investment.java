package fr.nemak3.core.investment;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 26/06/13
 * Time: 00:07
 * To change this template use File | Settings | File Templates.
 */
public class Investment {
  private String name;
  private int novarsAmount;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNovarsAmount() {
    return novarsAmount;
  }

  public void setNovarsAmount(int novarsAmount) {
    this.novarsAmount = novarsAmount;
  }
}
