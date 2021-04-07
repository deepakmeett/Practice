package com.example.practice.interview;
public class reverseAnArray {

    public static void main(String[] args) {
        
        int[] integerArray = {4, 5, 1, 2};
        
        for (int i = 0; i < integerArray.length; i++) {
            int index = (integerArray.length-1)-i;
            System.out.print(integerArray[index]+", ");
        }
    }
}
