package com.company.Others.ContestOne;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print("2");
        int no = 3;
        int temp = 0;
        while (no <= n) {
            int i = 2;

            while (i < no - 1) {
                if (no % i == 0) {
                    temp++;
                }
                i++;
            }
            if (temp == 0) {
                System.out.print(", "+no);
            } else {
                temp=0;
            }
            no++;
        }
    }
}
