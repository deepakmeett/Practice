package com.example.practice.Number_While_Loop;

public class Pattern_5 {

    public static void main(String args[]) {
        int x = 4;
        int i = 1;
        
        int add = 0;

        while (i <= x) {
            int p = 1;
            while (p <= i) {
                add++;
                System.out.print( add +" ");
                p++;
            }
            System.out.println();
            i++;
        }

    }
}
