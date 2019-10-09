package com.company.Lecture_4;

public class Converter {
    public static void main(String[] args) {

        System.out.println(deci2bin(10));
    }

    public static int deci2bin(int dec) {

        int bin = 0;
        int p = 1;
        while (dec > 0) {
            int r = dec % 2;
            dec = dec / 2;
            bin = bin + (r * p);

            p = p * 10;
        }
        return bin;
    }

}

