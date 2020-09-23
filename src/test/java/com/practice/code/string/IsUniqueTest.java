package com.practice.code.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {

    @Test
    public void checkForUniqueCharacterWord() {
        assertEquals("For word avi", true, IsUnique.hasUniqueCharacters("avi"));
    }

    @Test
    public void checkForNotUniqueCharacterWord() {
        assertEquals("For word sheen", false, IsUnique.hasUniqueCharacters("sheen"));
    }

    @Test
    public void checkForASingleLetter() {
        assertEquals("For word a", true, IsUnique.hasUniqueCharacters("a"));
    }


    @Test
    public void checkForUniqueCharacters() {
        assertEquals("For word fhdyeiodncz", false, IsUnique.hasUniqueCharacters("fhdyeiodncz"));
    }

}