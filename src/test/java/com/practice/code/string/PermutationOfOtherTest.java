package com.practice.code.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermutationOfOtherTest {

    @Test
    public void isPermutationOfTest1() {
        assertEquals("Are abcd and acdb", true, PermutationOfOther.isPermutationOf("abcd", "acdb"));
    }

    @Test
    public void isPermutationOfTest2() {
        assertEquals("Are adcabbbcd and acdbabbwc", false,
                PermutationOfOther.isPermutationOf("adcabbbcd", "acdbabbwc"));
    }
}