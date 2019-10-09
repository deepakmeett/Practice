package com.company.Others.PendingCode;

public class ARecQuesTwo {
    public static void main(String[] args) {
        pattern(4,0);

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
