package org.zloyegor.trigonometry;

import static java.lang.Double.NaN;

public class Csc implements Trigonometry{

    public double calculate(double x, double accuracy) {
        var radian = Trigonometry.angleToRad(x);

        if (Math.abs(radian) <= epsilon || Math.abs(radian - Math.PI) <= epsilon
                || radian == Math.PI || radian == Math.PI*(-1))
            return NaN;

        return 1 / new Sin().calculate(x, accuracy);
    }

}
