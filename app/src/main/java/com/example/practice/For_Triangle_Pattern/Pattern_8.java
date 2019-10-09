package com.example.practice.For_Triangle_Pattern;

public class Pattern_8 {
    
    public static void main(String args[]){

        for (int i = 1; i <= 5 ; i++) {
            System.out.println();
            
            for (int j = 1; j <= (5-i) ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
        }
        for (int l = 1; l <= 5 ; l++) {
            System.out.println();
            
            for (int o = 1; o <= l ; o++) {
                System.out.print("  ");
            }
            for (int p = 1; p <= (5-l) ; p++) {
                System.out.print("* ");
            }
        }
    }
}
