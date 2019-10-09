package com.company.Others.ContestOne;

import java.util.Scanner;

public class LoopNoOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int count = 0;
        int row =  1;
        while (row <= n) {

            int col = 1;
            while (col <= row) {
                count = count + 1;
                System.out.print(count + "  ");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
