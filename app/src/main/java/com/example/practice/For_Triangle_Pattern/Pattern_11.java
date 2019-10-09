package com.example.practice.For_Triangle_Pattern;

import java.util.Scanner;

public class Pattern_11 {

    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
        int x = 5;
//                scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println();

            for (int j = 1; j <= (x + 1) - i; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= i; k++) {
                if (k == 1 && i == 1) {
                    System.out.print("*");
                } else if (k==1&&i<=5){
                    System.out.print(" ");
                }else {
                    System.out.print("  ");
                }
            }

            for (int l = 1; l <= (x + 1) - i; l++) {
                System.out.print("*");
            }
        }
        for (int a = 1; a <= x; a++) {
            System.out.println("");
            for (int o = 1; o <= a; o++) {
                System.out.print("*");
            }
            for (int p = 1; p <= (x + 1) - a; p++) {
                if (a==5&&p==1){
                    System.out.print("*");
                }else if (p==1&&a<=5){
                    System.out.print(" ");
                }else {
                    System.out.print("  ");
                }
            }
            for (int q = 1; q <= a; q++) {
                System.out.print("*");
            }
        }
    }
}
