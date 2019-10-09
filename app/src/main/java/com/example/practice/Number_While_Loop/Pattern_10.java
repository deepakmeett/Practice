package com.example.practice.Number_While_Loop;

public class Pattern_10 {

    public static void main(String args[]) {
        int x = 5;
        int i = 1;
        int wrd = 0;

        while (i <= x) {

            if (i % 2 != 0) {
                int p = 1;
                int t = 3;
                while (p <= t) {
                    wrd++;
                    System.out.print( wrd );
                    p++;
                }
            } else {
            }
            System.out.println();
            i++;
        }
    }
}
