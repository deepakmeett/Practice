package com.company.Lecture_5;

import java.util.Scanner;

public class SwapInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {23, 34, 56, 78};
        swap(nums, 0,2);
        display(nums);

    }
    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}
