package com.allenhuang;

public class QuickSort {
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] arr, int start, int end) {
        if (start >= end) return;
        // Partition
        var boundary = partition(arr, start, end);
        // Sort left (in place, do not need copy)
        sort(arr,start,boundary - 1);
        // Sort right
        sort(arr,boundary + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        // return the index of pivot
        var pivot = arr[end];
        int i, b = start - 1; // 比如现在正在partition index 3-8，boundary最开始设为2
        for (i = start; i <= end; i++) {
            if (arr[i] <= pivot) {
                b++;
                swap(arr,i,b);
            }
        }
        // boundary is the index of pivot
        return b;
    }

    private void swap(int[] arr, int index1, int index2) {
        int inter = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = inter;
    }
}
