package com.company.Lecture_9;

public class Countsort {

    public static void zeroOneSort(int[] nums){
        int zeros = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 0){
                zeros++;
            }
        }
        for (int i = 0; i <zeros ; i++) {
            nums[i] = 0;
        }

        for (int i = 0; i <nums.length ; i++) {
            nums[i] = 1;
        }
    }
}
