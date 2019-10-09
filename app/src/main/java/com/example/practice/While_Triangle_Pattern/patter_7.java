package com.example.practice.While_Triangle_Pattern;

public class patter_7 {
    public static void main(String args[]) {
    
        int i = 1;
        
        while (i <= 5){
            int k = 1;
            while (k <= i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        int l = 1;
        while (l <= 4){
            int o = 1;
            while (o <= (4+1)-l){
                System.out.print("* ");
                o++;
            }
            System.out.println();
            l++;
        }
    
    }
}