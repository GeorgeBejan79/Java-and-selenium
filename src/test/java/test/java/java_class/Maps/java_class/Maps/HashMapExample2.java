package test.java.java_class.Maps;
import java.util.*;
public class HashMapExample2 {
    public static void main(String[] args) {
        String[] arrayOfString = {"Banana", "Grapefruit", "Apple", "Strawberry", "Raspberry", "Blueberry", "Blackberry", "Apple", "Pear", "Banana", "Grapefruit", "Apple", "Pear", "Grapefruit"};
        HashMap<String, Integer> map = new HashMap();

        for (int i = 0; i < arrayOfString.length; i++) { // goes trow the array
            if (!map.containsKey(arrayOfString)) //if the array doesn't contain it added
                map.put(arrayOfString[i],1);

            else {   //if is already in the  arrays goes to else condition
                //
                Integer currentAmount = map.get(arrayOfString[i]); // variable created updates how
                map.put(arrayOfString[i], currentAmount+1);        // many times a fruit is found

            }

        }
        System.out.println(map);
    }
}