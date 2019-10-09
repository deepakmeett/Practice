package com.company.Lecture_2;

public class InverseNumber {
    public static void main(String[] args) {

        int no = 35142;
        int result = 0;
        int position = 1;
        int v = 0;

        while (no > 0) {
            v = no % 10;
            no = no / 10;
            position = result + position*10^(v-1);
            position = position +1;
        }
        System.out.println(position);
    }
}
