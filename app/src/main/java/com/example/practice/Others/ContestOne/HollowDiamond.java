package com.company.Others.ContestOne;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int space = -1;
        int star = (n / 2 + 2) - 1;

        for (int i = 0; i < 2 * (n / 2 + 2) - 3; i++) {

            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }

            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j < star; j++) {
                if (i == 0 && j == 2) {
                    continue;
                } else if (i == (n / 2 + 2) && j == 2) {
                    continue;
                }
                System.out.print("*\t");
            }
            System.out.println();
            if (i < (n / 2 + 2) - 2) {
                star -= 1;
                space += 2;
            } else {
                star += 1;
                space -= 2;
            }
        }
    }
}

//    int n = 5;
//    int r = 0;
//    int h_mirror = 0;
//        while (h_mirror < n) {
//        int c = 0;
//        while (c < (n / 2)+1-r ) {
//        if (r == 0 && c == 0) {
//        continue;
//        }
//        System.out.print("*\t");
//        c++;
//        }
//        c = 0;
//        while (c < r) {
//        System.out.print("\t");
//        c++;
//        }
//        c = 1;
//        while (c < r) {
//        System.out.print("\t");
//        c++;
//        }
//        c = 0;
//        while (c < (n / 2) +1- r) {
//
////                } else if (r == n/2 + 2 && c == n/2 - 3) {
////                    continue;
//
//        System.out.print("\t*");
//        c++;
//        }
//        System.out.println();
//        if (h_mirror < n / 2) {
//        r++;
//        } else {
//        r--;
//        }
//        h_mirror++;
//        }