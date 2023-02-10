package com.nesterrovv.sinePowerSeries;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SinePowerSeriesCalculatorTest  {

    double standardPositiveArgument;
    double standardNegativeArgument;
    double zeroArgument;
    double bigPositiveArgument;
    double bigNegativeArgument;
    int standardPositiveTermsAmount;
    int bigPositiveTermsAmount;
    int zeroTermsAmount;
    int negativeTermsAmount;

    final double epsilon = 1e-6;

    @Before
    public void initializeData() {
        this.standardPositiveArgument = 42;
        this.standardNegativeArgument = -42;
        this.zeroArgument = 0;
        this.bigPositiveArgument = 1000;
        this.bigNegativeArgument = -1000;
        this.standardPositiveTermsAmount = 100;
        this.zeroTermsAmount = 0;
        this.negativeTermsAmount = -42;
    }

    @Test
    public void doTest1() {
        double expectedResult = 0.66913060635;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator
                        .calculateSinePowerSeries(standardPositiveArgument, standardPositiveTermsAmount), epsilon);
    }

    @Test
    public void doTest2() {
        double expectedResult  = -0.66913060635;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(standardNegativeArgument, standardPositiveTermsAmount), epsilon);
    }

    @Test
    public void doTest3() {
        double expectedResult  = 0;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(zeroArgument, standardPositiveTermsAmount), epsilon);
    }

    @Test
    public void doTest4() {
        double expectedResult  = -0.9848077530104753;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(bigPositiveArgument, standardPositiveTermsAmount), epsilon);
    }

    @Test
    public void doTest5() {
        double expectedResult  = 0.9848077530104753;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(bigNegativeArgument, standardPositiveTermsAmount), epsilon);
    }

    @Test
    public void doTest6() {
        double expectedResult  = 0;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(bigNegativeArgument, zeroTermsAmount), epsilon);
    }

    @Test
    public void doTest7() {
        double expectedResult  = 0;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(bigNegativeArgument, negativeTermsAmount), epsilon);
    }

}
