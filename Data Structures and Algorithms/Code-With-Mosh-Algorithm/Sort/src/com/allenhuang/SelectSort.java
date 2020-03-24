package com.allenhuang;

public class SelectSort {
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            var minIndex = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    swap(arr,minIndex,j);
                }
            }
        }
    }

    private void swap(int[] arr, int index1,int index2) {
        int j = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = j;
    }
}
