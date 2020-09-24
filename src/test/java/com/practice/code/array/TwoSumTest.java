package com.practice.code.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void hasTwoSum() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.hasTwoSum(new int[]{2, 7, 11, 15}, 9));
    }
}