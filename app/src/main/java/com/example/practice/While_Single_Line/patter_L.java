package com.example.practice.While_Single_Line;

import java.util.Scanner;

public class patter_L {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        int z = 1;
        while (z <= x) {
            int q = 1;
            while (q <= z) {
                if (z>=2&&z<=4&&q>=2&&q<=4){
                    System.out.print(" ");
                }else {
                    System.out.print("+");
                }
                q++;

            }
            System.out.println();
            z++;
        }
    }
}