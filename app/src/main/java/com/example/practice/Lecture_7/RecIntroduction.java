package com.company.Lecture_7;

public class RecIntroduction {
    public static void main(String[] args) {
        PI(5);
    }

    public static void PD(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        PD(n - 1);
    }

    public static void PI(int n) {
        if (n == 0) {
            return;
        }
        PI(n - 1);
        System.out.print(n + " ");
    }

    public static void PDI(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        PDI(n - 1);
        System.out.print(n + " ");
    }
}