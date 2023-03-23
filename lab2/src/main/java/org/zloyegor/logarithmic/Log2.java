package org.zloyegor.logarithmic;

public class Log2 {

    public double calculate(double x, double accuracy) {
        Log log = new Log();
        return log.calculate(x, accuracy) / log.calculate(2, accuracy);
    }
}
