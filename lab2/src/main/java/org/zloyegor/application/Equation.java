package org.zloyegor.application;

import org.zloyegor.logarithmic.Log2;
import org.zloyegor.logarithmic.Log3;
import org.zloyegor.logarithmic.Log5;
import org.zloyegor.logarithmic.Log10;

import org.zloyegor.trigonometry.Sin;
import org.zloyegor.trigonometry.Tan;
import org.zloyegor.trigonometry.Csc;
import org.zloyegor.trigonometry.Sec;

public class Equation {

    private static final double accuracy = 1e-10;

    public double calculateFirstSystem(double x) {
        if (x <= 0) {
            return (((Math.pow(Math.pow(new Csc().calculate(x, accuracy) / new Sin().calculate(x, accuracy), 3) /
                    new Sec().calculate(x, accuracy), 3) - (new Tan().calculate(x, accuracy)
                    / Math.pow(new Csc().calculate(x, accuracy), 3)))));
        } else {
            return ((((new Log2().calculate(x, accuracy) / new Log3().calculate(x, accuracy)) *
                    new Log10().calculate(x, accuracy)) * new Log5().calculate(x, accuracy)) +
                    new Log2().calculate(x, accuracy)) * new Log10().calculate(x, accuracy);
        }
    }

    public double calculateSecondSystem(double x) {
        Csc csc = new Csc();
        Sin sin = new Sin();
        Sec sec = new Sec();
        Tan tan = new Tan();
        Log2 log2 = new Log2();
        Log3 log3 = new Log3();
        Log5 log5 = new Log5();
        Log10 log10 = new Log10();
        if (x <= 0) {
            return (((((csc.calculate(x, accuracy) / Math.pow(sin.calculate(x, accuracy), 3)) /
                    Math.pow(sec.calculate(x, accuracy), 3)) - (tan.calculate(x, accuracy) /
                    (Math.pow(csc.calculate(x, accuracy), 3))))));
        } else {
            return (((((log2.calculate(x, accuracy) / log3.calculate(x, accuracy)) * log10.calculate(x, accuracy)) *
                    log5.calculate(x, accuracy)) + log2.calculate(x, accuracy)) * log10.calculate(x, accuracy));
        }
    }


}
