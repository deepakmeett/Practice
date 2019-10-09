package com.company.Others.ContestOne;

public class Count5 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n=s.nextInt();
        int n = 3;

        int count = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;

            if (r == 3) {
                count++;
            }
        }
        System.out.println(count);
    }
}
