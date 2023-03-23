package org.zloyegor.application;

import org.zloyegor.logarithmic.Log;
import org.zloyegor.logarithmic.Log2;
import org.zloyegor.logarithmic.Log3;
import org.zloyegor.logarithmic.Log5;
import org.zloyegor.logarithmic.Log10;

import org.zloyegor.trigonometry.Sin;
import org.zloyegor.trigonometry.Cos;
import org.zloyegor.trigonometry.Tan;
import org.zloyegor.trigonometry.Csc;
import org.zloyegor.trigonometry.Sec;

public class FunctionSystemCalculator {

    private static final double accuracy = 1e-10;

    public static double calculateFirstSystem(double x) {
        if (x <= 0) {
            return (((Math.pow(Math.pow(Csc.calculate(x, accuracy) / Sin.calculate(x, accuracy), 3) /
                    Sec.calculate(x, accuracy), 3) - (Tan.calculate(x, accuracy)
                    / Math.pow(Csc.calculate(x, accuracy), 3)))));
        } else {
            return ((((Log2.calculate(x, accuracy) / Log3.calculate(x, accuracy)) * Log10.calculate(x, accuracy)) *
                    Log5.calculate(x, accuracy)) + Log2.calculate(x, accuracy)) * Log10.calculate(x, accuracy);
        }
    }

}
