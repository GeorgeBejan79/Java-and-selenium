package test.java.java_class.ArrayListPractice;
import java.util.*;
public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList <Object> list = new ArrayList();
        list.add(1);
        list.add(2); // adds elements into arrayList
        list.add(3);

        for(Object item: list){
            list.add(list.get(0));
        }
        System.out.println(list); // print arrayList
    }
}
