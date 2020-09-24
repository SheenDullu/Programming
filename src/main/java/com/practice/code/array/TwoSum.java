package com.practice.code.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target
 **/

public class TwoSum {

    public static int[] hasTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (!map.containsKey(temp)) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(temp), i};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
