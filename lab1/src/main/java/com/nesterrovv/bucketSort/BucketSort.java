package com.nesterrovv.bucketSort;

import java.util.*;

public class BucketSort {
    public static void sort(double[] array) {

        if (array == null)
            return;
        double[] positiveNumbers = Arrays.stream(array).filter(e -> e >= 0).toArray();
        double[] negativeNumbers = Arrays.stream(array).filter(e -> e < 0).map(e -> -e).toArray();

        sortPositive(negativeNumbers);
        sortPositive(positiveNumbers);

        for (int i = 0; i < negativeNumbers.length; i++) {
            array[i] = -negativeNumbers[negativeNumbers.length - 1 - i];
        }

        if (positiveNumbers.length > 0)
            System.arraycopy(positiveNumbers, 0, array, negativeNumbers.length, positiveNumbers.length);
    }

    private static void sortPositive(double[] array) {

        //noinspection unchecked
        List<Double>[] buckets = new LinkedList[array.length];

        for (int i = 0; i < array.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        var maxOpt = Arrays.stream(array).max();

        if (maxOpt.isEmpty()) {
            return;
        }

        double maxArrayValue = maxOpt.getAsDouble();

        for (double curElement : array) {
            int index = (int) (curElement * array.length / (maxArrayValue + 1));
            var curList = buckets[index];

            boolean appended = false;
            for (int j = 0; j < curList.size(); j++) {
                if (curElement <= curList.get(j)) {
                    curList.add(j, curElement);
                    appended = true;
                    break;
                }
            }
            if (!appended)
                curList.add(curElement);
        }

        int elementIndex = 0;
        for (List<Double> curList : buckets) {
            for (double e : curList) {
                array[elementIndex] = e;
                elementIndex++;
            }
        }
    }
}
