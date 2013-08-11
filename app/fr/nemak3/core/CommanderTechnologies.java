package fr.nemak3.core;

import javax.persistence.Embeddable;

@Embeddable
public class CommanderTechnologies {
    private int techMilitaryPoints;
    private int techDefensivePoints;
    private int techCombinatoryPoints;

    public int getTechMilitaryPoints() {
        return techMilitaryPoints;
    }

    public void setTechMilitaryPoints(int techMilitaryPoints) {
        this.techMilitaryPoints = techMilitaryPoints;
    }

    public int getTechDefensivePoints() {
        return techDefensivePoints;
    }

    public void setTechDefensivePoints(int techDefensivePoints) {
        this.techDefensivePoints = techDefensivePoints;
    }

    public int getTechCombinatoryPoints() {
        return techCombinatoryPoints;
    }

    public void setTechCombinatoryPoints(int techCombinatoryPoints) {
        this.techCombinatoryPoints = techCombinatoryPoints;
    }
}
