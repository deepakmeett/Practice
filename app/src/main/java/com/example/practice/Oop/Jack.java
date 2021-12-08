package com.example.practice.Oop;
public class Jack {

    public static void main(String[] args) {
        Jack work = new Jack();
        work.ask();
        Deisel war = new Deisel();
        war.roar();

    }

    public void ask() {
        System.out.println( "Jack asks" );
    }
}

class Deisel {

    public void roar() {
        System.out.println( "Deisel lifts" );
    }

}
