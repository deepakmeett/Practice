package com.company.Lecture_1;

public class LoopThree {

    public static void main(String[] args) {

        int n = 3;                                                    //****
                                                                      //***
        int row = 1;                                                  //**
        while (row <= n){                                             //*
                                                                      //**
            int col = 1;                                              //***
            while (col <= (n-row)+1){                                 //****

                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }

        row = 2;
        while (row <= n){

            int col = 1;
            while (col <= row){

                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
