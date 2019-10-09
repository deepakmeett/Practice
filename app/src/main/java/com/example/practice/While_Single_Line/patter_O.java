package com.example.practice.While_Single_Line;

import java.util.Scanner;

public class patter_O {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        int z = 1;
        while (z <= x) {
            int q = 1;
            while (q <= x) {
                if (q==1||z==1||z==x||q==x){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
                q++;
            }
            System.out.println();
            z++;
        }
    }
}
