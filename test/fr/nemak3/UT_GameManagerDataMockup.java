package fr.nemak3;

import fr.nemak3.core.Commander;
import fr.nemak3.core.Game;
import fr.nemak3.core.Player;
import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.MapPosition;
import fr.nemak3.core.map.Star;
import java.util.List;
import java.util.Map;

public class UT_GameManagerDataMockup extends UT_DataMockupBuilder {

    protected static Star starRAHEJ = starFactory(1l, "RAHEJ", new MapPosition(100, 100), 2000, 3000, 200, 700, 545, Star.StarStatus.PEACE, 80, 1345, 6.90, 6, false, false);
    protected static Star starJYHIK_osium = starFactory(2l, "JYHIK", new MapPosition(100, 200), 2000, 3000, 200, 700, 545, Star.StarStatus.PEACE, 80, 1345, 6.90, 6, false, true);
    protected static Star starMOHIT_klunk = starFactory(3l, "MOHIT", new MapPosition(100, 300), 2000, 3000, 200, 700, 545, Star.StarStatus.PEACE, 80, 1345, 6.90, 6, true, false);
    protected static Map<String, Star> starMap = starMapFactory(starRAHEJ, starJYHIK_osium, starMOHIT_klunk);
    protected static Galaxy galaxySeshwan = galaxyFactory(1l, 1000, 1000, "Seshwan", starMap);

    protected static Commander cmdtGrandConseil = cmdtFactory(1l, "Grand Conseil", Commander.CommanderType.NON_PLAYER_COMMANDER);
    protected static Commander cmdtGnralHumain = cmdtFactory(2l, "Général Humain", Commander.CommanderType.NON_PLAYER_COMMANDER);
    protected static List<Commander> cmdtListTOTO = cmdtListFactory(cmdtGrandConseil, cmdtGnralHumain);

    protected static Commander cmdtDarkTiti = cmdtFactory(3l, "Dark Titi", Commander.CommanderType.PLAYER_COMMANDER);
    protected static Commander cmdtBrownTiti = cmdtFactory(4l, "Brown Titi", Commander.CommanderType.PLAYER_COMMANDER);
    protected static List<Commander> cmdtListTITI = cmdtListFactory(cmdtDarkTiti, cmdtBrownTiti);

    protected static Commander cmdtDarkTutu = cmdtFactory(5l, "Dark Tutu", Commander.CommanderType.PLAYER_COMMANDER);
    protected static Commander cmdtBrownTutu = cmdtFactory(6l, "Brown Tutu", Commander.CommanderType.PLAYER_COMMANDER);
    protected static List<Commander> cmdtListTUTU = cmdtListFactory(cmdtDarkTutu, cmdtBrownTutu);

    protected static Player gameOwnerToto = playerFactory(1l, "toto@toto.org", "toto", "TOTO", cmdtListTOTO);
    protected static Player gamePlayerTiti = playerFactory(2l, "titi@titi.org", "titi", "TITI", cmdtListTITI);
    protected static Player gamePlayerTutu = playerFactory(3l, "tutu@tutu.org", "tutu", "TUTU", cmdtListTUTU);
    protected static List<Player> playerList = playerListFactory(gamePlayerTiti, gamePlayerTutu);


    protected static Game gameTest = gameFactory(1l, galaxySeshwan, gameOwnerToto, "PartieTest", playerList);
}
