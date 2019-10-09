package com.company.Others.PendingCode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import static com.company.Lecture_5.MaxIndxInArray.maxIndex;

public class MaxMinIndx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int temp = s.nextInt();
            nums[i] = temp;
//        int[] nums = {5, 2, 4, 6, 8, 10};
        int max = maxIndex(nums, 0, n-1);
        int min = minIndex(nums, 0, n-1);

        System.out.print(nums[max]);
        System.out.print(nums[min]);
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

    public static int minIndex(int[] nums, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] < nums[max]) {
                max = i;
            }
        }
        return max;
    }
}