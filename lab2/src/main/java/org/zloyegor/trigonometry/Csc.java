package org.zloyegor.trigonometry;

import static java.lang.Double.NaN;

public class Csc implements Trigonometry{

    @Override
    public double calculate(double x, double accuracy) {
        var radian = Trigonometry.angleToRad(x);

        if (Math.abs(radian) <= epsilon || Math.abs(radian - Math.PI) <= epsilon)
            return NaN;

        var sin = new Sin();
        return 1 / sin.calculate(x, accuracy);
    }

}
