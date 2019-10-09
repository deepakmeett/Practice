package com.example.practice.While_Triangle_Pattern;

public class patter_4 {
    public static void main(String args[]) {
        int i = 1;

        while (i <= 5) {
            int l = 1;
            while (l <= i) {
                System.out.print(" ");
                l++;
            }
            int k = 1;
            while (k <= (5 + 1) - i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

    }
}