package com.company.Lecture_6;
import com.company.Lecture_5.ArrayIntroduction;

import java.util.Arrays;
public class ArrayExamples {
    public static void main(String[] args) {
        int[] nums = {4, 1, 0, 2, 3};
        int[] r = inverse(nums);
//        reverse(nums);
        System.out.println(Arrays.toString(r));
    }
//    public static void reverse(int[] nums) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left < right){
//            ArrayIntroduction.swap(nums, left, right);
//            left++;
//            right--;
//        }
//        for (int i = 0; i < nums.length / 2; i++) {
//            ArrayIntroduction.swap(nums, i, nums.length - i - 1);
//        }
//    }
    public static int[] inverse(int[] nums) {
        int[] res = new int[nums.length];
        for (int p = 0; p < nums.length; p++) {
            int v = nums[p];
            res[v] = p;
        }
        return res;
    }
}