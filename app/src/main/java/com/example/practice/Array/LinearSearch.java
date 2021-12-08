package com.example.practice.Array;
public class LinearSearch {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30};
        int key = 20;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                System.out.println(i);
            }
        }
        
    }
}
