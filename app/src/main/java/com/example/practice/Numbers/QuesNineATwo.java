package com.example.practice.Numbers;

import java.util.Scanner;

public class QuesNineATwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while (row <= n) {

            int col = 1;
            while (col <= n - row) {
                System.out.print(" ");
                col = col + 1;
            }
            col = 1;
            while (col <= row) {
                System.out.print(col + " ");
                col = col + n;
            }
            col = 3;
            while (col <= row) {
                System.out.print((row + 1 / 2) - 1 + " ");
                col = col + 1;
            }
            col = 2;
            while (col <= row) {
                System.out.print((col - 1));
                col = col + n;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
