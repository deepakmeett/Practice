package com.company.Lecture_4;

public class Convertbintodec {
    public static void main(String[] args) {
        System.out.println(bin2dec(1100));

    }
    public static int bin2dec(int bin){

        int dec = 0;
        int p= 1;
        while (bin>0){
            int r= bin%10;
            bin=bin/10;
            dec=dec+r*p;

            p=p*2;

        }
        return dec;
    }

}
