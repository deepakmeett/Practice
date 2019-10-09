package com.company.Lecture_3;

public class Hollow {
    public static void main(String[] args) {
        int n = 9;
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                if (j == 0 || j == n - 1 || i == 0 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
