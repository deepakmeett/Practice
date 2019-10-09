package com.example.practice.Number_While_Loop;

public class Pattern_9 {

    public static void main(String args[]) {
        int x = 5;
        int i = 1;
        
        while (i <= x) {
            int wrd = i;
            int p = 1;
            while (p <= i) {
                System.out.print(wrd);
                wrd = wrd+x-p;
                p++;
            }
            System.out.println();
            i++;
        }
    }
}
