package com.allenhuang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashTableExercises {
    HashMap<Integer,Integer> map = new HashMap<>();

    public int mostFrequent(int[] arr) {
        countArray(arr);
        int max = 0;
        int most = 0;
        for (var en : map.entrySet()) {
            if (en.getValue() > max) {
                max = en.getValue();
                most = en.getKey();
            }
        }
        return most;
    }

    private void countArray(int[] arr) {
        for (var item : arr) {
            // if true, key already exist, get current count and plus one
            // if false, key not exist, set to 1
            int count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item,count + 1);
        }
    }

    public void print() {
        System.out.println(map);
    }

    public int countPairsWithDiff(int arr[], int k) {
        Set<Integer> set = new HashSet<>();
        for (var item : arr) {
            set.add(item);
        }

        // Now, we iterate over the array of numbers one more time,
        // and for each number check to see if we have (a + diff) or
        // (a - diff) in our set.
        var count = 0;
        for (var item : arr) {
            if (set.contains(item + k)) count++;
            if (set.contains(item - k)) count++;
            set.remove(item);
        }
        return count;
    }

    public void twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // store the arr into a map for quick lookup, we also need value, so I use map instead of set
        for (int i = 0; i<arr.length;i++) {
            // we store the index of that item as the value
            map.put(arr[i],i);
        }
        // find for each item, if contains (target - item)
        for (var item : arr) {
            if (map.containsKey(target - item)) System.out.println("[" + map.get(item) + "," + item + "]" );
            map.remove(item);
        }
    }

}
