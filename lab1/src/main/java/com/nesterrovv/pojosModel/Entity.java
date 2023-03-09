package com.nesterrovv.pojosModel;

import java.util.Objects;
import java.util.Random;

public class Entity {
    private EntityType entityType;
    private boolean isAlive;
    private String name;
    private long age;
    private double height;
    private double weight;
    private long fleetNumber;

    public Entity() {};

    public Entity(EntityType entityType, boolean isAlive, String name, long age, double height,
                  double weight, long fleetNumber) {
        this.entityType = entityType;
        this.isAlive = isAlive;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.fleetNumber = fleetNumber;
    }

    public void attack(Galaxy galaxy) {
        System.out.println(this.getName() + " participates in the battle!");
        galaxy.setLifeExpectancyFactor(galaxy.getLifeExpectancyFactor() - 100);
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getFleetNumber() {
        return fleetNumber;
    }

    public void setFleetNumber(long fleetNumber) {
        this.fleetNumber = fleetNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return isAlive == entity.isAlive && age == entity.age && Double.compare(entity.height, height) == 0
                && Double.compare(entity.weight, weight) == 0 && fleetNumber == entity.fleetNumber &&
                entityType == entity.entityType && Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityType, isAlive, name, age, height, weight, fleetNumber);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "entityType=" + entityType +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", fleetNumber=" + fleetNumber +
                '}';
    }

}
