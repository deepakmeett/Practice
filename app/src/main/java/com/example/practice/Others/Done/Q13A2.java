package com.company.Others.Done;
import java.util.Scanner;

public class Q13A2 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
        int n = 3;
        int r = 0;
        int h_mirror = 0;
        while (h_mirror <n+1 ) {
            // type spaces
            int c = 0;
            while (c < n - r) {
                System.out.print("   ");
                c++;
            }
            c = 0;
            int v_mirror = 0;
            while (v_mirror < 2 * r + 1) {
                System.out.print(r + 1 + c + "  ");

                if (v_mirror < r) {
                    c++;
                } else {
                    c--;
                }
                v_mirror++;
            }
            System.out.println();
            if (h_mirror < n) {
                r++;
            } else {
                r--;
            }
            h_mirror++;
        }
    }
}
