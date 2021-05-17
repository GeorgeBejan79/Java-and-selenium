package test.java.java_class.Maps;
import java.util.HashMap;
import java.util.Map;

public class HashTablevsHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> days=new HashMap<Integer,String>();
        //HashTable<Integer,String> days= new Hashtable<Integer, String>();
        days.put(1,"Monday");
        days.put(2,"Tuesday");
        days.put(null,"Wendsday");// allowed only one null key
        days.put(null,"Thurday");
        for (Map.Entry<Integer, String> obj: days.entrySet())
              {
                  System.out.println(obj.getKey() +" "+obj.getValue());
        }
    }
}
