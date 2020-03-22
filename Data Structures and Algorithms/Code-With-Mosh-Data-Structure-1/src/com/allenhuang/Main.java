package com.allenhuang;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Map is also an interface，we always use hashmap to implement
        // Key：Id
        // Value：Name
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Mosh");
        map.put(2,"Allen");
        map.put(3,"John");
        // the new value overwrite the previous one
        map.put(3,"Karl");
        // key and value can both be null
        map.put(4,null);
        map.put(null,null);
        // pass the key
        map.remove(null);
        System.out.println(map);
        System.out.println(map.get(2));
        // 看看这个key应该在什么address，如果有object就是true
        System.out.println(map.containsKey(2)); // O(1)
        // 需要iterate所有的object，和argument比较
        System.out.println(map.containsValue("John")); // O(n)
        // iterate
        for (var item : map.entrySet()) System.out.println(item); // return key value pair
        for (var item : map.keySet()) System.out.println(item);
    }
}
