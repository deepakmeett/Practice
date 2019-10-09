package com.company.Lecture_6;

import java.util.Scanner;

public class StringBuilderPallin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = "bob";
        String b = "Hello";
        System.out.println(pallin(a));
        System.out.println(pallin(b));
    }

    public static boolean pallin(String line) {
        int left = 0;
        int right = line.length() - 1;

        while (left < right) {
            if (line.charAt(left) != line.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}