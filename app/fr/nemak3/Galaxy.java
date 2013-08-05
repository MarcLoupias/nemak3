package fr.nemak3;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 04/08/13
 * Time: 20:24
 * To change this template use File | Settings | File Templates.
 */
public class Galaxy extends GameObject {
    private List<Star> starList;

    public List<Star> getStarList() {
        return starList;
    }

    public void setStarList(List<Star> starList) {
        this.starList = starList;
    }
}
