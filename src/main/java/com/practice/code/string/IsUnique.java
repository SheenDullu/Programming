package com.practice.code.string;


/** Efficiently check if a string has all unique characters
 * without using any additional data structure**/

public class IsUnique {
    public static boolean hasUniqueCharacters(String word) {

        if (word.length() < 2) return true;

        for(int i = 0; i < word.length()-1; i++) {
            if(word.indexOf(word.charAt(i), i+1) > -1) return false;
        }
        return true;
    }

}
