package com.jordanlcq.sorting;

import java.util.ArrayList;

public final class Quicksort {

    private Quicksort() { }

    private static ArrayList<Integer> divideFromPivot(ArrayList<Integer> toSplit) {
        if (toSplit.size() <= 0) {
            return new ArrayList<>();
        }

        int pivot = toSplit.get(0);
        ArrayList<Integer> beforePivot = new ArrayList<>();
        ArrayList<Integer> afterPivot = new ArrayList<>();

        for (int i = 1; i < toSplit.size(); i++) {
            int value = toSplit.get(i);

            if (value < pivot) {
                beforePivot.add(value);
            } else {
                afterPivot.add(value);
            }
        }

        // Recursive
        beforePivot = divideFromPivot(beforePivot);
        afterPivot = divideFromPivot(afterPivot);

        // Merge arrays
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(beforePivot);
        result.add(pivot);
        result.addAll(afterPivot);

        return result;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> toSplit) {
        return Quicksort.divideFromPivot(toSplit);
    }

}
