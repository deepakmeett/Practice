package com.company.Others.ContestOne;

import java.util.Scanner;

public class HolloRhombus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = 0;
        while (r < n) {
            int c = 0;
            while (c <= n - r) {
                System.out.print(" ");
                c++;
            }
            c = 0;
            while (c < n) {
                if (c == 0 || c == n - 1 || r == 0 || r == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                c++;
            }
            System.out.println();
            r++;
        }

    }
}