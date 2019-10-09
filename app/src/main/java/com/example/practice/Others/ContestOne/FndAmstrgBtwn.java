package com.company.Others.ContestOne;

import java.util.Scanner;

public class FndAmstrgBtwn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();

        armRange(N1, N2);
    }

    public static boolean arm(int n) {
        int sum = 0;
        int number = n;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == number)
            return true;
        return false;
    }

    public static void armRange(int n1, int n2) {
        for (int i = n1; i < n2; i++) {
            if (arm(i))
                System.out.println(i);
        }
    }
}