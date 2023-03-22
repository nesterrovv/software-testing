package org.zloyegor.trigonometry;

public class Cos implements Trigonometry {

    @Override
    public double calculate(double x, double accuracy) {
        Sin sin = new Sin();

        var value = 1 - Math.pow(sin.calculate(x, accuracy), 2);

        if (value > .1e-12) {
            value = Math.sqrt(value);
        }

        x = Trigonometry.angleToRad(x);

        if (Math.abs(x) >= Math.PI / 2)
            value *= -1;

        return value;
    }
}
