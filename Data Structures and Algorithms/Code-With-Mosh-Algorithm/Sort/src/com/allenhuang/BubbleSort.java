package com.allenhuang;

public class BubbleSort {
    boolean isSorted;
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            int right = 1;
            int left = 0;
            while (right < arr.length-i) {
                if (arr[left] > arr[right]) {
                    swap(arr,left,right);
                    isSorted = false;
                }
                right ++;
                left ++;
            }
            if(isSorted) return;
        }
    }

    private void swap(int[] arr, int index1,int index2) {
        int j = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = j;
    }

}
