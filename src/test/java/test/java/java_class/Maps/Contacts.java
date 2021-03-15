package test.java.java_class.Maps;
import java.util.*;
public class Contacts {
    public static void main(String[] args) {
        Map<String, String> contacts =new HashMap();
        contacts.put("Adam","2233455456");
        contacts.put("Olivia","2234655456");
        contacts.put("David","22342456");
        contacts.put("Mark","223389769");
        System.out.println(contacts.containsKey("Olivia"));
        System.out.println(contacts.containsValue("22342456"));
        printValues(contacts);
        printKeys(contacts);
        //keySet() method return keys from the map in Set format--> interview question


            // TASK-1: Create one method will take the one map which has data type of String, String
            // and this method will print all the key from map.
            // TASK-2:  Create one method will take the one map which has data type of String, String
            // and this method will print all the values from map
    Collection<String> phones=contacts.values();
        for (String phone: phones) {
            System.out.println(phone);
        }
            }

    public static void printKeys(Map<String, String> map){

        Set<String> keys = map.keySet();
        for (String key:keys) {
            System.out.println(key);
        }
    }
public static void printValues(Map<String, String> map){
        Set<String>keys=map.keySet();
    for (String key:keys
         ) {
        System.out.println(map.get(key));
        }
    }

}
