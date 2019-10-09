package com.company.Others.PendingCode;
import java.util.Scanner;
public class PTwo {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int num = s.nextInt();
        int num = 9;
        int n = num / 2 + 1;
        int star = 1;
        int space = 1;
        int fstSpace = n+1;

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 1; j <= fstSpace; j++) {
                System.out.print("    ");
            }
            for (int j = star; j >= 1; j--) {
                System.out.print(j + " ");

            }
            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                if (i == 0 && j == 1) {
                    continue;
                } else if (i == n+star+space && j == 1) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
            if (i < n - 1) {
                star += 1;
                space += 2;
                fstSpace -= 1;
            } else {
                star -= 1;
                space -= 2;
                fstSpace += 1;

            }
        }
    }
}

//            System.out.println();
//            star-=1;
//            space -= 2;
//            fstSpace+=2;