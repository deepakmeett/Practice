package com.company.Others.Done;

import java.util.Scanner;

public class HollowDia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if
                ((j == 0 || j == n - 1 || i == 0 || i == n - 1
                         || i == 1 && j == 1
                         || i == 1 && j == n-2
                         || i == n-2 && j == 1
                         || i == n-2 && j == n-2)
                ) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}