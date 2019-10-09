package com.example.practice.While_Triangle_Pattern;

public class patter_5 {
    public static void main(String args[]) {
        int i = 1;

        while (i <= 5) {
            int k = 1;
            while (k <= (5 + 1) - i) {
                System.out.print(" ");
                k++;
            }
            int l = 1;
            while (l <= i) {
                System.out.print("* ");
                l++;
            }
            System.out.println();
            i++;
        }
    }
}