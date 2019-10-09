package com.company.Others.ContestOne;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bin = s.nextInt();
        int dec = 0;
        int place = 1;
        int r = 0;

        while (bin > 0) {
            r = bin % 10;
            bin = bin / 10;
            dec = dec + r * place;
            place = place * 2;
        }
        System.out.println(dec);
    }
}
