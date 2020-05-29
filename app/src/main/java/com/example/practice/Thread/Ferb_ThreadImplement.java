package com.example.practice.Thread;

class C implements Runnable{
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

class D implements Runnable{
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

public class Ferb_ThreadImplement{
    public static void main(String[] args) {
        C c = new C();
        D d = new D();

        Thread thread_c = new Thread( c );
        Thread thread_d = new Thread( d );

        thread_c.start();
        try {
            Thread.sleep( 100 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread_d.start();
        
    }
}

// It may print "Hi" and "Hello" with random order. Because sometimes both "Hi" and "Hello" reach to the CPU for execution then it chooses randomly anyone

// We can solve it by adding another one Thread.sleep( 100 ); in between these two a.start() and b.start().