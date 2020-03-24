package com.allenhuang;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("------Bubble Sort------");
        int[] arr = {1,10,5,5,2,9,7,1,3,12,10,8,9};
        int[] arr2 = {10};
        var sorter = new BubbleSort();

        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
        sorter.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("------Select Sort------");
        var sorter2 = new SelectSort();
        int[] arr3 = {1,5,5,2,9,7,1,3,12,10,8,9};
        sorter2.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("------Insert Sort------");
        var sorter3 = new InsertSort();
        int[] arr4 = {10,2,1,2,5,10,8,9};
        sorter3.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("------Merge Sort------");
        var sorter4 = new MergeSort();
        int[] arr5 = {1,10,7,5,6,4,2};
        sorter4.sort(arr5);
        System.out.println(Arrays.toString(arr5));

        System.out.println("------Quick Sort------");
        var sorter5 = new QuickSort();
        int[] arr6 = {1,10,7,7,7,5,12,13,7,6,4,2};
        sorter5.sort(arr6);
        System.out.println(Arrays.toString(arr6));

        System.out.println("------Counting Sort------");
        var sorter6 = new CountingSort();
        int[] arr7 = {18,10,2,3,13,2,4,2};
        sorter6.sort(arr7);
        System.out.println(Arrays.toString(arr7));

        System.out.println("------Bucket Sort------");
        var sorter7 = new BucketSort();
        int[] arr8 = {18,10,2,3,13,2,4,2};
        sorter7.sort(arr8,10);
        System.out.println(Arrays.toString(arr8));
    }


}
