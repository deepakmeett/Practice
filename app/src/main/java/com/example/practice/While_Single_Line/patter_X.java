package com.example.practice.While_Single_Line;

import java.util.Scanner;

public class patter_X {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        int z = 1;
        while (z <= x) {
            int q = 1;
            while (q <= x) {
                if ((x+1)-z==q||q==z){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                q++;

            }
            System.out.println();
            z++;
        }
    }
}