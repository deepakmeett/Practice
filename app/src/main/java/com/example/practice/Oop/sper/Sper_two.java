package com.example.practice.Oop.sper;

public class Sper_two extends C {

    public static void main(String[] args) {
        Sper_two sper_two = new Sper_two();
        sper_two.soe();
    }

    void soe() {
        sow();
        super.sow();
    }

    void sow() {
        System.out.println( "sow pper" );
    }
}

class C {

    void sow() {
        System.out.println( "sow" );
    }
}
