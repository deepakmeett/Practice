package com.example.practice.While_Triangle_Pattern;

public class patter_3 {
    public static void main(String args[]) {
        int i = 1;

        while (i <= 5) {
            int j = 1;
            while (j <= (5 + 1) - i) {
                System.out.print(" ");
                j++;

            }
            int k = 1;
            while (k <= i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

    }
}