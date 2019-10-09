package com.company.Lecture_4;

import java.util.Scanner;

public class FnExample {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        {
            System.out.println(a);
            swap(4,5);
            
        }
    }
    public static void swap(int x, int b) {
        int t = x;
        x = b;
        b = t;
        
        System.out.print(x+b);
    }
    public static void converter(int s, int e, int step) {
        while (s <= e) {
            float c = (5f / 9) * (s - 32);
            System.out.println(c);
            s += step;
        }
    }
}
