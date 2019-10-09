package com.example.practice.Oop;

public class Overloadig {
    
    void start(int a){
        System.out.println( "3" );
    }
    
    void start(){
    System.out.println( "4" );
    }
    
    public static void main(String [] args){
        Overloadig overloadig = new Overloadig();
        overloadig.start( 2 );
        overloadig.start();


    }
}
