package com.java_bootcamp.algorithms.sort;

public class QuickSort {

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private int partition(int[] array, int startPost, int finishPos) {

        int finishMinPos = startPost - 1;
        int pivot = array[finishPos];

        for (int i = startPost; i < finishPos; i++) {
            if (array[i] < pivot) {
                finishMinPos++;
                swap(array, i, finishMinPos);
            }
        }
        swap(array, finishPos,  finishMinPos + 1);
        return finishMinPos + 1;
    }

    private void sort(int[] array, int startPos, int finishPos) {
        if (finishPos - startPos >= 2) {
            int p = partition(array, startPos, finishPos);
            sort(array, startPos, p - 1);
            sort(array, p + 1, finishPos);
        }
    }






    private void run() {
        // int[] array = new int[]{1,9,8,2,4,9,1,2,6};

        int n = 1000;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n - i;
        }

        // int[] array = new int[]{8,9,2,2,4,6,9,1,1};
        // int p = partition(array, 6, 8);
        // System.out.println(Arrays.toString(array));
        long startTime = System.currentTimeMillis();
        sort(array, 0, array.length - 1);
        long finishTime = System.currentTimeMillis();
        // System.out.println(Arrays.toString(array));
        System.out.println(finishTime - startTime + " ms");
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.run();
    }
}
