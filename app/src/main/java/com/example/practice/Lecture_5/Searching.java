package com.company.Lecture_5;

public class Searching {
    public static void main(String[] args) {

        int[] nums = {23, 34, 56, 78};
        int l = linear(nums, 56);
        System.out.println(l);
    }

    public static int linear(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
                i++;
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binary(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}


//public static int linear(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//        if (nums[i] == target) {
//        return i;