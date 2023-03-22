package org.zloyegor.logarithmic;

public class Log5 implements Logarithmic {
    @Override
    public double calculate(double x, double accuracy) {
        var log = new Log();
        return log.calculate(x, accuracy) / log.calculate(5, accuracy);
    }
}
