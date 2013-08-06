package fr.nemak3;

import fr.nemak3.core.Player;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 21:00
 * To change this template use File | Settings | File Templates.
 */
public class Nemak3GameManagerDataMockup {

    public static Player gameOwnerToto = playerFactory(1l, "toto@toto.org", "toto", "TOTO");

    public static Player playerFactory(long id, String email, String firstName, String lastName) {
        Player p = new Player();
        p.setId(id);
        p.setEmail(email);
        p.setFirstName(firstName);
        p.setLastName(lastName);
        return p;
    }
}
