package com.allenhuang;

public class TernarySearch {
    public int search(int[] arr, int target) {
        return search(arr,target,0,arr.length - 1);

    }
    private int search(int[] arr, int target,int left, int right) {
        if (left > right) return -1;
        int mid1 = left + (right - left) / 3;
        int mid2 = right - (right - left) / 3;
        if (arr[mid1] > target) return search(arr,target,left,mid1 - 1);
        else if (arr[mid2] < target) return search(arr,target,mid2 + 1,right);
        else if (arr[mid1] == target) return mid1;
        else if (arr[mid2] == target) return mid2;
        else return search(arr,target,mid1 + 1, mid2 - 1);
    }
}
