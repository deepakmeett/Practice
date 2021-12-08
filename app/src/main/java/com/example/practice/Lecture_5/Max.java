package com.example.practice.Lecture_5;


public class Max {
    public static void main(String[] args) {
        int[] nums = {23, 34, 56, 55};
//        int m = max(nums, 0, 3);
//        System.out.println(nums[m]);
    }
    public static int maxIndex(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }
}