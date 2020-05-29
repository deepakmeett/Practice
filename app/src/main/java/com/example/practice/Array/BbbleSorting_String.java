package com.example.practice.Array;
public class BbbleSorting_String {
    
       // 3, 2, 1, 4
    // Bubble soring me first wale se second wale ko compare karte hai agr second wala element bda hota hai 
    // to use phle wale se swap kr dete hai. Or isme jitne element hote hai utne round chalte hai.

    public static void main(String[] args) {
        String[] a = {"Dexter", "Ellen", "Cindy"};
        String temp;
        for (int i = 0; i < a.length; i++) {   //ye forLoop no. of element ke liy hai.isme  a[2] hai.
            
            
            for (int j = 0; j < a.length - 1; j++) { //ye forLoop adjacent element ke liy hai
                
                if (a[j].compareTo( a[j + 1] ) > 0) { // is condition se swaping ho rhi hai
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < a.length; k++) { // isse no of element print ho rahe hai.
            System.out.print( a[k] + ", " );

        }
    }
}
