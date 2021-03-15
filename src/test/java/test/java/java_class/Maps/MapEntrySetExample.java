package test.java.java_class.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapEntrySetExample {
    public static void main(String[] args) {
        //{Banana, 1}, {Orange, 2}, {kiwi, 5}, {Pear, 5}
       /* HashMap<String, Integer> fruits=new HashMap();
        fruits.put("Bannana",1);
        fruits.put("Orange",2);
        fruits.put("Kiwi",5);
        fruits.put("Pear",0);

            Set<String> keys = fruits.keySet();// set super class for HashSet, linkSet, TreeSet
        for (String key: keys) {
            System.out.println(key+"-"+fruits.get(key));
        }
        //Approach 2- Use. entrySet()
        /*Set<Map.Entry<String, Integer>> entries =  fruits.entrySet();
        for(Map.Entry entry :entries){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }*/
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        //Adding elements to HashMap
        hmap.put(11, "AB");
        hmap.put(2, "CD");
        hmap.put(33, "EF");
        hmap.put(9, "GH");
        hmap.put(3, "IJ");
        //int[]numbers= {11,33,44,32,43};
        //String [] fruits ={"apple", "bannna","kiwi","mango","pears"}

       for(Map.Entry me: hmap.entrySet()){
           System.out.println("key: "+me.getKey()+" Value: "+ me.getValue());
           //me.put(numbers);
       }

    }

}
