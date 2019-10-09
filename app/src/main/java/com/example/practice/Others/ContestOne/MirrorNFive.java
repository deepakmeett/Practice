package com.company.Others.ContestOne;

import java.util.Scanner;

public class MirrorNFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = 0;
        int h_mirror = 0;
        while (h_mirror < n) {
            int c = 0;
            while (c < (n / 2) - r) {
                System.out.print("   ");
                c++;
            }
            c = 0;
            int v_mirror = 0;
            while (v_mirror < 2 * r + 1) {
                System.out.print(" * ");

                if (v_mirror < r) {
                    c++;
                } else {
                    c--;
                }
                v_mirror++;
            }
            System.out.println();
            if (h_mirror < n / 2) {
                r++;
            } else {
                r--;
            }
            h_mirror++;
        }
    }
}