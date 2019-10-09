package com.company.Lecture_3;

import java.util.Scanner;

public class MirrorDiamondHG {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
        int n = 5;
        int r = 1;
        int h_mirror = 0;
        while (h_mirror < 2 * n) {
            // type spaces
            int c = 1;
            while (c < r + 2) {
                System.out.print(n - (c) + 1 + " ");
                c++;
            }
            c = 1;
            while (c <= n - r + 1) {
                System.out.print("  ");
                c++;
            }
            c = 0;
            while (c <= n - r) {
                System.out.print("  ");
                c++;

            }
            c = n - r;
            while (c <= n) {
                System.out.print(c + " ");
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
