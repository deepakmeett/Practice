package com.example.practice.For_Triangle_Pattern;

public class Pattern_2 {
    
    public static void main (String args[]){

        for (int i = 1; i <=5 ; i++) {
            System.out.println();
            for (int j = 1; j <=(5+1)-i ; j++) {
                System.out.print("*");
                
            }
        }
    }
}
