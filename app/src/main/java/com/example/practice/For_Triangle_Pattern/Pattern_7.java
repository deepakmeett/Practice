package com.example.practice.For_Triangle_Pattern;

public class Pattern_7 {
    
    public static void main(String args[]){

        for (int i = 1; i <= 5 ; i++) {

            System.out.println();
            
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
        }
        for (int k = 1; k <= 5 ; k++) {
            System.out.println();
            
            for (int l = 1; l <= (5-k) ; l++) {
                System.out.print("* ");
            }
        }
    }
}
