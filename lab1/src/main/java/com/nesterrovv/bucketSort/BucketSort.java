package com.nesterrovv.bucketSort;

import java.util.*;

public class BucketSort {
    public static void sort(double[] array) {

        if (array == null)
            return;

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
