package org.zloyegor;

import org.zloyegor.other.Logarithm;
import org.zloyegor.trigonometry.Trigonometry;

public class Main {
    public static void main(String[] args) {

        System.out.println(Trigonometry.sin(90, 0.000000001));

        System.out.println(Logarithm.calculate(0.04, 0.0000001));

        System.out.println(Logarithm.calculate(100, 10, .1e-11));

    }
}