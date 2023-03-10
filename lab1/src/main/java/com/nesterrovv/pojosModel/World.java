package com.nesterrovv.pojosModel;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class World {

    private List<Entity> humanity;
    private Galaxy firstGalaxy;
    private List<Entity> humanoids;
    private Galaxy secondGalaxy;
    private static Random random;

    public World() {
        this.humanoids = new LinkedList<>();
        this.humanity = new LinkedList<>();
        this.firstGalaxy = new Galaxy();
        this.secondGalaxy = new Galaxy();
    }

    public String analyze() {
        if (firstGalaxy.getLifeExpectancyFactor() < secondGalaxy.getLifeExpectancyFactor()) {
            return "Retribution awaits the galaxy 2";
        } else {
            return "Retribution awaits the galaxy 1";
        }
    }

}
