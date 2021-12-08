package com.example.practice.Abstract;
//Here we have made a8start method and we are getting its value from other classes. We are hiding all its details
//We are just showing its main details only

abstract class Abstr { //And necessary to use "abstract" name with this class. Abstract class can have abstract method as well as concrete method

    abstract void start();//Abstract method will never have body. And necessary to use "abstract" name with this method 
}

class Car extends Abstr {//If any class extending abstract class then it will have that abstract method with body

    void start() {
    }
//    void start() {
//        System.out.print( "Car start with key" );
//    }
}

class Scooter extends Abstr {

    void start() {
        System.out.println( "Scooter start with key" );
    }

    public static void main(String[] args) {
        //We can not create an object of Abstract class. But we can create reference of that
        Car car = new Car();
        car.start();
        System.out.println();
        Scooter scooter = new Scooter();
        scooter.start();
    }

}