package com.example.practice.Lecture_9;

public class Coding {
    public static void main(String[] args) {

        int i = 1;
        String stop = "0";
        int delay = 1000;

        while (i >= 1) {
            if (stop.equals("0")) {
                stop = "1";
                System.out.print("ON");
            } else {
                stop = "0";
                System.out.print("OFF");
            }
            try {
                Thread.sleep(delay);
            } catch (
                    InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}