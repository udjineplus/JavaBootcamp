package com.java_bootcamp.algorithms.sort;

import java.util.ArrayDeque;
import java.util.Queue;

public class MergeSort {

    private void merge(int[] array, int startPos, int finishPos, int centerPos) {
        final int leftSize = centerPos - startPos;
        final int rightSize = finishPos - centerPos + 1;
        int[] left = new int[leftSize + 1];
        int[] right = new int[rightSize + 1];
        System.arraycopy(array, startPos, left, 0, leftSize);
        System.arraycopy(array, centerPos, right, 0, rightSize);
        left[leftSize] = Integer.MAX_VALUE;
        right[rightSize] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = startPos; k <= finishPos; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }
    }


    private void sortQueue(int[] array) {
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            int[] subArray = new int[1];
            subArray[0] = array[i];
            queue.add(subArray);
        }
        while (queue.size() > 1) {
            int[] left = queue.poll();
            int[] right = queue.poll();
            int[] mergeArray = new int[left.length + right.length];
            System.arraycopy(left, 0, mergeArray, 0, left.length);
            System.arraycopy(right, 0, mergeArray, left.length, right.length);
            merge(mergeArray, 0, mergeArray.length - 1, left.length);
            queue.add(mergeArray);
        }
        int[] sortedArray = queue.poll();
        System.arraycopy(sortedArray, 0, array, 0, array.length);
        System.arraycopy(sortedArray, 0, array, 0, sortedArray.length);
    }

    private void sort(int[] array, int startPos, int finishPos) {
        if (startPos < finishPos) {
            int centerPos = (finishPos + startPos) / 2;
            sort(array, startPos, centerPos);
            sort(array, centerPos + 1, finishPos);
            merge(array, startPos, finishPos, centerPos);
        }
    }

    private void run() {

        int n = 100_000_000;
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        long startTime = System.currentTimeMillis();
        sort(array, 0, array.length - 1);
        long finishTime = System.currentTimeMillis();
        // System.out.println(Arrays.toString(array));
        System.out.println(finishTime - startTime + " ms");

        startTime = System.currentTimeMillis();
        sortQueue(array);
        finishTime = System.currentTimeMillis();
        // System.out.println(Arrays.toString(array));
        System.out.println(finishTime - startTime + " ms");

    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.run();
    }
}
