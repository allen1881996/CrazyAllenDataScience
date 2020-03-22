package com.allenhuang;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReChar {
    // Looking up items quickly -- using HashTable
    Map<Character,Integer> map = new HashMap<>();
    public char find(String str) {
        for (var ch : str.toCharArray()) {
            // if true, key already exist, get current count and plus one
            // if false, key not exist, set to 1
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch,count + 1);
        }
        for (var ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        // non-exist char
        return Character.MIN_VALUE;
    }

    public void print() {
        System.out.println(map);
    }
}
