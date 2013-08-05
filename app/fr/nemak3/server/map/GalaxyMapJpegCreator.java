package fr.nemak3.server.map;


import fr.nemak3.core.map.Galaxy;
import fr.nemak3.core.map.Star;
import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GalaxyMapJpegCreator extends JPanel {

  @NotNull
  private Galaxy galaxy;

  @NotNull
  private File jpg;

  private GalaxyMapJpegCreator(){

  }

  public GalaxyMapJpegCreator(@NotNull Galaxy galaxy, @NotNull String jpgPath){
    this(galaxy, new File(jpgPath));
  }

  public GalaxyMapJpegCreator(@NotNull Galaxy galaxy, @NotNull File jpg){
    this.galaxy = galaxy;
    this.jpg = jpg;
  }

  private void drawImage(Graphics2D g){
    int x, y = 0;
    String name = "";

    //Dessiner le fond blanc
    g.setColor(Color.white);
    g.fillRect(1, 1, galaxy.getWidth(), galaxy.getHeight());

    for (Star s : galaxy.getStarsIdMap().values()){
      x = s.getPosition().getX();
      y = s.getPosition().getY();
      name = s.getName();

      //Correction de la position pour affichage
     // x += 500;
     // y += 500;

      //On la dessine
      g.setColor(Color.BLACK);
      g.fillOval(x-1,y-1,8,8);
      g.setColor(Color.white);
      g.fillOval(x,y,6,6);

      g.setColor(Color.BLACK); //pour la police
      g.drawString( name, (x + 9), (y + 7));
    }

//    x = 500;
//    y = 500;
//    name = "NEMAK";
//
//    g.setColor(Color.BLACK);
//    g.fillOval(x-1,y-1,8,8);
//    g.setColor(Color.white);
//    g.fillOval(x,y,6,6);
//
//    g.setColor(Color.BLACK); //pour la police
//    g.drawString( name, (x + 9), (y + 7));

    g.dispose();
  }

  public void saveFile() throws IOException {
    File fileDestination = jpg;
    BufferedImage image = new BufferedImage(
            galaxy.getWidth(),
            galaxy.getHeight(),
            BufferedImage.TYPE_BYTE_GRAY
    );
    Graphics2D g2d = image.createGraphics();

    drawImage(g2d);
    g2d.dispose();

    ImageIO.write(image, "jpeg", fileDestination);
  }
}
