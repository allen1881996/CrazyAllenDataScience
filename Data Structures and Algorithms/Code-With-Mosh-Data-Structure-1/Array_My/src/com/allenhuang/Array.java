package com.allenhuang;

import java.util.Arrays;

public class Array {
    private int length;
    private double[] arr;
    private int count;

    public Array(int length) {
        this.length = length;
        arr = new double[length];
    }

    public int getCount() {
        return count;
    }

    public void insert(double item) {
        // if the array is full, resize it
        resizeIfRequired();

        arr[count++] = item;
    }

    private void resizeIfRequired() {
        if (arr.length == count) {
            // create a new array (twice the size)
            double[] newArr = new double[count*2];
            // copy all the existing items
            for(int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    public void removeAt(int index) {
        // validate the index
        if(index > count-1 || index < 0) {
            throw new IllegalArgumentException();
        }
        for(int i = index; i < count; i++) {
            arr[i] = arr[i+1];
        }
        count --;
    }

    public int indexOf(double item) {
        for(int i = 0; i < count; i++) {
            if(arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for(int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public double max() {
        double max = 0;
        for(int i = 0; i < count; i++) {
            if(arr[i] > max){
                max = arr[i]; }
        }
        return max;
    }

    public Array intersect(Array other) {
        var intersection = new Array(count);
        for(int i = 0; i < arr.length; i++){
            if(other.indexOf(arr[i]) >= 0){
                intersection.insert(arr[i]);
            }
        }
        return intersection;
    }

    public double[] reverse() {
        var reverseArr = new double[count];
        for (int i =0; i < count; i++) {
            reverseArr[i] = arr[count-1-i];
        }
        return reverseArr;
    }

    public void insertAt(int item, int index) {
        // validate the index
        if(index > count-1 || index < 0) {
            throw new IllegalArgumentException();
        }
        count ++;
        resizeIfRequired();
        for (int i = index; i < count; i++) {
            arr[i+1] = arr[i];
        }
        arr[index] = item;
    }



}
