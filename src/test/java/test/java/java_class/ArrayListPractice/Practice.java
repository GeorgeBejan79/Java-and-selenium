package test.java.java_class.ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {
    public static void main(String[] args) {
        ArrayList names =new ArrayList();
        names.add("Althea");
        names.add("Sophia");
        names.add("Alexandra");

        /*for(Object ArrayList: names){
            System.out.println(ArrayList);
        }*/
        Iterator<String> it= names.iterator();
        while(it.hasNext()){
            String name=it.next();
            System.out.println(name);
        }
    }
}
