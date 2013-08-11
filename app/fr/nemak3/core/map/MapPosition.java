package fr.nemak3.core.map;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Embeddable;

/*
 * calcul de distance : http://fr.wikiversity.org/wiki/Cours_de_math%C3%A9matiques_de_seconde/Vecteurs_et_rep%C3%A9rage/Distance_dans_un_rep%C3%A8re_orthonorm%C3%A9
 */
@Embeddable
public class MapPosition {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public MapPosition() {

    }

    public MapPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param radius in pixels (1 AL = 100 pixels)
     */
    public boolean isPositionExist(@NotNull MapPosition pos, int radius) {
        return pos.getX() <= (this.x + radius) && pos.getX() >= (this.x - radius) &&
                pos.getY() <= (this.y + radius) && pos.getY() >= (this.y - radius);

    }
}
