package com.practice.code.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterTest {

    @Test
    public void firstUniqChar() {
        assertEquals(0, FirstUniqueCharacter.firstUniqChar("leetcode"));
    }

    @Test
    public void testForSingleChar() {
        assertEquals(0, FirstUniqueCharacter.firstUniqChar("a"));
    }

    @Test
    public void test3() {
        assertEquals(6, FirstUniqueCharacter.firstUniqChar("aababae"));
    }
}