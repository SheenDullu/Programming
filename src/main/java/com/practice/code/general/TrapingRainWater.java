package com.practice.code.general;

public class TrapingRainWater {
    public int trap(int[] height) {
        if (height.length <= 2) return 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        int count = 0;
        for (int i = 0; i < height.length; i++) {
            count = count + Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return count;
    }
}
