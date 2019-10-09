package com.example.practice.Number_While_Loop;

public class Pattern_1 {

    public static void main(String args[]) {
        int x = 5;
        int i = 1;

        while (i <= x) {
            int p = 1;
            while (p <= i) {
                System.out.print( i );
                p++;
            }
            System.out.println();
            i++;
        }
    }
}
