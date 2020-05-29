package com.example.practice.Array;
public class Missing_Number {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int expl = a.length + 1;
        int totall = expl * (expl + 1) / 2;
        System.out.println( totall );
        
        int sum = 0;
        for (int i = 0; i <a.length; i++) {
            sum = sum+a[i];
        }
        
        System.out.println( sum );
        
        System.out.println( totall-sum);
    }
}
