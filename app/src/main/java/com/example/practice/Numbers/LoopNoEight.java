package com.example.practice.Numbers;

import java.util.Scanner;

public class LoopNoEight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int row = 1;
        while (row <= n) {

            int col = 1;
            while (col <= (n - row)) {
                System.out.print("   ");
                col = col + 1;
            }
            col = 1;
            while (col <= row) {
                count = count + 1;
                System.out.print(count + "  ");
                col = col + 1;
            }
            col = 2;
            while (col <= row) {
                count = count - 1;
                System.out.print(count + "  ");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
