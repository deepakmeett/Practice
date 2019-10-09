package com.example.practice.Number_While_Loop;

public class Pattern_6 {

    public static void main(String args[]) {
        int x = 5;
        int i = 1;


        while (i <= x) {
            int p = 1;
            int wrd = p+i;
            while (p <= i) {
                wrd--;
                System.out.print(wrd);
                p++;
            }
            System.out.println();
            i++;
        }

    }
}