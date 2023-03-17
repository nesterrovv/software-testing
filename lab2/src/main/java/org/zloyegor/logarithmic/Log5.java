package org.zloyegor.logarithmic;

public class Log5 {
    public static double calculate(double x, double accuracy) {
        return Log.calculate(x, accuracy) / Log.calculate(5, accuracy);
    }
}
