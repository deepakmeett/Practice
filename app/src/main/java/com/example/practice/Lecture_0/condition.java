package com.company.Lecture_0;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        String str = s.next();

//        if(a>7){
//            System.out.println("say hello"+a+a);
//        }
        switch (str){
            case "a":
                System.out.println("Sunday");
                break;
            case "b":
                System.out.println("monday");
                default:
                    System.out.println("nothing");
        }
    }
}
