package com.company.Lecture_6;

import java.util.Arrays;
import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
        int[] nums = {4, 1, 0, 2, 3};
        int[] r = inverse(nums);
//        for (int i = 0; i < n; i++) {
//            nums[i] = s.nextInt();
            System.out.println(Arrays.toString(r));
//        }
    }

    public static int[] inverse(int[] nums) {
        int[] res = new int[nums.length];
        for (int p = 0; p < nums.length; p++) {
            int v = nums[p];
            res[v] = p;
        }
        return res;
    }
}