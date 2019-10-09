package com.company.Others.ContestOne;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = 1;
        while (r < n + 2) {
            int c = 1;
            while (c <= r) {
                System.out.print("  ");
                c++;
            }
            c = 1;
            while (c <= n - r + 1) {
                System.out.print(n - c - r + 2 + " ");
                c++;
            }
            c = 2 * n;
            while (c <= 2 * n) {
                System.out.print(0 + " ");
                c++;
            }
            c = 0;
            while (c <= n - r) {
                System.out.print(c + 1 + " ");
                c++;

            }
            System.out.println();
            r++;
        }
        r = 1;
        while (r <= n) {

            int c = 0;
            while (c <= n - r) {
                System.out.print("  ");
                c = c + 1;
            }
            c = 1;
            while (c <= (r)) {
                System.out.print(r - c + 1 + " ");
                c = c + 1;
            }
            System.out.print(0 + " ");
            c = 1;
            while (c <= (r)) {
                System.out.print(c + " ");
                c = c + 1;
            }
            System.out.println();
            r = r + 1;
        }
    }
}