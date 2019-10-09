package com.company.Lecture_1;

public class LoopNine {

    public static void main(String[] args) {
        int n = 4;

        int row = 1;
        while (row <= n) {

            int col = 1;
            while (col <= row) {
                System.out.print(" ");
                col = col + 1;
            }
            col = 1;
            while (col <= (n - row) + 1) {
                System.out.print("*");
                col = col + 1;
            }
            col = 1;
            while (col <= (n - row)) {
                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
