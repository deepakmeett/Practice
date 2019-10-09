package com.example.practice.For_Triangle_Pattern;

import java.util.Scanner;

public class Pattern_12 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i < x; i++) {
            System.out.println("");

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            if (i<=x-1)
            System.out.print("*");

            for (int k = 1; k < (x + 1) - i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l < (x + 1) - i; l++) {
                System.out.print("*");
            }
        }
        
    

        for (int o = 1; o <= x; o++) {
            System.out.println("");

            for (int p = 1; p <= (x+1) - o; p++) {
                    System.out.print(" ");
            }
            for (int q = 1; q  < o; q++) {
                 System.out.print("*");
            }
            System.out.print("*");

            for (int r = 1; r < o; r++) {
                System.out.print("*");
            }
        }
    }
}