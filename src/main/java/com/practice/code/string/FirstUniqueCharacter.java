package com.practice.code.string;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        if (s.length() == 1) return 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int c = s.indexOf(s.charAt(i), i + 1);
            if (set.add(s.charAt(i)) && c < 0) {
                return i;
            }
        }
        return -1;
    }
}
