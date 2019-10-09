package com.example.practice.For_Triangle_Pattern;

import java.util.Scanner;

public class Pattern_5 {
    
    public static void main (String args[]){
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <= x ; i++) {
            System.out.println();
            
            for (int j = 1; j <= (x+1)-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
        }
    }
}
