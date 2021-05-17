package test.java.java_class.ArrayListPractice;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        System.out.println(linkedList+" that is the linkedList");

        System.out.println( linkedList.add("Two")+" this adds string two" );

        System.out.println("LinkedList contains: " + linkedList);
        linkedList.add(1, "Eleven");

        System.out.println("LinkedList contains: " + linkedList);
        linkedList.remove("A");
        System.out.println("LinkedList contains: "+linkedList);
        linkedList.add(1,"Z");
        System.out.println("LinkedList contains: "+linkedList);
    }
//
//    private void add(String a) {
//    }
}

