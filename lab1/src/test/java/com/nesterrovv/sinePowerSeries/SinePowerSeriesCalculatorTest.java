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

    int oneArgument;
    int minusOneArgument;
    int negativeTermsAmount;

    final double epsilon = 1e-11;

    @Before
    public void initializeData() {
        this.standardPositiveArgument = 42;
        this.standardNegativeArgument = -42;
        this.zeroArgument = 0;
        this.bigPositiveArgument = 1234567;
        this.bigNegativeArgument = -1234567;
        this.standardPositiveTermsAmount = 100;
        this.zeroTermsAmount = 0;
        this.negativeTermsAmount = -42;
    }

    @Test
    public void checkViaStandardPositiveArgument() {
        double expectedResult = 0.66913060635;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator
                        .calculateSinePowerSeries(standardPositiveArgument), epsilon);
    }

    @Test
    public void checkViaStandardNegativeArgument() {
        double expectedResult  = -0.66913060635;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(standardNegativeArgument), epsilon);
    }

    @Test
    public void checkViaZeroArgument() {
        double expectedResult  = 0;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(zeroArgument), epsilon);
    }

    @Test
    public void checkViaBigPositiveArgument() {
        double expectedResult  = 0.79863551004;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(bigPositiveArgument), epsilon);
    }

    @Test
    public void checkViaBigNegativeArgument() {
        double expectedResult  = -0.79863551004;
        Assert.assertEquals(expectedResult,
                SinePowerSeriesCalculator.calculateSinePowerSeries(bigNegativeArgument), epsilon);
    }

}
