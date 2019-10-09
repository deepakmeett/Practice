package com.company.Others.ContestOne;

import java.util.Scanner;

public class LoweUpper {
    public static void main(String[] args) {
        char ch;
        Scanner s = new Scanner(System.in);
        ch = s.next().charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.println("Capital Letter");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("Small Letter");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Invalid");
        }
    }
}
