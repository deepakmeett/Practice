package com.example.practice.While_Single_Line;

import java.util.Scanner;

public class Ganesh_Chaturthi {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = 1;
        while (a <= x) {
            int b = 1;
            while (b <= x) {
                if (b == (x/2)+1 && a >= 1 ||
                        a == (x/2)+1 && b >= 1
                        ||b==1&&a<(x/2)+1||b==x&&a>(x/2)+1 
                        ||b<(x/2)+1&&a==x||a==1&&b>(x/2)+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
