package com.nesterovv.bucketSort;

import com.nesterrovv.bucketSort.BucketSort;
import org.junit.Assert;
import org.junit.Test;

public class BucketSortTest {

    private final double delta = 0.000001;
    @Test
    public void doTest1() {
        double[] testArray = {0.84, 0.777, 0.99, 0.124, 0.02, 0.004, 0.123};
        double[] expectedArray = {0.004, 0.02, 0.123, 0.124, 0.777, 0.84, 0.99};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);

    }
    @Test
    public void doTest2() {
        double[] testArray = {};
        double[] expectedArray = {};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }
    @Test
    public void doTest3() {
        double[] testArray = {0, 0, 0, 0};
        double[] expectedArray = {0, 0, 0, 0};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }
    @Test
    public void doTest4() {
        double[] testArray = {734, 245, 2345, 32, 1_000_000_000, 503, 1, 0.055};
        double[] expectedArray = {0.055, 1, 32, 245, 503, 734, 2345, 1_000_000_000};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }
    @Test
    public void doTest5() {
        double[] testArray = {-1, -5, -7, -13, -234, 777, 0, 0};
        double[] expectedArray = {-234, -13, -7, -5, -1, 0, 0, 777};

        BucketSort.sort(testArray);
        Assert.assertArrayEquals(expectedArray, testArray, delta);
    }
}
