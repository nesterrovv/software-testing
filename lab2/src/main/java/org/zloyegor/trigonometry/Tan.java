package org.zloyegor.trigonometry;

import static java.lang.Double.NaN;

public class Tan implements Trigonometry{
    public double calculate(double x, double accuracy) {
        var radian = Trigonometry.angleToRad(x);

        if (Math.abs(radian - Math.PI / 2) <= epsilon || Math.abs(radian - Math.PI * 3 / 2) <= epsilon)
            return NaN;
        Sin sin = new Sin();
        Cos cos = new Cos();
        return sin.calculate(x, accuracy) / cos.calculate(x, accuracy);
    }

}
