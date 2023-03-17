package org.zloyegor.trigonometry;

public class Cos implements Trigonometry{

    public static double calculate(double x, double accuracy) {

        var value = 1 - Math.pow(Sin.calculate(x, accuracy), 2);

        if (value > .1e-12) {
            value = Math.sqrt(value);
        }

        x = Trigonometry.angleToRad(x);

        if (Math.abs(x) >= Math.PI / 2)
            value *= -1;

        return value;
    }
}
