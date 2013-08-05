package fr.nemak3;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 21:00
 * To change this template use File | Settings | File Templates.
 */
public class Nemak3GameManagerDataMockup {

    public static Player gameOwnerToto;

    public void loadPlayerOwner() {
        gameOwnerToto = new Player();
        gameOwnerToto.setId(1l);
        gameOwnerToto.setLogin("toto");
    }
}
