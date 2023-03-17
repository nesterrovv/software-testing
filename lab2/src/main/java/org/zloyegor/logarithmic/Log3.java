package org.zloyegor.logarithmic;

public class Log3 {
    public static double calculate(double x, double accuracy) {
        return Log.calculate(x, accuracy) / Log.calculate(3, accuracy);
    }
}
