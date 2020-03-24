package com.allenhuang;

public class BinarySearch {
    public int search(int[] arr, int target) {
        // using iteration
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == target) return middle;
            else if (arr[middle] > target) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }

    public int searchRecur(int[] arr, int target) {
        int left = 0;
        int right =  arr.length - 1;
        int index = searchRecur(arr,target,left,right);
        return index;
    }
    public int searchRecur(int[] arr, int target, int left, int right) {
        // using recursion
        if (left > right) return -1; // we cannot find the item
        int middle = (left + right) / 2;
        if (arr[middle] == target) return middle;
        else if (arr[middle] > target) {
            return searchRecur(arr,target,0,middle - 1);
        }
        else return searchRecur(arr,target,middle + 1,right);
    }
}
