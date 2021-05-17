package test.java.java_class.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapEntryPractice {
    public static void main(String[] args) {
        /*Map<String,Integer> groceryMap= new LinkedHashMap<>();
        groceryMap.put("Milk", 1);
        groceryMap.put("Bread", 2);
        groceryMap.put("Coffe", 3);
        groceryMap.put("Eggs", 4);

        for (Map.Entry<String,Integer>entry:groceryMap.entrySet()){
            if(entry.getKey().contains("Eggs")){
                entry.setValue(2);
            }
        }
       // System.out.println(groceryMap.keySet());
        for(String key: groceryMap.keySet()){
            System.out.println(key + " " + groceryMap.get(key));
        }

         */
       // Map<String, Integer> shoppingList =new LinkedHashMap<>();  //it order its elements in insertion order
       //Map<String, Integer> shoppingList=new TreeMap<>(); //orders its elements based on their key values
        Map<String, Integer>shoppingList= new HashMap<>();//doesn't maintain insertion order
            shoppingList.put("Microwave", 1);
            shoppingList.put("Stove", 2);
            shoppingList.put("soffa", 3);
            shoppingList.put("bookshelf", 4);

        for (String key:shoppingList.keySet()){
            System.out.println(key+" "+shoppingList.get(key));
        }
              {

        }
    }
}
