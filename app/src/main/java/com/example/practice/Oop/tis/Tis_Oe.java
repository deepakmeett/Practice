package com.example.practice.Oop.tis;

public class Tis_Oe {
    
    public static void main(String[]atgs){
        
        Tis_Oe tis_oe = new Tis_Oe();
        tis_oe.test(2);
        tis_oe.sow( );
        
    }
    
    int i;
    void test(int i){
        this.i= i;
    }
    
    void sow( ){
        System.out.println( i );

    }
}
