package com.company.Lecture_1;

public class LoopTen {

    public static void main(String[] args) {
        byte n = 4;

        byte row = 1;
        while (row <= n) {

            byte col = 1;
            while (col <= row) {

                System.out.print("*");
                col = (byte) (col + 1);
            }
            System.out.println();
            row = (byte) (row + 1);
        }
        row = 2;
        while (row <= n) {

            byte col = 1;
            while (col <= (n - row) + 1) {

                System.out.print("*");
                col = (byte) (col + 1);
            }
            System.out.println();
            row = (byte) (row + 1);

        }
    }
}


