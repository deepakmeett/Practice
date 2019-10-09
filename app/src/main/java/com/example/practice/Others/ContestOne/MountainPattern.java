package com.company.Others.ContestOne;

import java.util.Scanner;

public class MountainPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = 1;
        int space = 2 * n - 3;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = star; j >= 1; j--) {
                if (i == n - 1 && j == n) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
            star++;
            space -= 2;
        }
    }
}