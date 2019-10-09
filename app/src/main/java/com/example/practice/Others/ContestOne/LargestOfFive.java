package com.company.Others.ContestOne;

import java.util.Scanner;

public class LargestOfFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        int largest = 0;
        if (a > b) {
            largest = a;
        } else {
            largest = b;
        }
        if (c > d) {
            largest = c;
        } else {
            largest = d;
        }
        if (largest < e) {
            largest = e;
        }
        System.out.println(largest);
    }
}