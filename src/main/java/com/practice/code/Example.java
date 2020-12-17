package com.practice.code;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        int[] nums = new int[]{5, 4, 3, 2, 1};


        System.out.print(maximumDifference(nums));

    }

    public static int maximumDifference(int[] nums) {
        if (nums.length < 2) return 0;
        int maxDifference = nums[0] - nums[1];
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - minValue > maxDifference) {
                maxDifference = nums[i] - minValue;
            }
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return maxDifference < 0 ? 0 : maxDifference;
    }
}
