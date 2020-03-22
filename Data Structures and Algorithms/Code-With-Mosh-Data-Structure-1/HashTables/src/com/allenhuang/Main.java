package com.allenhuang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // 一般用HashMap, multi-thread applications using ConcurrentHashMap
        // key-value pair
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Mosh");
        map.put(2,"Allen");
        map.put(3,"John");
        // with the same key, the previous value will be overwritten
        map.put(3,"Mary");
        System.out.println(map);
        map.put(null,null);
        // both key and value can be null
        System.out.println(map);
        map.remove(null);
        System.out.println(map);
        // get the value
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2)); // O(1), 不需要iterate
        System.out.println(map.containsValue("Allem")); // O(n)

        for (var item : map.keySet()) System.out.println(item); // keys
        for (var item : map.entrySet()) System.out.println(item); // key value pair
        for (var item : map.entrySet()) System.out.println(item.getValue()); // only value

        System.out.println("------Find the first Non-repeated Character------");
        String s = "a green apple is blue";
        System.out.println(s.length());
        FirstNonReChar f = new FirstNonReChar();
        System.out.println(f.find(s));
        f.print();

        System.out.println("--------Set--------");
        // Set: only have key, do not allow duplicate keys
        // Set is an interface, and we always use HashSet
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,3,4,1,2,3,10,3,4};
        for (var number : numbers) {
            set.add(number);
        }
        System.out.println(set);
        set.clear();
        System.out.println(set);

        System.out.println("----Find First Repeated");
        FirstReChar rc = new FirstReChar();
        System.out.println(rc.find(s));

        System.out.println("-----Hash Fuctions------");
        int capacity = 100;
        // map every number between 0 and 99
        System.out.println(hash(13242));
        // What if the key is String
        System.out.println(hash("I Love You"));
        // get the hash code of an object
        String str = "Orange";
        System.out.println(str.hashCode());

        System.out.println("-----My Hash Table------");
        HashTable myHashTable = new HashTable(5);
        myHashTable.put(1,"Mosh"); // index 1
        myHashTable.put(2,"Allen"); // index 2
        myHashTable.put(6,"John"); // index 1
        myHashTable.put(1,"Kidd");
        System.out.println(myHashTable.get(1));
        System.out.println(myHashTable.get(10));
        myHashTable.remove(6);
        System.out.println(myHashTable.get(6));


        System.out.println("-----Most Frequent------");
        int[] arr = {2,3,1,3,4,3,3,3,7,10,3,4,2};
        HashTableExercises mapEx = new HashTableExercises();
        int most = mapEx.mostFrequent(arr);
        System.out.println(most);
        mapEx.print();

        System.out.println("-----Two Sum------");
        int[] arr3 = {1,3,4,5,7};
        mapEx.twoSum(arr3,8);

    }

    public static int hash(int number) {
        return number % 100;
    }

    public static int hash(String str) {
        int hash = 0;
        for (var ch : str.toCharArray()) {
            // implicit casting: char automatically convert to int
            hash += ch;
        }
        return hash % 100;
    }
}
