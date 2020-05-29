package com.example.practice.Array;
public class Selection_Sorting_String {
    
    //38, 52, 9, 18, 6, 62, 13
    //Selection sort me first wale element(38) se pure list me check karte hai ki kon sa sabse chota element hai
    // or fir direct usse uski replacement kra dete hai
    //like this 6, 52, 9, 18, 38, 62, 13
    // Or fir second wale se pure list me check karte hai ki kon sa sabse chota element hai or fir direct usse 
    // uski replacement kra dete hai
    //like this 6, 9, 52, 18, 38, 62, 13
    //ese karte karte end puri list swaped milti hai 6, 9, 13, 18, 38, 52, 62
    
    public static void main(String[] args) {
        
        
        String a [] = {"Dexter", "Cindy", "Ellen"};
        
        int min;
        String temp = "";
        for (int i = 0; i <a.length ; i++) {  //ye forLoop no. of element ke liy hai.isme  a[3] hai.
            min = i;
            for (int j = i+1; j <a.length ; j++) {// yha pe j ki value i+1 li quki ye first wale element ko chod
                //kr age pure list me check kre
                
                if (a[i].compareTo(a[j])>0){
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }
        for (int k = 0; k <a.length ; k++) {// isse no of element print ho rahe hai.
            System.out.print(a[k]+ ", "  );
            
        }
    }
}
























