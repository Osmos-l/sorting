package com.jordanlcq.sorting;

import java.util.ArrayList;

public final class Benchmark {

    private Benchmark() {}

    public static void BenchmarkQuickSort(ArrayList<Integer> values) {
        double benchmark = System.currentTimeMillis();
        Quicksort.sort(values);
        benchmark = System.currentTimeMillis() - benchmark;
        System.out.printf("Insertion sort : %f ms\n", benchmark);
    }
}
