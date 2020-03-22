package com.allenhuang;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Array arr1 = new Array(3);
        arr1.print();
        arr1.insert(1);
        arr1.insert(2);
        arr1.insert(4);
        arr1.insert(5);
//        arr1.print();
//        arr1.removeAt(3);
//        arr1.print();
//        System.out.println(arr1.indexOf(5));
//        System.out.println(arr1.indexOf(10));
//        System.out.println(arr1.max());
        arr1.print();
        arr1.insertAt(10,3);
        arr1.print();

        // Two dynamic array
        // 1. Vector: 100% when full, synchronized(只有一个线程可以access)
        // 2. ArrayList: 50% when full
        // generic parameter：the type of each element in this list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(11);
        list.remove(0);
        System.out.println(list);
        list.indexOf(13);
        list.lastIndexOf(11);
        list.contains(10);
        list.size(); // number of items in this array

        // intersection
        arr1.print();
        Array arr2 = new Array(2);
        arr2.insert(2);
        arr2.insert(1);
        arr2.insert(10);
        arr2.insert(3);
        Array inter = arr1.intersect(arr2);
        System.out.println("Intersection of arr1 and arr2: ");
        inter.print();
        System.out.println("Max of arr2:" + arr2.max());
        double[] reverse = arr2.reverse();
        for (double i : reverse) {
            System.out.println(i);
        }
    }
}
