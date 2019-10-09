package com.company.Others.ContestOne;

import java.util.Scanner;

public class FibonacciTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a, b, c;
        a = 0;
        b = 1;
        int i = 0;
        while (i <= n) {

            int j = 1;
            while (j <= i) {
                System.out.print(a + "\t");
                c = a + b;
                a = b;
                b = c;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
