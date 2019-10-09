package com.example.practice.For_Triangle_Pattern;

import java.util.Scanner;

public class Pattern_9 {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <= x ; i++) {

            System.out.println();
            
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            for (int o = 1; o <= (x-i) ; o++) {
                if (o >= (x-i)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int q = 1; q <= i ; q++) {
                if (i==x&&q==1){
                    System.out.print("");
                }else {
                    System.out.print("*");
                }
            }
            
            
        }
        
        for (int k = 1; k <= x ; k++) {
            System.out.println();
            
            for (int l = 1; l <= (x-k) ; l++) {
                System.out.print("*");
            }
            for (int p = 1; p <= k ; p++) {
                if (p >= k){
                    System.out.print(" ");
                }else {
                    System.out.print("  ");
                }
            }
            for (int v = 1; v <= (x-k) ; v++) {
                System.out.print("*");
            }
        }
    }
}
