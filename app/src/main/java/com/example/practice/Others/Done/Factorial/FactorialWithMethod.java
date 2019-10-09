package com.company.Others.Done.Factorial;

public class FactorialWithMethod {
    public static void main(String[] args) {
        int num = 5;
        int answer = 1;

        answer = fact(num);

        System.out.println(answer);
    }
    static int fact(int a){
        int b = 1;
        int i = 1;
        while (i <= a){
            b = b*i;
            i++;
        }
        return b;
    }
}
