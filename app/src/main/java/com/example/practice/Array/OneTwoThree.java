package com.example.practice.Array;

public class OneTwoThree {


    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};

        for (int i = 0; i < a.length; i++) {
            System.out.print( a[i] + ", " );

        }
        System.out.println();
        System.out.println();
        for (int i : a) {
            System.out.print( i + ", " );

        }
        System.out.println();
        System.out.println();
        OneTwoThree work = new OneTwoThree();
        work.rock();
        
        Rock roar = new Rock();
        roar.brock();
    }

    int[][] a = {{1, 2, 3, 4}, {5, 8, 9}};

    public void rock() {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                System.out.print( a[i][j] + ", " );

            }
            System.out.println();

        }
        System.out.println();
    }
}

class Rock {

    public void brock() {

        int[][][] a = {{{1, 2, 3, 4, 5, 6}, {8, 9, 10, 11}, {12, 13}}};
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print( a[i][j][k] + ", " );
                }
                
                System.out.println(  );

            }
        }
    }
}
