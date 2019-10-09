package com.company.Others.ContestOne;

import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = 0;
        int space = n;
        int fstSpace = 0;

        for (int i = -1; i < 2 * n; i++) {
            for (int j = 0; j <= star; j++) {
                if (i == n - 1 && j == n) {
                    continue;
                }
                System.out.print(n - j + " ");

            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = n - fstSpace; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            if (i < n - 1) {
                star += 1;
                space -= 1;
                fstSpace += 1;
            } else {
                star -= 1;
                space += 1;
                fstSpace -= 1;
            }
        }
    }
}
