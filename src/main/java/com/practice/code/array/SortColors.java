package com.practice.code.array;


/**
 * Leetcode 75. Sort Colors
 **/
public class SortColors {
    public void sortColors(int[] nums) {
        if (nums.length <= 1) return;
        int start = 0;
        int end = nums.length - 1;
        int curr = 0;

        while (curr <= end) {
            if (nums[curr] == 0) {
                swap(nums, curr, start);
                start++;
                curr++;
            } else if (nums[curr] == 2) {
                swap(nums, curr, end);
                end--;
            } else if (nums[curr] == 1) {
                curr++;
            }
        }
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
