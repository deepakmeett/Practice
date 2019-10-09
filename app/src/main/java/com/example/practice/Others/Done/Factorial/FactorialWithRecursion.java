package com.company.Others.Done.Factorial;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        int num = 5;
        int answer = 1;

        answer = fact(num);

        System.out.println(answer);
    }

    static int fact(int a) {

        if (a <= 1) {
            return 1;
        } else {
            return a * fact(a - 1);
        }
    }
}
