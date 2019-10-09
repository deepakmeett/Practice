package com.company.Lecture_1;

public class LoopFive {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        while (row <= n) {

            int col = 1;
            while (col <= (n - row)) {
                System.out.print("*");
                col = col + 1;
            }
            col = 1;
            while (col <= (row)) {
                System.out.print("-");
                col = col + 1;
            }
                col = 1;
                while (col <= (row-1)) {
                    System.out.print("-");
                    col = col + 1;
            }
            col = 1;
            while (col <= (n - (row))) {
                System.out.print("*");
                col = col + 1;
            }
            row =row+1;
            System.out.println();
        }
    }
}



//        int n = 4;
//
//        int row = 1;
//        while (row <= n){
//
//            int col = 1;
//            while (col <= (n-row)){
//
//                System.out.print(" ");
//                col = col + 1;
//            }
//            col = 1;
//            while (col <= row){
//
//                System.out.print(" *");
//                col = col + 1;
//            }
//            System.out.println();
//            row = row + 1;
//        }
//    }
//}

