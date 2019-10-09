package com.company.Others.ContestTwo;
import java.util.Scanner;
public class IsPallindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        System.out.println(pallin(a));
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