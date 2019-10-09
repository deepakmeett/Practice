package com.example.practice.Number_While_Loop;

public class Pattern_8 {
    public static void main(String args[]) {
        int x = 5;
        int i = 1;

        while (i <= x) {
            int p = 1;
            while (p <= (x - i) + 1) {
                System.out.print( x-p+1 );
                p++;
            }
            System.out.println();
            i++;
        }
    }
}
