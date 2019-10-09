package com.example.practice.Array;

public class BbbleSorting {

    public static void main(String[] args) {
        int[] a = {4, 3, 45, 34, 43, 3, 5, 9};

        int tep;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {
                    tep = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tep;
                }

            }

        }
        for (int k = 0; k < a.length; k++) {
            System.out.print( a[k] + ", " );

        }
    }
}
