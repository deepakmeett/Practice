package com.company.Lecture_8;

public class Pattern {
    public static void main(String[] args) {
        pattern(2,0);

    }

    public static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row == col){
            pattern(row-1, 0);
            System.out.println();
            return;
        }
        pattern(row, col+1);
        System.out.print("* ");

    }
}