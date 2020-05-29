package com.example.practice.Thread;
class Counter {
    int count;
    synchronized void increment() {
        count++;
    }
    
    //Synchronized: If we use are using two thread on same methods then it may happen that we would get improper result to prevent this we use Synchronized keyword in java
}

public class Ferb_Sync {

    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        
        Thread thread1 = new Thread( new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        } );
        Thread thread2 = new Thread( new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        } );
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println( counter.count );
    }
}
