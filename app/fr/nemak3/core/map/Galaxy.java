package fr.nemak3.core.map;


import fr.nemak3.core.Game;
import fr.nemak3.core.GameObject;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Galaxy extends GameObject {

    @NotNull
    private String name;

    @NotNull
    @OneToOne(mappedBy="galaxy")
    private Game game;

    @NotNull
    @OneToMany(mappedBy = "galaxy")
    @MapKeyColumn(name="name")
    private Map<String, Star> stars;

    private int width;
    private int height;

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    public Game getGame() {
        return game;
    }

    public void setGame(@NotNull Game game) {
        this.game = game;
    }

    @NotNull
    public Map<String, Star> getStars() {
        return stars;
    }

    public void setStars(@NotNull Map<String, Star> stars) {
        this.stars = stars;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Galaxy() {

    }

    public Galaxy(@NotNull String name) {
        this.name = name;
    }

}
