package com.example.practice.While_Triangle_Pattern;

import java.util.Scanner;

public class patter_10 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        int i = 1;
        while (i <= x) {
            int a = 1;
            while (a <= (x + 1) - i) {
                System.out.print(" ");
                a++;
            }

            int b = 1;
            while (b <= i) {
                System.out.print("*");
                b++;
            }
            int c = 1;
            while (c < i) {
                System.out.print("*");
                c++;
            }
            System.out.println();
            i++;

        }
        int z = x * 2 + 1;
        int q = 1;
        while (q<=1) {
            int w = 1;
            while (w<=z){
                System.out.print("*");
                w++;
            }
            System.out.println();
            q++;
            
        }
                
        int d = 1;
        while (d <= x) {
            int e = 1;
            while (e <= d) {
                System.out.print(" ");
                e++;
            }
            int f = 1;
            while (f <= (x + 1) - d) {
                System.out.print("*");
                f++;
            }
            int g = 1;
            while (g < (x + 1) - d) {
                System.out.print("*");
                g++;
            }
            System.out.println();
            d++;
        }
    }
}