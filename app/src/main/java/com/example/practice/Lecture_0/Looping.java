package com.company.Lecture_0;

public class Looping {
    public static void main(String[] args) {
        int n = 5;
//        while (n-->0){
//            System.out.println("OK"+n);
//        }
        while (n > 0) {
            int k = n;
            while (k-- > 0) {
                System.out.print("* ");
            }
            n--;
            System.out.println();
        }
    }
}
