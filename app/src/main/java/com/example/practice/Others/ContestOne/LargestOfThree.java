package com.company.Others.ContestOne;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int largest = 0;
        if (a > b) {
            largest = a;
        } else {
            largest = b;
        }
        if (largest < c) {
            largest = c;
        }
        System.out.println(largest);
    }
}