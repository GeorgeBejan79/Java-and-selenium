package test.java.java_class.Maps;
import java.util.*;
public class HashTable {
    public static void main(String[] args) {
        Hashtable <Integer, String> classNames=new Hashtable<>();
        classNames.put(201, "Computer");
        classNames.put(202, "Math");
        classNames.put(203, "Science");
        classNames.put(204, "Test");

        Set<Map.Entry<Integer, String>> classes = classNames.entrySet();
        for (Map.Entry<Integer, String> class1:classes
             ) {
            System.out.println(class1.getValue()); // this one prints the values Computer samd
            System.out.println(class1.getKey()); // this one prints the keys 204 samd
        }
    }
}
