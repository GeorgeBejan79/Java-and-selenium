package test.java.java_class.Mentoring;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapEntryPractice
{
    public static void main(String[] args)
    {

        Map<String, Integer> groceryMap = new LinkedHashMap<>();
        groceryMap.put("Milk", 1);
        groceryMap.put("Bread", 2);
        groceryMap.put("Ice Cream", 10);
        groceryMap.put("Cookie", 5);
        groceryMap.put("Tea", 3);

        for (Map.Entry<String, Integer> entry : groceryMap.entrySet()) {
            if (entry.getKey().contains("Tea")) {
                entry.setValue(2);
                 System.out.println(groceryMap);

                for (String key : groceryMap.keySet()) {
                    if (key.contains("Cookie")) {
                        groceryMap.replace(key, 3);
                    }
                }
                System.out.println(groceryMap);
                {
                }
            }
        }
    }
}
