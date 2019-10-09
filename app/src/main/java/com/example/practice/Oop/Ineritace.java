package com.example.practice.Oop;

public class Ineritace {

    void sowA() {

        System.out.println( "Tis is i sowA etod" );
    }

    public static void main(String[] args) {

        Ineritace ineritace = new Ineritace();
        ineritace.sowA();
//        ineritace.sowB();

        System.out.println( "------------------" );

        B b1 = new B();
        b1.sowA();
        b1.sowB();
//        b1.sowC();

        System.out.println( "------------------" );
        
        C c1 = new C();
        c1.sowA();
        c1.sowB();
        c1.sowC();
    }
}

class B extends Ineritace {

    void sowB() {
        System.out.println( "Tis is i sowB etod" );
    }

}

class C extends B {

    void sowC() {
        System.out.println( "Tis is i sowB etod" );
    }
}