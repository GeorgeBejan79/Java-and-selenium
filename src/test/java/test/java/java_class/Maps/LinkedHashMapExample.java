package test.java.java_class.Maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap();// follow the insertion order
        HashMap<String, Integer> map1=new HashMap<>(); // put them randomly
        TreeMap<String, Integer> map2=new TreeMap<>();  //sets them in alphabetical order

        map.put("Banana",1);
        map.put("Apple",4);
        map.put("Orange",5);
        map.put("Kiwi",1);
        map.put("Grapefruit",1);
        map.put("Tangerine",1);

        map1.put("Banana",1);
        map1.put("Apple",4);
        map1.put("Orange",5);
        map1.put("Kiwi",1);
        map1.put("Grapefruit",1);
        map1.put("Tangerine",1);

        map2.put("Banana",1);
        map2.put("Apple",4);
        map2.put("Orange",5);
        map2.put("Kiwi",1);
        map2.put("Grapefruit",1);
        map2.put("Tangerine",1);
// how many null keys can HashMap and LinkedHashMap can hold?
        // what is the type of keys of each Map? What collection type Map uses for its keys?
        //      HashMap -> HashSet
        //      LinkedHashMap -> LinkedHashSet
        //      TreeMap -> TreeSet
        // Sets can hold only unique elements, null value will only be once

        System.out.println(map); // adds the in order that they were inserted
        System.out.println(map1);// adds the in random order inserted
        System.out.println(map2);// adds the in alphabetical order that they were inserted

    }
}
