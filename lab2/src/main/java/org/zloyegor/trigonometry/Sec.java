package org.zloyegor.trigonometry;

import static java.lang.Double.NaN;

public class Sec implements Trigonometry{

    public static double calculate(double x, double accuracy) {
        var radian = Trigonometry.angleToRad(x);

        if (Math.abs(radian - Math.PI / 2) <= epsilon || Math.abs(radian - Math.PI * 3 / 2) <= epsilon)
            return NaN;

        return 1 / Cos.calculate(x, accuracy);

    }

}
