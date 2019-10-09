package com.company.Lecture_8;
import com.company.Lecture_5.ArrayIntroduction;
import java.lang.reflect.Array;
import java.util.Arrays;
public class BubbleRec {
    public static void main(String[] args) {
        int[] nums={4, 5, 2, 8};
        bubblesort(nums.length-1, 0, nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void bubblesort(int row, int col, int[] nums) {
        if (row == 0) {
            return;
        }
        if (row == col) {
            bubblesort(row - 1, 0, nums);
            System.out.println();
            return;
        }
        if (nums[col] > nums[col + 1]) {
            ArrayIntroduction.swap(nums, col, col + 1);
        }

        bubblesort(row, col + 1, nums);
    }
}