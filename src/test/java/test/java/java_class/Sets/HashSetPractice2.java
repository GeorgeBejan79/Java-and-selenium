
package test.java.java_class.Sets;

import java.util.*;

public class HashSetPractice2 {
    public static void main(String[] args) {
        String[] arrayOfString = {"Banana", "Grapefruit", "Apple", "Strawberry", "Raspberry", "Blueberry", "Blackberry", "Apple", "Pear", "Banana", "Grapefruit"};
        // find me only the unique elements
        //Array --> arrayList--> HashSet
        // check if the array -> HashSet convertible
        // add one by one each element of array to hashset
        // first approch[xxzxzx]
        HashSet<String> set = new HashSet(Arrays.asList(arrayOfString));
        System.out.println(set);

        // set.add(Object) -> true/false. If the values exists it returns false.
        HashSet<String> set2 = new HashSet<>();
        HashSet<String> set3 = new HashSet<>();
        for (String item : arrayOfString) { // for loop implementation
            if (!set2.add(item)) {
                set3.add(item);
            }
        }
        // using for loop instead of for-each
        // for(int i = 0; i < arrayOfString.length; i++){
        //      if(!set2.add(arrayOfString[i])){
        //          set3.add(arrayOfString[i]);
        //      }
        // }
        System.out.println(set3);

    }
}