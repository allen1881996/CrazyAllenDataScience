package com.allenhuang;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----Linear Search-----");
        int[] arr1 = {1,2,3,5,9,10};
        var searcher = new LinearSearch();
        System.out.println(searcher.search(arr1,2));

        System.out.println("-----Binary Search-----");
        int[] arr2 = {1,2,3,5,9,10};
        var searcher2 = new BinarySearch();
        System.out.println(searcher2.search(arr2,10));
        System.out.println(searcher2.searchRecur(arr2,10));

        System.out.println("-----Ternary Search-----");
        int[] arr3 = {1,2,3,5,9,10,12,15,20};
        var searcher3 = new TernarySearch();
        System.out.println(searcher3.search(arr3,3));

        System.out.println("-----Jump Search-----");
        int[] arr4 = {0,1,3,5,6,10,12,15,20,21,24};
        var searcher4 = new JumpSearch();
        System.out.println(searcher4.search(arr4,29));

        System.out.println("-----Exponential Search-----");
        int[] arr5 = {0,6,10,12,15,20,21,24};
        var searcher5 = new ExponentialSearch();
        System.out.println(searcher5.search(arr5,12));
    }
}
