package com.example.practice.Oop;

public class Overridig {
    
    void sow(int a){
        System.out.println( "1" );
    }
    
    public static void main(String [] args){
        Overridig overridig = new Overridig();
        overridig.sow(4);
        
        Over over = new Over();
        over.sea(3);
    }
}
class Over extends Overridig{
    
    void sea(int b ){
        System.out.println( "2" );
    }
}
