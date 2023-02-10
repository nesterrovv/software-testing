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

    public static double calculateSinePowerSeries(double functionArgument, int numberOfTerms) {
        try {
            if (numberOfTerms <= 0) {
                throw new IncorrectTermsAmountExceptions();
            }
            int sign = 1;
            functionArgument = (functionArgument*Math.PI/180) % 360;
            double temporaryResult = 0;
            for (int i = 1; i <= numberOfTerms; i+=2) {
                double currentTerm = Math.pow(functionArgument, i) / calculateFactorial(i);
                currentTerm *= sign;
                sign *= -1;
                temporaryResult += currentTerm;
            }
            return temporaryResult;
        } catch (IncorrectTermsAmountExceptions incorrectTermsAmountExceptions) {
            System.err.println(incorrectTermsAmountExceptions.getMessage());
            return 0;
        }
    }

}
