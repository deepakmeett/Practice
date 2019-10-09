package com.company.Others.Done;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        int r, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines");
        n = sc.nextInt();
        r = n;
        while (r >= 1) {
            c = r;
            while (c <= n) {
                System.out.print(c);
                c++;
            }
            System.out.println("");
            r--;
        }
    }
}
//            5
//           45
//          345
//         2345
//        12345