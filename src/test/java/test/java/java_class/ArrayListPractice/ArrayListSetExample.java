package test.java.java_class.ArrayListPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSetExample {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("David");
        names.add("Marcus");
        names.add("John");
        names.add("Beth");
        names.add("Julia");
        names.add("Rachel");
        System.out.println(names+" <-- this one prints names in arrayList");
        // I want to replace Beth with Jennifer
        String originValue = names.set(names.indexOf("Beth"), "Jennifer");
        System.out.println("This names is out of the list - " + originValue);
        System.out.println("Changed names after using set method:");
        System.out.println(names);
        Object[] namesArray = names.toArray();     // converts our list to the array
        String[] convertedArray;
        String[] lastNamesArray = {"John", "Abba"};
        List<String> list = Arrays.asList(lastNamesArray);     // converts Array to the List
        System.out.println(list+" this is a list");
    }
}
