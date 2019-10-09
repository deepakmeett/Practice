package com.company.Others.PendingCode;

import java.util.Scanner;

public class IsPallin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int reversed = 0, rem, original;

        original = num;

        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            reversed = reversed * 10 + rem;
        }
        if (original == reversed)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

