package org.zloyegor;

import org.zloyegor.other.Logarithm;
import org.zloyegor.trigonometry.Sine;

public class Main {
    public static void main(String[] args) {

        var sin = new Sine();
        System.out.println(sin.calculate(90, 0.000000001));

        var ln = new Logarithm();
        System.out.println(ln.calculate(0.04, 0.0000001));

    }
}