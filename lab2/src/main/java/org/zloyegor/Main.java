package org.zloyegor;

import org.zloyegor.application.Equation;
import org.zloyegor.application.Writer;
import org.zloyegor.logarithmic.*;
import org.zloyegor.trigonometry.*;

public class Main {
    public static void main(String[] args) {
        writeTrigonometry();
        writeLogarithmic();
        writeSystem();
    }

    private static void writeTrigonometry() {
        Writer.open("report/csv/cos.csv");
        double x = -5;
        Cos cos = new Cos();
        for (int i = 0; i < 1000; i++) {
            Writer.write(x, cos.calculate(x, .1e-11), cos.toString());
            x += 0.01;
        }
        Writer.close();

        Writer.open("report/csv/sin.csv");
        x = -5;
        Sin sin = new Sin();
        for (int i = 0; i < 1000; i++) {
            Writer.write(x, sin.calculate(x, .1e-11), sin.toString());
            x += 0.01;
        }
        Writer.close();

        Writer.open("report/csv/tan.csv");
        x = -5;
        Tan tan = new Tan();
        for (int i = 0; i < 1000; i++) {
            Writer.write(x, tan.calculate(x, .1e-11), tan.toString());
            x += 0.01;
        }
        Writer.close();

        Writer.open("report/csv/sec.csv");
        x = -5;
        Sec sec = new Sec();
        for (int i = 0; i < 1000; i++) {
            Writer.write(x, sec.calculate(x, .1e-11), sec.toString());
            x += 0.01;
        }
        Writer.close();

        Writer.open("report/csv/scs.csv");
        x = -5;
        Csc csc = new Csc();
        for (int i = 0; i < 1000; i++) {
            Writer.write(x, csc.calculate(x, .1e-11), csc.toString());
            x += 0.01;
        }
        Writer.close();
    }

    private static void writeLogarithmic() {
        Writer.open("report/csv/log.csv");
        double x = 0;
        Log log = new Log();
        for (int i = 0; i < 500; i++) {
            Writer.write(x, log.calculate(x, .1e-11), log.toString());
            x += 0.01;
        }
        Writer.close();

        Writer.open("report/csv/log2.csv");
        x = 0;
        Log2 log2 = new Log2();
        for (int i = 0; i < 500; i++) {
            Writer.write(x, log2.calculate(x, .1e-11), log2.toString());
            x += 0.01;
        }
        Writer.close();

        Writer.open("report/csv/log3.csv");
        x = 0;
        Log3 log3 = new Log3();
        for (int i = 0; i < 500; i++) {
            Writer.write(x, log3.calculate(x, .1e-11), log3.toString());
            x += 0.01;
        }
        Writer.close();

        Writer.open("report/csv/log5.csv");
        x = 0;
        Log5 log5 = new Log5();
        for (int i = 0; i < 500; i++) {
            Writer.write(x, log5.calculate(x, .1e-11), log5.toString());
            x += 0.01;
        }
        Writer.close();

        Writer.open("report/csv/log10.csv");
        x = 0;
        Log10 log10 = new Log10();
        for (int i = 0; i < 500; i++) {
            Writer.write(x, log10.calculate(x, .1e-11), log10.toString());
            x += 0.01;
        }
        Writer.close();
    }

    private static void writeSystem() {
        Writer.open("report/csv/system.csv");
        double x = -4.5;
        Equation system = new Equation();
        for (int i = 0; i < 1500; i++) {
            if (x <= 0)
                Writer.write(x, system.calculateFirstSystem(x, .1e-11), system.toString());
            else
                Writer.write(x, system.calculateSecondSystem(x, .1e-11), system.toString());
            x += 0.01;
        }
        Writer.close();
    }
}