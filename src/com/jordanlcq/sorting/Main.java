package com.jordanlcq.sorting;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    /*
        TODO:
           1. Add ascending sort for a splited array when his size is > {toDefine}
           2. Multi thread sort
     */

    private static final int ARRAY_SIZE = 1000000;

    private static final int MAX_INTEGER = Integer.MAX_VALUE;

    public static void main(String[] args) {

        ArrayList<Integer> toSort = new ArrayList<Integer>(){};

        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            toSort.add(random.nextInt(MAX_INTEGER));
        }
        Benchmark.BenchmarkQuickSort(toSort);
    }
}
