package com.example.practice.Oop;

public class BrockLessnor {
    String color;
    int age;

    public static void main(String[] args) {
        
        BrockLessnor work = new BrockLessnor();
        work.rock( "fair", 50 );
        work.rack();

    }

    public void rock(String c, int a) {
        color = c;
        age = a;
    }

    public void rack() {
        System.out.println( "Brock's color and age = " + color + ", " + age );
    }
}