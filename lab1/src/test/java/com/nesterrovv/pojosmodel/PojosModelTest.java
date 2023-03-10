package com.nesterrovv.pojosmodel;

import com.nesterrovv.pojosModel.Entity;
import com.nesterrovv.pojosModel.Galaxy;
import com.nesterrovv.pojosModel.World;
import org.junit.Assert;
import org.junit.Test;

public class PojosModelTest {

    @Test
    public void checkAttack() {
        Galaxy sample = new Galaxy();
        sample.setLifeExpectancyFactor(200);
        new Entity().attack(sample);
        long expected = 100;
        Assert.assertEquals(expected, sample.getLifeExpectancyFactor());
    }

    @Test
    public void checkFirstCaseOfAnalyze() {
        Galaxy first = new Galaxy();
        first.setLifeExpectancyFactor(100);
        Galaxy second = new Galaxy();
        second.setLifeExpectancyFactor(200);
        String test = new World().analyze();
        String expected = "Retribution awaits the galaxy 1";
        Assert.assertEquals(expected, test);
    }

    @Test
    public void checkSecondCaseOfAnalyze() {
        Galaxy first = new Galaxy();
        first.setLifeExpectancyFactor(200);
        Galaxy second = new Galaxy();
        second.setLifeExpectancyFactor(100);
        String test = new World().analyze();
        String expected = "Retribution awaits the galaxy 1";
        Assert.assertEquals(expected, test);
    }

    @Test
    public void checkThirdCaseOfAnalyze() {
        Galaxy first = new Galaxy();
        first.setLifeExpectancyFactor(200);
        Galaxy second = new Galaxy();
        second.setLifeExpectancyFactor(200);
        String test = new World().analyze();
        String expected = "Retribution awaits the galaxy 1";
        Assert.assertEquals(expected, test);
    }

}
