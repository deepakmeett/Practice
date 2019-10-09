package com.example.practice.Oop.sper;

public class Sper_oe  {
    
    int i = 10;
    
    public static void main(String[]args){
        B b = new B();
        b.sow( 30 );
    }
}


class B extends Sper_oe{
    
    int i = 20;
    void sow(int i){
        
        
        System.out.println( i );
        System.out.println( this.i );
        System.out.println( super.i );
    }
}
