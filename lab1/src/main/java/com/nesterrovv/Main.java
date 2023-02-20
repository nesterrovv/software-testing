package com.nesterrovv;

import com.nesterrovv.bucketSort.BucketSort;
import com.nesterrovv.sinePowerSeries.SinePowerSeriesCalculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.format("My calculation:                         sin(%d) = %f\n" +
                        "Value calculated via built-in function: sin(%d) = %f\n\n",
                42, SinePowerSeriesCalculator.calculateSinePowerSeries(42), 42,
                Math.sin(Math.toRadians(42)));
        System.out.format("My calculation:                         sin(%d) = %f\n" +
                        "Value calculated via built-in function: sin(%d) = %f\n\n",
                -42, SinePowerSeriesCalculator.calculateSinePowerSeries(-42), -42,
                Math.sin(Math.toRadians(-42)));
        System.out.format("My calculation:                         sin(%d) = %f\n" +
                        "Value calculated via built-in function: sin(%d) = %f\n\n",
                0, SinePowerSeriesCalculator.calculateSinePowerSeries(0), 0,
                Math.sin(Math.toRadians(0)));
        System.out.format("My calculation:                         sin(%d) = %f\n" +
                        "Value calculated via built-in function: sin(%d) = %f\n\n",
                1234567, SinePowerSeriesCalculator.calculateSinePowerSeries(1234567), 1234567,
                Math.sin(Math.toRadians(1234567)));
        System.out.format("My calculation:                         sin(%d) = %f\n" +
                        "Value calculated via built-in function: sin(%d) = %f\n\n",
                1234567, SinePowerSeriesCalculator.calculateSinePowerSeries(-1234567), -1234567,
                Math.sin(Math.toRadians(-1234567)));

        double[] array = {-1, -5, -7, -13, -234, 777, 0, 0};

        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(array));

        BucketSort.sort(array);

        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(array));
    }
}