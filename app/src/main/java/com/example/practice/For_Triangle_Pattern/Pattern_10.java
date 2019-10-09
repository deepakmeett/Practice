package com.example.practice.For_Triangle_Pattern;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println();

            for (int j = 1; j <= (x + 1) - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }
        }
        for (int s = 1; s <= 1; s++) {
            System.out.println();
            for (int t = 1; t < (x * 2)+2; t++) {
                System.out.print("*");
            }
        }

        for (int o = 1; o <= x; o++) {
            System.out.println();

            for (int p = 1; p <= o; p++) {
                System.out.print(" ");
            }
            for (int q = 1; q <= (x + 1) - o; q++) {
                System.out.print("*");
            }
            for (int r = 1; r < (x + 1) - o; r++) {
                System.out.print("*");
            }
        }
    }
}
