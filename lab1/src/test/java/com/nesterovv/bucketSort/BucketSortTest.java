package com.nesterovv.bucketSort;

import com.nesterrovv.bucketSort.BucketSort;
import org.junit.Assert;
import org.junit.Test;

public class BucketSortTest {

    private final double delta = 1e-10;
    @Test
    public void sortZeroToOne() {
        double[] testArray = {0.84, 0.777, 0.99, 0.124, 0.02, 0.004, 0.123};
        double[] expectedArray = {0.004, 0.02, 0.123, 0.124, 0.777, 0.84, 0.99};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);

    }
    @Test
    public void sortEmptyArray() {
        double[] testArray = {};
        double[] expectedArray = {};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }
    @Test
    public void sortNullArray() {
        double[] testArray = null;
        double[] expectedArray = null;

        BucketSort.sort(testArray);
        Assert.assertEquals(expectedArray, testArray);
    }
    @Test
    public void sortEqualValues() {
        double[] testArray = {0, 0, 0, 0};
        double[] expectedArray = {0, 0, 0, 0};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }
    @Test
    public void sortZeroToPositive() {
        double[] testArray = {734, 245, 2345, 32, 1_000_000_000, 503, 1, 0.055};
        double[] expectedArray = {0.055, 1, 32, 245, 503, 734, 2345, 1_000_000_000};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }
    @Test
    public void sortNegativeToZero() {
        double[] testArray = {-1, -5, -7, -13, -234, 0, 0};
        double[] expectedArray = {-234, -13, -7, -5, -1, 0, 0};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }
    @Test
    public void sortSmallValues() {
        double[] testArray = {1e-1, 1e-5, 1e-7, 1e-3, 1e-9};
        double[] expectedArray = {1e-9, 1e-7, 1e-5, 1e-3, 1e-1};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }
    @Test
    public void sortNegativeToPositive() {
        double[] testArray = {1000, -203, 0, 4, -0.05, 1, 0, -87};
        double[] expectedArray = {-203, -87, -0.05, 0, 0, 1, 4, 1000};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }



}
