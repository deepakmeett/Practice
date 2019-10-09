package com.example.practice.Oop.stati;

public class CoterDeo {
    
     static int cot;
    
    public static void main(String [] args){
        CoterDeo coterDeo1 = new CoterDeo();
        CoterDeo coterDeo2 = new CoterDeo();
        CoterDeo coterDeo3 = new CoterDeo();
        
    }
    CoterDeo(){
        cot++;
        System.out.println( cot );
    }

}
