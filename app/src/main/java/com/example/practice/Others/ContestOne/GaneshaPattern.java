package com.company.Others.ContestOne;

import java.util.Scanner;

public class GaneshaPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = 0;
        while (r < n) {
            int c = 0;
            while (c < n) {
                if (c == 0 && r <= n / 2
                        || c == n - 1 && r >= n / 2
                        || r == 0 && c >= n / 2
                        || r == n - 1 && c <= n / 2
                        || c == n / 2
                        || r == n / 2) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                c++;
            }
            System.out.println();
            r++;
        }
    }
}
