package com.company.Others.ContestOne;

import java.util.Scanner;

public class FibonakiNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int t1 = 0;
        int t2 = 1;

        while (t1 <= N)
        {
            System.out.println(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}