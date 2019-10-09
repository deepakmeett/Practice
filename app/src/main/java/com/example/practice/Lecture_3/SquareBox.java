package com.company.Lecture_3;

public class SquareBox {
    public static void main(String[] args) {
        int n = 8;
        int r = 0;
        while (r < n) {
            int c = 0;
            while (c < n) {
                System.out.print("* ");
                c++;
            }
            System.out.println();
            r++;
        }


    }
}
