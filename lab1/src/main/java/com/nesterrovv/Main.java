package com.nesterrovv;

import com.nesterrovv.sinePowerSeries.SinePowerSeriesCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // todo (-inf; -36] V [36; +inf) not calculates
        System.out.println("RES: " + SinePowerSeriesCalculator.calculateSinePowerSeries(10000, 100));
    }
}