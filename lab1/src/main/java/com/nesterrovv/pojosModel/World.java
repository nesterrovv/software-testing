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
        this.humanity = generateHumanityList(EntityType.HUMAN);
        this.firstGalaxy = generateGalaxy();
        this.humanoids = generateHumanityList(EntityType.HUMANOID);
        this.secondGalaxy = generateGalaxy();
    }

    private  String generateRandomString() {
        int leftLimit = 48;     // numeral '0'
        int rightLimit = 122;   // letter 'z'
        int targetStringLength = 10;
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    private List<Entity> generateHumanityList(EntityType entityType) {
        List<Entity> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            Entity human = new Entity();
            human.setEntityType(entityType);
            human.setAlive(Math.random() > 0.5);
            human.setName(generateRandomString());
            human.setAge(random.nextLong(100));
            human.setHeight(random.nextDouble(250));
            human.setWeight(random.nextDouble(300));
            human.setWeight(random.nextLong(10));
            list.add(human);
        }
        return list;
    }

    private Galaxy generateGalaxy() {
        Galaxy galaxy = new Galaxy();
        galaxy.setName(generateRandomString());
        galaxy.setAverageTemperature(random.nextDouble(2000));
        galaxy.setVolume(random.nextDouble(1000000));
        galaxy.setPopulation(random.nextLong(10000000));
        galaxy.setLocation(new Location(random.nextLong(5000), random.nextLong(5000),
                random.nextLong(5000)));
        galaxy.setLifeExpectancyFactor(random.nextLong(100000));
        return galaxy;
    }

    public void war() {
        for (int i = 0; i < 100000; i++) {
            Entity human = humanity.get(i);
            human.attack(secondGalaxy);
            human.setAlive(Math.random() > 0.7);
            if (!human.isAlive()) {
                humanity.remove(human);
            }
            Entity humanoid = humanoids.get(i);
            humanoid.attack(firstGalaxy);
            humanoid.setAlive(Math.random() > 0.7);
            if (!humanoid.isAlive()) {
                humanoids.remove(humanoid);
            }
        }
    }

    public String analyze() {
        if (firstGalaxy.getLifeExpectancyFactor() < secondGalaxy.getLifeExpectancyFactor()) {
            return "Retribution awaits the galaxy 2";
        } else {
            return "Retribution awaits the galaxy 1";
        }
    }

}
