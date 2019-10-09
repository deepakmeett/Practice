package com.company.Lecture_9;

import java.util.ArrayList;

public class Board {
    public static void main(String[] args) {
        board("", 4, 3);

    }
    public static void board(String processed, int target, int face){
        if (target == 0){
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= face && i<=target; i++) {
            board(processed+i,target-i, face);

        }
    }
    public static void boardList(String processed, int target, int face, ArrayList a) {
        if (target == 0) {
            System.out.println(processed);


            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            boardList(processed + i, target - i, face, a);
        }
    }
}
