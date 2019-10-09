package com.example.practice.While_Single_Line;

public class patter_V {
    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
        int x = 5;
//        s.nextInt();

        int z = 1;
        while (z <= x) {
            int q = 1;
            while (q <= z) {
                System.out.print(" ");
                q++;
            }
            int a = 1;
            while (a <= (x+1)-z) {
                if (a==1|(x+1)-z==a) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                a++;
            }
            System.out.println();
            z++;
        }
    }
}
