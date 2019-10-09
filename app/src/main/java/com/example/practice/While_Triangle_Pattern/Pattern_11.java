package com.example.practice.While_Triangle_Pattern;

import java.util.Scanner;

public class Pattern_11 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int a = 1;
        while (a <= x) {
            int b = 1;
            while (b <= (x + 1) - a) {
                System.out.print("*\t");
                b++;
            }
            int c = 1;
            while (c <= a) {
                if (c == 1 && a == 1) {
                    System.out.print("*\t");
                } else if (a == c) {
                    System.out.print("\t");
                } else {
                    System.out.print("\t\t");
                }
                c++;
            }
            int d = 1;
            while (d <= (x + 1) - a) {
                System.out.print("*\t");
                d++;
            }
            System.out.println();
            a++;
        }

        int e = 1;
        while (e <= x) {
            int f = 1;
            while (f <= e) {
                System.out.print("*\t");
                f++;
            }
            int g = 1;
            while (g <= (x + 1) - e) {
                if (g == 1 && e == x) {
                    System.out.print("*\t");
                }else if ((x+1)-g<=e) {
                    System.out.print("\t");
                }
                else {
                    System.out.print("\t\t");
                }
                g++;
            }
            int i = 1;
            while (i <= e) {
                System.out.print("*\t");
                i++;
            }
            System.out.println();
            e++;
        }
    }
}
