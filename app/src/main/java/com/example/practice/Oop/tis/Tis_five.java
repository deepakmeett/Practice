package com.example.practice.Oop.tis;

public class Tis_five {

    public static void main(String[] args) {
        Tis_five tis_five = new Tis_five();
        tis_five.pest();
    }

    void fest(Tis_five tis_five) {
        Deos deos = new Deos( this );
        System.out.println( "pest" );
    }
    
    void pest() {
        fest( this );
    }
}

class Deos {
    Deos(Tis_five tis_five) {
        System.out.println( "DEOS" );
    }
}