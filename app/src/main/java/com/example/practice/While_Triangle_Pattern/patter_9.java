package com.example.practice.While_Triangle_Pattern;

import java.util.Scanner;

public class patter_9 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;

        while (i <=n ) {
            int a = 1;
            while (a <= i) {
                System.out.print("*");
                a++;
            }
            
            int b = 1;
            while (b<=(n+1)-i){
                if (b==1&& i ==n){
                    System.out.print("");
                }else if(b==1&&i>=1) {
                    System.out.print("");
                }else if (b==2&&i>=1){
                    System.out.print(" ");
                }else {
                    System.out.print("  ");
                }
                b++;
            }
            int c = 1;
            while (c <= i){
                if (c==n&&i==n){
                    System.out.print("");
                }else {
                    System.out.print("*");
                }
                c++;
            }
            
            System.out.println();
            i++;
        }
        int d = 1;
        while (d<=(n-1)){
            int e = 1;
            while (e <=((n-1)+1)-d){
                System.out.print("*");
                e++;
            }
            int f = 1;
            while (f <= d){
                if (f==1&&d==1) {
                    System.out.print(" ");
                }else if(f!=1&&f<=(n-1)&&d>=1) {
                    System.out.print("  ");
                }else {
                    System.out.print(" ");
                }
                f++;
            }
            int g = 1;
            while (g <= ((n-1)+1)-d){
                System.out.print("*");
                g++;
            }
            System.out.println();
            d++;
        }
        
    }
}