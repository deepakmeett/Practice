package com.example.practice.Number_While_Loop;

public class Pattern_7 {

    public static void main(String args[]) {
        int x = 5;
        int i = 1;

        while (i <= x) {
            int p = 1;
            while (p <= i) {
                System.out.print( p );
                p++;
            }
            int q = 1;
            int wrd = q+i-1;
            while (q<i){
                wrd--;
                System.out.print( wrd );
                q++;
            }
            System.out.println();
            i++;
        }

    }
}
