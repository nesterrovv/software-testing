package org.zloyegor.logarithmic;

import static java.lang.Double.NaN;

public class Log {
    public double calculate(double x, double accuracy) {

        if (x <= 0) {
            return NaN;
        } else if (x < 1) {
            double result = 0.0;
            double term = x - 1.0;
            double sign = 1.0;
            int n = 1;

            while (Math.abs(term) > accuracy) {
                result += sign * term / n;
                sign *= -1.0;
                n++;
                term *= (x - 1.0);
            }

            return result;
        } else {
            double num, mul, cal, sum = 0;
            num = (x - 1) / (x + 1);

            boolean enoughAccuracy = false;

            for (int i = 1; !enoughAccuracy; i++) {
                mul = (2 * i) - 1;
                cal = Math.pow(num, mul);
                cal = cal / mul;
                sum = sum + cal;

                if (cal < accuracy / 2)
                    enoughAccuracy = true;
            }

            sum = 2 * sum;

            return sum;
        }
    }
}
