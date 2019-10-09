package com.company.Lecture_4;

public class converterDectoany {
    public static void main(String[] args) {

        System.out.println(deci2any(10,2));
    }
    public static int deci2any(int dec, int any) {

        int a = 0;
        int p = 1;
        while (dec > 0) {
            int r = dec % any;
            dec = dec / any;
            a = a + r * p;
            p = p * 10;
        }
        return a;
    }

}

