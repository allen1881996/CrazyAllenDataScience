package com.allenhuang;

public class MergeSort {
    public void sort(int[] arr) {
        // terminate when only one item in array
        if (arr.length < 2) return;
        // divide this array into half
        var middle = getMiddle(arr);
        int[] arrLeft = new int[middle];
        int[] arrRight = new int[arr.length - middle];
        for (int i = 0; i < arr.length; i++) {
            if (i < middle) arrLeft[i] = arr[i];
            else arrRight[i-middle] = arr[i];
        }
        // sort each half
        sort(arrLeft);
        sort(arrRight);

        merge(arrLeft,arrRight,arr);
    }

    private int getMiddle(int[] arr) {
        return arr.length/2;
    }
    // merge the result
    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            }
            else result[k++] = right[j++];
        }
        // but, maybe one of the partition is smaller than the other one
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
}
