package com.company.Others.ContestOne;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        int rem = 0;
        int rev = 0;

        while (no > 0) {
            rem = no % 10;
            no = no / 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
