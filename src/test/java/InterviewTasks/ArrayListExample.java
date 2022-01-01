package InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {

        //******************* Array***************************
        String[] fruits = new String[3]; //exact size, contains primitives and objects
                                            //for size we use arrayname.length, can be multidimentional
        fruits[0] = "Mango";                //it use asign operators
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        //System.out.println(fruits[1]);
        System.out.println(Arrays.asList(fruits));//unsorted
        Arrays.sort(fruits);
        System.out.println(Arrays.asList(fruits));//sorted
        System.out.println(Arrays.binarySearch(fruits,"Apple"));  //return the index of apple


        String[]array = new String[3];
        array[0]="Jack";
        array[1]="Jordan";
        array[2]="Jack";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //*************ArrayList****************************************

        ArrayList fruitList = new ArrayList(); //dinamic in size, can store only objects
        fruitList.add("mango");             //to assign operators we use add
        fruitList.add("apple");
        fruitList.add("strawbery");          //maintains insertion order
        fruitList.add("watermelon");
        fruitList.remove("strawbery");
        System.out.println(fruits);
        //fruiList.clear();
        //System.out.println(fruitList.contains("Raspberry"));
        //System.out.println(fruitList);

        ArrayList names = new ArrayList();
        names.add("Daniela");
        names.add("Patrick");
//        for (int i = 0; i < names.size(); i++) {
//        System.out.println(names.get(i));
//      }
//        for (String value:names)
//             {
//                 System.out.println(value);
//        }
//
//        Iterator<String> it = names.iterator();
//        while (it.hasNext()) {
//        }
//        String name = it.next();
//        System.out.println(name);
//        int count = 0;
//        while (names.size() > count) {
//            System.out.println(names.get(count));
//            count++;
//        }
        //************************LinkedList**************************

        LinkedList linkedList=new LinkedList(); //manipulation is faster with linkedlist than arraylist
        linkedList.add("A");
        linkedList.add("Z");
        linkedList.add("P");
        System.out.println(linkedList);
        linkedList.add(3,"D");
        System.out.println(linkedList);
        linkedList.remove("A");
        System.out.println(linkedList);


    }
}
