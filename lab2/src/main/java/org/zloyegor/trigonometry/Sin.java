package org.zloyegor.trigonometry;

import static java.lang.Double.NaN;

public class Sin implements Trigonometry {

    public double calculate(double x, double accuracy) {
        /*
        taking into account the periodicity of the sine, we take the remainder of the division of the angle by 360
        and translate this angle into radians
         */
        x = Trigonometry.angleToRad(x);
        // preparations
        double member;
        double sum = 0;
        double sign = 1;
        double power = x;
        double factorial = 1;
        double multiplier = 1;
        // get sum of the series
        do {
            // calculating current member of the series
            member = sign * power / factorial;
            // Appending to sum
            sum += member;
            // preparing next step
            sign *= -1;
            multiplier++;
            factorial *= multiplier;
            multiplier++;
            factorial *= multiplier;
            power *= x * x;
        } while (Math.abs(member) > accuracy);
        return sum;
    }

}
