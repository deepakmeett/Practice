package com.example.practice.Array;
public class Missing {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 6, 7, 8, 10};
        for (int i = 1; i < list.length - 1; i++) {
            int j = list[i];
            int k = list[i + 1];
            int l = k - j;
            if (l != 1) {
                System.out.println( list[i] + 1 );
            }
        }

    }
}
