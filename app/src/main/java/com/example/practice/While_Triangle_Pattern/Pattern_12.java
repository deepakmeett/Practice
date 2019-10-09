package com.example.practice.While_Triangle_Pattern;

import java.util.Scanner;

public class Pattern_12 {

    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
        int x = 5;
//        scanner.nextInt();

        int a = 1;
        while (a <= x) {

            int b = 1;
            while (b <= (x + 1) - a) {
                System.out.print("\t\t");
                b++;
            }
            int c = 1;
            while (c <= a) {
                System.out.print("*\t");
                c++;
            }
            System.out.println();
            a++;
        }
        
        int d = 1;
        while (d <= x) {

            int e = 1;
            while (e <= d) {
                System.out.print("\t\t");
                e++;
            }
            int f = 1;
            while (f <= (x + 1) - d) {
                if (f==1&&d==1){
                    System.out.print("\t");
                }else {
                    System.out.print("*\t");
                }
                f++;
            }
            System.out.println();
            d++;
        }
    }
}
