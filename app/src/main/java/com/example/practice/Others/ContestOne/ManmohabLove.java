package com.company.Others.ContestOne;

import java.util.Scanner;

public class ManmohabLove {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(1);
        int row = 1;
        while (row <= n) {

            int col = 2;
            while (col <= row) {
                System.out.print(1);
                col = col + n;
            }
            col = 3;
            while (col <= row) {
                System.out.print(0);
                col = col + 1;
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