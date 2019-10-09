package com.company.Others.PendingCode;

public class OctToBin {
    public static void main(String[] args) {
        int oct = 33;

        int bin = 0;
        int p = 1;

        while (oct > 0) {
            int r = oct % 2;
            oct = oct / 2;

            bin = bin + (r * p);
            p = p * 10;
        }
        System.out.println(bin);
    }
}
