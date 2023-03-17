package org.zloyegor.trigonometry;

public interface Trigonometry {
    double epsilon = .1e-12;

    static double angleToRad(double x) {
        return Math.PI / 180 * (x % 360);
    }
}
