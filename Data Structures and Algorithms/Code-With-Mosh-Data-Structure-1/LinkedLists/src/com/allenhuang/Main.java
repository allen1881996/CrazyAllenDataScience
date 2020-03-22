package com.allenhuang;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // <E>, generic,we can store any kind of obejct in this list
        // 如果不指定，那么不同的node可以储存不同数据类型
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(12);
        list.add(21);
        list.addLast(10);
        list.addFirst(100);
        System.out.println(list);
        list.removeLast();
        list.remove(1);
        System.out.println(list);
        System.out.println("If contains 10: " + list.contains(10));
        System.out.println("index of 10: " + list.indexOf(10));
        System.out.println("index of 100: " + list.indexOf(100));
        System.out.println("size(number of items): " + list.size());
        var arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("——————————————分界线——————————————");
        var myList1 = new com.allenhuang.LinkedList();
        myList1.addLast(10);
        myList1.addLast(12);
        myList1.addLast(15);
        System.out.println("index of 12: " + myList1.indexOf(12));
        System.out.println("index of 13: " + myList1.indexOf(13));
        System.out.println("contains 10 or not: " + myList1.contains(10));
        System.out.println("contains 20 or not: " + myList1.contains(20));
        myList1.removeFirst();
        System.out.println("contains 10 or not: " + myList1.contains(10));
        myList1.addLast(100);
        myList1.addLast(151);
        myList1.removeLast();
        System.out.println("contains 151 or not: " + myList1.contains(151));
        System.out.println("Size of list: " + myList1.size());
        myList1.removeLast();
        System.out.println("Size of list: " + myList1.size());
        myList1.removeLast();
        myList1.removeLast();
        System.out.println("Size of list: " + myList1.size());
        var myList2 = new com.allenhuang.LinkedList();
        myList2.addLast(1);
        myList2.addLast(2);
        myList2.addLast(3);
        myList2.addLast(4);
        myList2.addLast(5);
        var arr2 = myList2.toArray();
        System.out.println("Before reverse: " + Arrays.toString(arr2));
        myList2.reverse();
        var arr2Reverse = myList2.toArray();
        System.out.println("After reverse: " + Arrays.toString(arr2Reverse));
        myList2.reverse2();
        arr2Reverse = myList2.toArray();
        System.out.println("After reverse2: " + Arrays.toString(arr2Reverse));
        System.out.println(myList2.getKthFromTheEnd(0));
        myList2.printMiddle();
    }
}
