package com.allenhuang;

public class CountingSort {
    public void sort(int[] arr) {
        int maximum = max(arr);
        int[] newArr = new int[maximum + 1];
        for (int item : arr) {
            newArr[item] ++;
        }
        int k = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i]; j++) {
                arr[k] = i;
                k++;
            }
        }
    }
    private int max(int[] arr) {
        int max = 0;
        for (int item : arr) {
            if (item > max) max = item;
        }
        return max;
    }
}
