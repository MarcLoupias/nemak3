package fr.nemak3.services;

import fr.nemak3.core.map.Star;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 23/06/13
 * Time: 20:31
 * To change this template use File | Settings | File Templates.
 */
public interface CoreServicesI {

  public void addStar(Star star);
  public Star getStarById(int id);
}
