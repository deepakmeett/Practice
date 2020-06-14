package com.example.practice.LinkedList;
import java.util.LinkedList;
public class InkedList {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

        //Adding element to the linked list
        
        linkedList.addLast( "L" );
        linkedList.add( "A" );
        linkedList.add( "B" );
        linkedList.add( "E" );
        linkedList.add( "F" );
        linkedList.add( 4, "G" );
        linkedList.addFirst( "D" );
        System.out.println( linkedList);

        //Removing element to the linked list
        linkedList.remove(3);
        linkedList.remove("B");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println( linkedList );
        
        //Finding element in the linked list  
        boolean ifPresent = linkedList.contains( "E" );
        if (ifPresent){
            System.out.println( "'E'+Yes" );
        }else {
            System.out.println( "'E'+No" );
        }
        System.out.println( ifPresent );

        // Number of elements in the linked list
        int size = linkedList.size();
        System.out.println( size );

        // Get and set elements from linked list
        System.out.println( "Now we have this is linkedList " + linkedList );
        Object element = linkedList.get( 1 );
        System.out.println("get " + element );
        linkedList.set( 2, "T" );
        System.out.println( linkedList );
    }
}