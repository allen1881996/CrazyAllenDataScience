package com.allenhuang;

public class LinearSearch {
    public int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
