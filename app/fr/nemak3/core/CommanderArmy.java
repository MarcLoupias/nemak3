package fr.nemak3.core;

import javax.persistence.Embeddable;

@Embeddable
public class CommanderArmy {
    private int shuttlesQty;
    private double shuttlesEff;
    private int lasersQty;
    private double lasersEff;
    private int missilesQty;
    private double missilesEff;

    public int getShuttlesQty() {
        return shuttlesQty;
    }

    public void setShuttlesQty(int shuttles) {
        this.shuttlesQty = shuttles;
    }

    public double getShuttlesEff() {
        return shuttlesEff;
    }

    public void setShuttlesEff(double shuttlesEff) {
        this.shuttlesEff = shuttlesEff;
    }

    public int getLasersQty() {
        return lasersQty;
    }

    public void setLasersQty(int lasers) {
        this.lasersQty = lasers;
    }

    public double getLasersEff() {
        return lasersEff;
    }

    public void setLasersEff(double lasersEff) {
        this.lasersEff = lasersEff;
    }

    public int getMissilesQty() {
        return missilesQty;
    }

    public void setMissilesQty(int missiles) {
        this.missilesQty = missiles;
    }

    public double getMissilesEff() {
        return missilesEff;
    }

    public void setMissilesEff(double missilesEff) {
        this.missilesEff = missilesEff;
    }
}
