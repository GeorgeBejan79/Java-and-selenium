package test.java.java_class.Sets;
import java.util.ArrayList;
import java.util.*;
public class HasSetPractice {
    public static void main(String[] args) {
        ArrayList list =new ArrayList(); //given arrayList

        HashSet set =new HashSet();// we are creating a new HashSet with Objects

        HashSet<String> setOfStrings= new HashSet<>();   // the array will restricted to use only strings <String>
        Set set2 =new HashSet();

        HashSet set3 =new HashSet(list);

        setOfStrings.add("Banana");
        setOfStrings.add("Pear");
        setOfStrings.add("Strawberry");

            System.out.println(setOfStrings);
            setOfStrings.add("Bannana");
            System.out.println(setOfStrings);

        if(setOfStrings.contains("Raspberry")){
            System.out.println("the set contains Raspberry");
        }
        else
            System.out.println("the set doesn't contain Raspberry");
        setOfStrings.remove("Bannana");

            System.out.println("Bannana is removed: "+setOfStrings);

            System.out.println("The size of the set- "+setOfStrings.size());
        list.add("Banana");
        list.add("Strawberry");
        list.add("Raspberry");
        list.add("Blueberry");
        list.add("Blackberry");
        list.add("Banana");
            System.out.println("This is our ArrayList: "+list);

        HashSet<String> set4 =new HashSet(list);// converting the ArrayList to Hashset

            System.out.println("This is or HashSet "+set4);

        if(set4.add("Blackberry")){
            System.out.println("there is not such a value in set, I am adding it");}
        else{
            System.out.println("There is already such  value in set, I am not adding it");
        }
        //for loop is not applicable for Sets
        //since we don't have .ge() method
        Iterator iterator =set4.iterator(); // you can use foreah loop instead
        while(iterator.hasNext()){

            String currentElementInTheSet=(String)iterator.next();
            //we are using casting for next(), because it returns Object type

            System.out.print(currentElementInTheSet+" ");
            //System.out.println(iterator.next()); you can use this one as well
        }
    }
}
