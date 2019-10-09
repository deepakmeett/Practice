package com.company.Others.ContestTwo;

import java.util.Scanner;

public class SelectionSorting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        selection(nums);
        display(nums);
    }

    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void selection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int m = maxIndex(nums, 0, nums.length - 1 - i);
            swap(nums, m, nums.length - 1 - i);
        }
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

    public static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}