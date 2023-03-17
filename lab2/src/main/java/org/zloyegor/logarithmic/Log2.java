package org.zloyegor.logarithmic;

public class Log2 {

    public static double calculate(double x, double accuracy) {
        return Log.calculate(x, accuracy) / Log.calculate(2, accuracy);
    }
}
