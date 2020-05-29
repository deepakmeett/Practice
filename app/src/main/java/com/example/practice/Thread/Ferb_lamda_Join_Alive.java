package com.example.practice.Thread;
public class Ferb_lamda_Join_Alive {

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread( () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println( "Hi" );

                try {
                    Thread.sleep( 1000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        );

        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println( "Hello" );
                try {
                    Thread.sleep( 1000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        );
        t1.start();

        try {
            Thread.sleep( 100 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();


        t1.join();
        System.out.println( t1.isAlive() );
        t2.join();


        System.out.println( "Thread part is completed" );
    }
}
