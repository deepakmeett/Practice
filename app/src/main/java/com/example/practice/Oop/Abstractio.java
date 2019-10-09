package com.example.practice.Oop;

public abstract class Abstractio {
    
    abstract void start();

    public static void main(String []args){
        Car car = new Car();
        car.start();

        Scooter scooter = new Scooter();
        scooter.start();
    }
}

class Car extends Abstractio {
    void start(){
        System.out.println( "Car" );
    }
}

class Scooter extends Abstractio {
    void start(){
        System.out.println( "Scooter" );
    }
}