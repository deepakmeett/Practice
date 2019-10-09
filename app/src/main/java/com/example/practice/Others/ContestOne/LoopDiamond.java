package com.company.Others.ContestOne;

import java.util.Scanner;

public class  LoopDiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;

        while (row <= n) {
            int col = 1;
            while (col <= (n - row)) {
                System.out.print("\t");
                col = col + 1;
            }
            col = 1;
            while (col <= row) {
                System.out.print("*\t");
                col = col + 1;
            }
            col = 2;
            while (col <= row) {
                System.out.print("*\t");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
        row = 2;
        while (row <= n) {

            int col = 2;
            while (col <= row) {
                System.out.print("\t");
                col = col + 1;
            }
            col = 1;
            while (col <= (n - row) + 1) {
                System.out.print("*\t");
                col = col + 1;
            }
            col = 1;
            while (col <= (n - row)) {
                System.out.print("*\t");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }

    }
}





