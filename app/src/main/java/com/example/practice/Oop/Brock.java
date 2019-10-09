package com.example.practice.Oop;

public class Brock {
    String color;
    int age;

    public static void main(String[] args) {
        
        Brock work = new Brock();
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