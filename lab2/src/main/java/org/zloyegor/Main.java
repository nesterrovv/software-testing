package org.zloyegor;

import org.zloyegor.logarithmic.Log;
import org.zloyegor.logarithmic.Log2;
import org.zloyegor.trigonometry.Cos;
import org.zloyegor.trigonometry.Sin;

public class Main {
    public static void main(String[] args) {

        var sin = new Sin();
        var cos = new Cos();

        System.out.println(sin.calculate(90, 0.000000001));

        System.out.println(Log.calculate(0.04, 0.0000001));

        System.out.println(Log2.calculate(100, .1e-11));

        System.out.println(cos.calculate(90, .000001));

    }
}