package test.java.java_class.Maps;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("Serhan", "312 111 2222");
        map.put("Mehmet", "312 111 1111");
        map.put("Kushal", "312 343 555");
        map.put("Prianka", "312 345 4444");
        map.put("Sandeep", "312 467 3333");
        map.put("Serhan", "888 805 3456");
        map.put(null, "000 000 0000");
        map.put("Michael", null);
        map.put(null, "111 111 1111");
        System.out.println(map + " map");

        map.remove("Sandeep");
        System.out.println(map.get("Sandeep"));
        System.out.println(map);
        System.out.println(map.get("Sandeep"));
        System.out.println(map.values());
        Set<String> keySet = map.keySet();
        System.out.println(keySet + "  keyset ");// prints only the keys--> names from the strings without
        // numbers
        map.replace("Kushal", "323 777 0000");
        System.out.println(map);

        /*map.containsKey("Sandeep");
        map.containsValue("000 000 0000");
            System.out.println(map.put("Raj", "11 11 11"));
            System.out.println(map.put("Raj", "00 11 11")); */

        //map.size();
        //map.clear();
        //map.isEmpty();

        //Solve the problem of finding unique elements inside of Array
        String[] arrayOfString = {"Banana", "Grapefruit", "Apple", "Strawberry", "Raspberry", "Blueberry", "Blackberry", "Apple", "Pear", "Banana", "Grapefruit", "Apple", "Pear", "Grapefruit"};
        //2. Count the items inside of the fruits array and give the number of each
        //Banana 2, Apple 3    --> use .map.put*/
        HashSet<String> set = new HashSet(Arrays.asList(arrayOfString));
        System.out.println(set);

        HashMap<String, String> map1 = new HashMap();
        map1.put("Banana", "1");
        map1.put("Grapefruit", "2");
        map1.put("Apple", "3");
        map1.put("Strawberry", "4");
        map1.put("Raspberry", "5");
        map1.put("Blueberry", "6");
        map1.put("Blackberry", "7");
        System.out.println(map1 + " map1");

        HashMap<Integer, String> days =new HashMap<Integer, String>();
        days.put(1,"Monday");
        days.put(2,"Tuesday");
        days.put(3,"Wendsday");
        days.put(4,"Thursday");
        for (Map.Entry obj: days.entrySet()) {
            System.out.println(obj.getKey()+" "+obj.getValue());

            //737 204 4571
               // paulandrew9966@gmail.com
        }

    }
}
