package com.java_bootcamp.algorithms.sort;
import java.util.Arrays;

class Heap {
    private int[] array;
    private int heapSize;

    public Heap(int[] array) {
        this.array = array;
        heapSize = array.length;
    }

    public int getHeapSize() {
        return heapSize;
    }


    public void decHeapSize() {
        heapSize--;
    }

    public int getLength() {
        return array.length;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int value) {
        array[i] = value;
    }


    public void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}

public class HeapSort {
    private int parent(int i) {
        return (int)Math.ceil((double)i / 2.0);
    }

    private int left(int i) {
        return i * 2 + 1;
    }

    private int right(int i) {
        return i * 2 + 2;
    }

    private void maxHeapify(Heap heap, int i) {
        int leftPos = left(i);
        int rightPos = right(i);
        int largestPos = i;
        if (leftPos < heap.getHeapSize() && heap.get(leftPos) > heap.get(largestPos)) {
            largestPos = leftPos;
        }
        if (rightPos < heap.getHeapSize() && heap.get(rightPos) > heap.get(largestPos)) {
            largestPos = rightPos;
        }
        heap.swap(i, largestPos);
        if (largestPos != i) {
            maxHeapify(heap, largestPos);
        }
    }

    private Heap buildMaxHeap(int[] array) {
        int startPos = (int)Math.floor((double)array.length / 2.0);
        Heap heap = new Heap(array);
        for (int i = startPos; i >= 0; i--) {
            maxHeapify(heap, i);
        }
        return heap;
    }

    private void sort(int[] array) {
        Heap heap = buildMaxHeap(array);
        for (int i = heap.getLength() - 1; i > 1; i--) {
            heap.swap(0, i);
            heap.decHeapSize();
            maxHeapify(heap, 0);
        }
    }

    private void run() {

        int n = 10_000_000;

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n - i;
        }

        long startTime = System.nanoTime();
        sort(array);
        long finishTime = System.nanoTime();
        System.out.println(finishTime - startTime + " ms");
        // System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        heapSort.run();
    }

}
