package com.company.Others.ContestOne;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = 0;
        int i = 2;

        while (i < n - 1) {
            if (n % i == 0) {
                temp++;
            }
            i++;
        }
        if (temp == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}