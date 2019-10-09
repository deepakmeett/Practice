package com.company.Others.ContestTwo;
import java.util.Arrays;
import java.util.Scanner;
public class StringToggleCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.next();
//        String line = "Hello";
        System.out.println(toggle(line));
    }
    public static String toggle(String line) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }
            builder.append(ch);
        }
        return builder.toString();
    }
}