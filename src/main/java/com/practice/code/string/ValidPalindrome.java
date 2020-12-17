package com.practice.code.string;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String sentence = s.replaceAll("[^a-zA-Z0-9]", "");
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(" ", "");
        int l = 0;
        int r = sentence.length() - 1;
        while (l <= r) {
            if (sentence.charAt(l) != sentence.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
