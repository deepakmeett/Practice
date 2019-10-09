package com.company.Lecture_1;

public class LoopTwo {

    public static void main(String[] args) {
        int n = 4;

        int row = 1;
        while(row <= n){

            int col = 1;
            while (col <= (n-row)+1){

                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
