package org.zloyegor.logarithmic;

public class Log3 implements Logarithmic {
    public double calculate(double x, double accuracy) {
        var log = new Log();
        return log.calculate(x, accuracy) / log.calculate(3, accuracy);
    }
}
