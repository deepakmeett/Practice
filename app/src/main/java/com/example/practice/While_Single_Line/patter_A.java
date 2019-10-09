package com.example.practice.While_Single_Line;

import java.util.Scanner;

public class patter_A {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        int z = 1;
        while (z <= x) {
            int q = 1;
            while (q <= (x + 1) - z) {
                System.out.print(" ");
                q++;
            }
            int a = 1;
            while (a <= z) {
                if (a==1|z==a) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                a++;
            }
            System.out.println();
            z++;
        }
    }
}
