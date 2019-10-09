package com.company.Others.ContestOne;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t1 = n;
        int len = 0;
        while (t1 != 0) {
            len = len + 1;
            t1 = t1 / 10;
        }
        int t2 = n;
        int arm = 0;
        int rem;
        while (t2 != 0) {
            int multi = 1;
            rem = t2 % 10;
            int i = 1;
            while (i <= len) {
                multi = multi * rem;
                i++;
            }
            arm = arm + multi;
            t2 = t2 / 10;
        }
        if (arm == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}