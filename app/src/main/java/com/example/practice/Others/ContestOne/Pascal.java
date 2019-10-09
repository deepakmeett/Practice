package com.company.Others.ContestOne;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        pascal(num);
    }

    public static void pascal(int num) {
        int val = 1;
//        int space = num - 1;

        for (int n = 0; n < num; n++) {
//            for (int i = 0; i < space; i++) {
//                System.out.print(" ");
//            }
            for (int r = 0; r <= n; r++) {
                val = fact(n) / (fact(r) * fact(n - r));
                System.out.print(val + " ");
            }
            System.out.println();
//            space--;
        }
    }

    public static int fact(int n) {
        int acc = 1;
        for (int i = 1; i <= n; i++) {
            acc = acc * i;
        }
        return acc;
    }
}
//                System.out.print(val + " ");
//                val = val * (n - r) / (r + 1);

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int value = 0;
//        int i = 0;
//        while (i < row) {
//            int j = 0;
//            while (j <= i) {
//                value = Binomialc(i,j);
//                System.out.print(value + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//    static int Binomialc(int line, int col) {
//        if (col ==0 || line == col){
//            return 1;
//        }
//        else {
//            return(Binomialc(line-1, col-1)+Binomialc(line-1,col));
//        }
//    }