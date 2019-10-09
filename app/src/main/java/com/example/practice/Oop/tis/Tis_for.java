package com.example.practice.Oop.tis;

public class Tis_for {
    
    public static void main(String[]args){
        Tis_for tis_two = new Tis_for();
        tis_two.fest();
        
    }
    
    void fest(){
    pest(this);
    }
    
    
    void pest(Tis_for tis_for){
        System.out.println( "pest" );
    }
}
