package com.practice.code.hash;

import java.util.HashMap;

public class WordCount {

    public static HashMap<String, Integer> countWords(String document) {
        HashMap<String, Integer> counts = new HashMap<>();
        for (String word : document.split(" ")) {
            String key = word.toLowerCase().replaceAll("[^a-z]", "");
            counts.put(key, counts.getOrDefault(key, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) {
        countWords("Gabba gabba hey, gabba gabba hey!")
                .forEach((key, value) -> System.out.println(key + ", " + value));
    }
}
