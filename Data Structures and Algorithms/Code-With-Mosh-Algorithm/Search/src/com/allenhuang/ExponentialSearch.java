package com.allenhuang;

public class ExponentialSearch {
    public int search(int[] arr, int target) {
        int bound = 1;
        // 如果bound一double超了长度，比如长度为7，bound变成了8
        while (arr[bound] < target && bound < arr.length) {
            bound *= 2;
        }
        int left = bound/2;
        int right = Math.min(bound,arr.length - 1);
        BinarySearch searcher = new BinarySearch();
        return searcher.searchRecur(arr,target,left,right);
    }
}
