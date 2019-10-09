package com.company.Others.PendingCode;
import java.util.Scanner;
public class Arrow {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int n = 7;
        n = n-3;
        int r = 1;
        int h_mirror = 0;
        while (h_mirror < 2 * n - 1) {
            int c = 0;
            while (c < n - r) {
                System.out.print("    ");
                c++;
            }
            c = r;
            while (c >= 1) {
                System.out.print(" " + c);
                c--;
            }
            c = 1;
            while (c <= r - 1) {
                System.out.print("    ");
                c++;
            }
            c = 1;
            while (c <= r) {
                if (c == 0 && r <= n / 2
                        || c == n - 1 && r >= n / 2
                        || r == 0 && c >= n / 2
                        || r == n - 1 && c <= n / 2
                        || c == n - 3 && r == 4
                        || r == 4
                        || c == n / 2
                        || r == n / 2)
                    System.out.print(c + " ");
                c++;
            }
            System.out.println();
            if (h_mirror < n - 1) {
                r++;
            } else {
                r--;
            }
            h_mirror++;
        }
    }
}