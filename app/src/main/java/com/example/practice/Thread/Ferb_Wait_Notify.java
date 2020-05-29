package com.example.practice.Thread;
class Q {

    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println( "Put: " + num );
        this.num = num;
        valueSet = true;
        notify();

    }

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println( "Get: " + num );
        valueSet = false;
        notify();

    }
}

class Producer implements Runnable {

    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread thread = new Thread( this, "Producer" );
        thread.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put( i++ );
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread thread = new Thread( this, "Consumer" );
        thread.start();
    }

    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ferb_Wait_Notify {

    public static void main(String[] args) {
        Q q = new Q();
        new Producer( q );
        new Consumer( q );
    }

}
