package com.example.practice.Number_While_Loop;

public class Pattern_4 {

    public static void main(String args[]) {
        int x = 5;
        int i = 1;

        while (i <= x) {
            int p = 1;
            while (p <= i) {
                System.out.print( x+1-p );
                p++;
            }
            System.out.println();
            i++;
        }

    }
}
