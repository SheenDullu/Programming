package com.practice.code.string;

import java.util.HashMap;

/**
 * Write a function to check whether two given strings are Permutation of each other or not.
 **/

public class PermutationOfOther {
    public static boolean isPermutationOf(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            count.put(word1.charAt(i), count.getOrDefault(word1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            if (count.containsKey(word2.charAt(i))) {
                count.put(word2.charAt(i), count.get(word2.charAt(i)) - 1);
            } else return false;
            if (count.get(word2.charAt(i)) == 0) {
                count.remove(word2.charAt(i));
            }
        }
        return count.size() == 0;
    }
}
