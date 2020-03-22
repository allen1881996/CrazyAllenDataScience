package com.allenhuang;

import java.util.HashSet;
import java.util.Set;

public class FirstReChar {
    // we do not care how many times they are repeated
    // so it is better to use a set
    Set<Character> set = new HashSet<>();
    public char find(String str) {
        for (var ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
