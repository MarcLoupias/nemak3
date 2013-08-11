package fr.nemak3;

import fr.nemak3.core.Commander;
import fr.nemak3.core.Game;
import fr.nemak3.core.Player;
import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.MapPosition;
import fr.nemak3.core.map.Star;

import java.util.*;

public class UT_DataMockupBuilder {

    protected static Game gameFactory(Long id, Galaxy galaxy, Player gameOwner, String name, List<Player> playerList) {
        Game g = new Game();
        g.setId(id);
        g.setGalaxy(galaxy);
        g.setGameOwner(gameOwner);
        g.setName(name);
        //g.setPlayerList(playerList);
        return g;
    }

    protected static Galaxy galaxyFactory(Long id, int height, int width, String name, Map<String, Star> starsIdMap) {
        Galaxy g = new Galaxy(name);
        g.setId(id);
        g.setHeight(height);
        g.setWidth(width);
       // g.setSectorsIdList(null);
        g.setStars(starsIdMap);
        return g;
    }

    protected static Map<String, Star> starMapFactory(Star... s) {
        Map<String, Star> sm = new HashMap<String, Star>();
        for (Star value : s) {
            sm.put(value.getName(), value);
        }
        return sm;
    }

    protected static Star starFactory(
            Long id, String name, MapPosition pos, int nbWarriors, int nbLasers, int nbMissiles, int mass, int pop, Star.StarStatus status,
            int happinessRate, int authorityRate, double devRate, int habRate, boolean klunk, boolean osium) {
        Star s = new Star();
        s.setId(id);
        s.setName(name);
        s.setPosition(pos);

        // military
        s.setNbWarriors(nbWarriors);
        s.setNbLasers(nbLasers);
        s.setNbMissiles(nbMissiles);

        // structure
        s.setMass(mass);
        s.setPop(pop);

        // social
        s.setStarStatus(status);
        s.setHappinessRate(happinessRate);
        s.setAuthorityRate(authorityRate);

        // economics
        s.setDevelopmentRate(devRate);
        s.setHabitabilityRate(habRate);
        s.setKlunkDeposit(klunk);
        s.setOsiumDeposit(osium);

        return s;
    }

    protected static Commander cmdtFactory(Long id, String name, Commander.CommanderType type) {
        Commander cmdt = new Commander();
        cmdt.setId(id);
        cmdt.setName(name);
        cmdt.setCommanderType(type);
        return cmdt;
    }

    protected static List<Commander> cmdtListFactory(Commander... cmdt) {
        List<Commander> cmdtList = new ArrayList<Commander>();
        Collections.addAll(cmdtList, cmdt);
        return cmdtList;
    }

    protected static List<Player> playerListFactory(Player... p) {
        List<Player> pl = new ArrayList<Player>();
        Collections.addAll(pl, p);
        return pl;
    }

    protected static Player playerFactory(long id, String email, String firstName, String lastName, List<Commander> cmdtList) {
        Player p = new Player();
        p.setId(id);
        p.setEmail(email);
        p.setFirstName(firstName);
        p.setLastName(lastName);
        //p.setCommanderList(cmdtList);
        return p;
    }
}
