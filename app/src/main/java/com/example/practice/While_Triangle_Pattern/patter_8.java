package com.example.practice.While_Triangle_Pattern;

public class patter_8 {
    public static void main(String args[]) {

        int i = 1;

        while (i <= 5) {
            int l = 1;
            while (l <= (5 + 1) - i) {
                System.out.print("  ");
                l++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }

        int v = 1;
        while (v <= 1) {
            int r = 1;
            while (r <= (6 + 1) - v) {
                System.out.print("* ");
                r++;
            }
            System.out.println();
            v++;
        }
        int o = 1;
        while (o <= 5) {
            int p = 1;
            while (p <= o) {
                System.out.print("  ");
                p++;
            }
            int b = 1;
            while (b <= (5 + 1) - o) {
                System.out.print("* ");
                b++;
            }
            System.out.println();
            o++;
        }


    }

}
