package com.java_bootcamp.algorithms.sort;

import java.util.Arrays;

public class InsertionSort {
    private void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private void run() {
        // int array[] = new int[]{1,5,7,9,2,1,1,2,5};
        int n = 100_000;
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        long startTime = System.currentTimeMillis();
        sort(array);
        long finishTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        System.out.println(finishTime - startTime + " ms");
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.run();
    }

}
