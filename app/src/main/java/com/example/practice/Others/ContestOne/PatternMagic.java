package com.company.Others.ContestOne;

import java.util.Scanner;

public class PatternMagic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = 1;
        int h_mirror = 0;
        while (h_mirror < 2 * n - 1) {
            int c = 0;
            while (c <= n - r) {
                System.out.print("*");
                c++;
            }
            c = 1;
            while (c <= r - 1) {
                System.out.print(" ");
                c++;
            }
            c = 2;
            while (c <= r - 1) {
                System.out.print(" ");
                c++;

            }
            c = 0;
            while (c <= n - (r)) {
                if (
                        r == n - 1 && c == n - 1
                                || c == n - 1 && r >= n / 2
                                || c == n - 2 && r >= n / 2
                                || c == n - 4 && c >= n / 2
                                || c == n - 2 && r == n / n
                                || r == 0 && c >= n / 2
                                || r == n - 1 && c <= n / 2
                                || c == 0
                                || r == n / 2
                                || c == n / 2
                                || c == n / 3)
                    System.out.print("*");
                c++;
            }
            System.out.println();
            if (h_mirror < n - 1) {
                r++;
            } else {
                r--;
            }
            h_mirror++;
        }
    }
}