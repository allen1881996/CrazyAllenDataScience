package com.allenhuang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public void sort(int[] arr, int numberOfBuckets) {
        // sort our bucket
        var i = 0;
        for (var bucket : createBucket(arr,numberOfBuckets)) {
            Collections.sort(bucket);
            for (var item : bucket) {
                arr[i] = item;
                i++;
            }
        }
    }
    private List<List<Integer>> createBucket(int[] arr,int numberOfBuckets) {
        // ArrayList is a class that implement the List interface
        // Every element of this linkedList is a list of int
        List<List<Integer>> buckets = new ArrayList<>();
        for (var i = 0; i < numberOfBuckets;i++) {
            buckets.add(new ArrayList<>());
        }
        for (var item : arr) {
            buckets.get(item/numberOfBuckets).add(item);
        }
        return buckets;
    }

}
