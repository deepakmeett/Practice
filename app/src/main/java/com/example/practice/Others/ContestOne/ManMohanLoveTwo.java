package com.company.Others.ContestOne;

import java.util.Scanner;

public class ManMohanLoveTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = 1;
        int row = 1;
        while (row <= n) {

            int col = 1;
            while (col <= row) {
                System.out.print(1);
                col = col + n;
            }
            col = 3;
            while (col <= row) {
                temp = temp + 1;
                if (temp == 2) {
                    System.out.print(1);
                    col = col + 1;
                } else if (temp <= 4) {
                    System.out.print(0);
                    col = col + 1;
                } else if (temp <= 4) {
                    System.out.print(1);
                } else if (temp <= 7) {
                    System.out.print(1);
                    col = col + 1;
                } else if (temp < 9) {
                    System.out.print(0);
                    col = col + 1;
                }
            }
            col = 2;
            while (col <= row) {
                System.out.print(1);
                col = col + (n - 1);
            }
            System.out.println();
            row = row + 1;
        }
    }
}