package com.company.Lecture_5;
import java.util.Scanner;
public class InputInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] nums = input(n, s);
        display(nums);
    }
    public static void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static int[] input(int n, Scanner s) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        return nums;
    }
}