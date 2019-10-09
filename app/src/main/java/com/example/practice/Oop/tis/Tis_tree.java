package com.example.practice.Oop.tis;

public class Tis_tree {
    
    public static void main(String[]args){
        Tis_tree tis_two = new Tis_tree();
    }

    Tis_tree(){
        this(10);
        System.out.println( "args" );
    }

    Tis_tree(int a){
        System.out.println( "para" );
    }
}