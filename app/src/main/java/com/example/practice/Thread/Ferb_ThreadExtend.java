package com.example.practice.Thread;

class A extends Thread{
    public void run(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println( "Hi" );
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println( "Hello" );
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Ferb_ThreadExtend {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        a.start();
        b.start();
    }
}

// It may print "Hi" and "Hello" with random order. Because sometimes both "Hi" and "Hello" reach to the CPU for execution then it chooses randomly anyone

// We can solve it by adding another one Thread.sleep( 100 ); in between these two a.start() and b.start().