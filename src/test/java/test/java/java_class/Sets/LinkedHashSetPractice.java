package test.java.java_class.Sets;
import java.util.*;
public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet();
        HashSet<String> set = new HashSet<>();
        set.add("Banana");
        set.add("Grapefruit"); // adds elements to the sets
        set.add("Mango");
        set.add("Kiwi");
        set.add(null);
            System.out.println(set+" no order");

        linkedSet.add("Banana");
        linkedSet.add("Grapefruit");
        linkedSet.add("Mango");  //// adds elements to the linkedSets
        linkedSet.add("Kiwi");
        linkedSet.add(null);
            System.out.println(linkedSet+" maintain the insertion order");

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Grapefruit");
        treeSet.add("Mango");  //// adds elements to the treeSets
        treeSet.add("Kiwi");
        treeSet.add("Apple");
        treeSet.add("Strawberry");
        //treeSet.add(null);  -->treeSet doesn't allow null values

            System.out.println(treeSet);
            System.out.println(treeSet.descendingSet());
    }
}
