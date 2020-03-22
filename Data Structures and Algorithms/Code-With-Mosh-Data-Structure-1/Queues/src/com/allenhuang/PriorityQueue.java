package com.allenhuang;

import java.util.Arrays;

public class PriorityQueue {
    // item where sorted in descending order
    private int[] arr;
    private int count = 0;

    public PriorityQueue(int length) {
        this.arr = new int[length];
    }

    public boolean isFull(){
        return count == arr.length;
    }

    public void add(int item) {
        if (isFull()
        ) {
            arr = resizeIfRequried();
        }
        int i = shiftItemsToInsert(item);
        arr[i] = item;
        count++;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        // [0,0,0,0]
        // [1,0,0,0]
        // we want to insert 2
        for (i = count - 1; i >= 0; i--) {
            if (arr[i] > item) {
                arr[i + 1] = arr[i];
            }
            else {
                // break this for loop, it's only for shift items
                break;
            }
        }
        return ++i;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int remove() {
        if(isEmpty()) throw new IllegalStateException();
        count--;
        return arr[count];
    }

    private int[] resizeIfRequried() {
        int[] arrNew = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        return arrNew;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
