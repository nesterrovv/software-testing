package org.zloyegor.trigonometry;

import static java.lang.Double.NaN;

public class Csc implements Trigonometry{

    public static double calculate(double x, double accuracy) {
        var radian = Trigonometry.angleToRad(x);

        if (Math.abs(radian) <= epsilon || Math.abs(radian - Math.PI) <= epsilon)
            return NaN;

        return 1 / Sin.calculate(x, accuracy);
    }

}
