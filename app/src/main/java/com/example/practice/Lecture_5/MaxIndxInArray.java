package com.company.Lecture_5;

public class MaxIndxInArray {
    public static void main(String[] args) {
        int[] nums = {23, 34, 56, 78};
        int m = maxIndex(nums, 0, 3);

        System.out.println(nums[m]);

    }

    public static int maxIndex(int[] nums, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }
}