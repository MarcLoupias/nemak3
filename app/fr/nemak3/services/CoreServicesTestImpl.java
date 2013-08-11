package fr.nemak3.services;

import fr.nemak3.core.map.Star;
import fr.nemak3.core.map.StarStatus;

import java.util.ArrayList;
import java.util.List;

public class CoreServicesTestImpl implements CoreServicesI {


  private static List<Star> starList = new ArrayList<Star>();

  private void loadTestData(){
    Star s = new Star();
    s.setId(1l);
    s.setName("JUHIK");
    s.setOsiumDeposit(false);
    s.setKlunkDeposit(false);
    s.setAuthorityRate(1000);
    s.setDevelopmentRate(5.0);
    s.setHabitabilityRate(5);
    s.setHappinessRate(90);
    s.setMass(500);
    s.setPop(400);
    s.setNbWarriors(3000);
    s.setNbLasers(2000);
    s.setNbMissiles(150);
    s.setStarStatus(StarStatus.PEACE);
    starList.add(s);
  }

  public CoreServicesTestImpl() {
    loadTestData();
  }

  @Override
  public void addStar(Star star) {
    starList.add(star);
  }

  @Override
  public Star getStarById(int id) {
    for(Star s : starList){
      if(s.getId() == id){
        return s;
      }
    }

    return null;
  }
}
