package InterviewTasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementsArray {
    public static void main(String[] args) {
        String [] tools={"Java", "Selenium", "Cucumber", "Api", "Java", "Selenium"};
        System.out.println("*****************brute force************************");
        for (int i = 0; i < tools.length ; i++) {
            for (int j = i+1; j < tools.length; j++) {
                if (tools[i].equals(tools[j])) {
                    System.out.println(tools[i]);
                }
            }
        }
        System.out.println("***********hashSet********************");
        Set<String>data= new HashSet<String>();
        for (String e:tools) {
            if(data.add(e)==false){
                System.out.println(e);
            }
        }
        System.out.println("***********hashMap********************");
        Map<String, Integer>infraMap=new HashMap<String, Integer>();
        for (String e:tools) {
            Integer count=infraMap.get(e);
            if (count==null){
                infraMap.put(e,1);
            }else{
                infraMap.put(e,++count);
            }
        }
        Set<Map.Entry<String, Integer>>entrySet=infraMap.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

    }
}
