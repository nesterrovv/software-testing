package org.zloyegor.logarithmic;

public class Log2 implements Logarithmic {

    @Override
    public double calculate(double x, double accuracy) {
        var log = new Log();
        return log.calculate(x, accuracy) / log.calculate(2, accuracy);
    }
}
