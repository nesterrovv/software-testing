package com.nesterrovv.pojosModel;

import java.util.Objects;

public class Galaxy {

    String name;
    double averageTemperature;
    double volume;
    long population;
    Location location;
    long lifeExpectancyFactor;

    public Galaxy() {}

    public Galaxy(String name, double averageTemperature, double volume, long population,
                  Location location, long lifeExpectancyFactor) {
        this.name = name;
        this.averageTemperature = averageTemperature;
        this.volume = volume;
        this.population = population;
        this.location = location;
        this.lifeExpectancyFactor = lifeExpectancyFactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public long getLifeExpectancyFactor() {
        return lifeExpectancyFactor;
    }

    public void setLifeExpectancyFactor(long lifeExpectancyFactor) {
        this.lifeExpectancyFactor = lifeExpectancyFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Galaxy galaxy = (Galaxy) o;
        return Double.compare(galaxy.averageTemperature, averageTemperature) == 0 &&
                Double.compare(galaxy.volume, volume) == 0 && population == galaxy.population
                && lifeExpectancyFactor == galaxy.lifeExpectancyFactor &&
                Objects.equals(name, galaxy.name) && Objects.equals(location, galaxy.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, averageTemperature, volume, population, location, lifeExpectancyFactor);
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "name='" + name + '\'' +
                ", averageTemperature=" + averageTemperature +
                ", volume=" + volume +
                ", population=" + population +
                ", location=" + location +
                ", lifeExpectancyFactor=" + lifeExpectancyFactor +
                '}';
    }

}
