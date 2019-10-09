package com.company.practice.Others.Done;

import java.util.Scanner;

public class Donno {

    public static void main(String[] args) {
       int n, temp, count,check;
       double sum=0;
       count = 0;
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        temp=n;
        check=n;
        while (temp>0){
            temp=temp/10;
            count++;
        }
        while (n>0){
            int p=n% 10;
            n=n /10;
            sum = sum + Math.pow(p,count);
        }
        if (sum==check){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
