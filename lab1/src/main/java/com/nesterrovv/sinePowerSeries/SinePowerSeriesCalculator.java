package com.nesterrovv.sinePowerSeries;

import com.nesterrovv.exceptions.IncorrectTermsAmountExceptions;

public class SinePowerSeriesCalculator {

    private static double calculateFactorial(double functionArgument) {
        double temporaryResult = 1;
        for (int i = 1; i <= functionArgument; i++) {
            temporaryResult *= i;
        }
        return temporaryResult;
    }
    public static double calculateSinePowerSeries(double functionArgument) {
        /*
        taking into account the periodicity of the sine, we take the remainder of the division of the angle by 360
        and translate this angle into radians
         */
        double x = Math.PI / 180 * (functionArgument % 360); //
        // preparations
        double member;
        double sum = 0;
        double tinyValue = 1e-15;
        double sign = 1;
        double power = x;
        double factorial = 1;
        double multiplier = 1;
        // get sum of the series
        do {
            // calculating current member of the series
            member = sign * power / factorial;
            // Appending to sum
            sum += member;
            // preparing next step
            sign *= -1;
            multiplier++;
            factorial *= multiplier;
            multiplier++;
            factorial *= multiplier;
            power *= x * x;
        } while (Math.abs(member) > tinyValue);
        return sum;
    }

}
