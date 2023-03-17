package org.zloyegor.logarithmic;

public class Log10 {

    public static double calculate(double x, double accuracy) {
        return Log.calculate(x, accuracy) / Log.calculate(10, accuracy);
    }
}
