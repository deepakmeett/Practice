package com.company.Lecture_7;

public class BitwiseExamples {
    public static void main(String[] args) {
//        System.out.println(5 & 11);
//        System.out.println(5 | 11);
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4, 4};
        odd0cc(nums);
        System.out.println(odd0cc(nums));

    }

    public static int odd0cc(int[] nums) {
        int acc = 0;
        for (int i = 0; i < nums.length; i++) {
            acc = acc ^ nums[i];
        }
        return acc;
    }
}
