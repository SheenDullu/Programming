package com.practice.code.string;

/**
 * Write a method to replace all the spaces in a string with ‘%20’. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the “true”
 * length of the string.
 **/

public class URLify {
    public static String replaceAllSpace(String sentence) {
        StringBuilder sb = new StringBuilder();
        boolean prev = false;
        for (int i = 0; i < sentence.strip().length(); i++) {
            if (sentence.charAt(i) == ' ' && !prev) {
                sb.append("%20");
                prev = true;
            } else {
                sb.append(sentence.charAt(i));
                prev = false;
            }
        }
        return sb.toString();
    }

    public static String replaceAllSpaceWithInBuiltMethod(String sentence) {
        String newSentence = sentence.strip();
        newSentence = newSentence.replaceAll("\\s", "%20");
        return newSentence;
    }
}
