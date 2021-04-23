package test.java.java_class.ArrayListPractice;
import java.util.ArrayList;
public class ArrayListIntro{
        public static void main(String[] args) {
            ArrayList<String> names= new ArrayList<>();
            names.add("David");
            names.add("Marcus");
            names.add("John");
            //ArrayList follow insertion order

            names.add(1, "Abby");
            //names.add(10,"Kushal") --> it will throw the exception
            names.add(4, "kushal");
            for (int i = 0; i < names.size(); i++) { //using for  loop
                System.out.print(names.get(i)+" ");
            }
            System.out.println("for loop");
            for(String name: names){
                System.out.print(name+" ");  //using foreach loop
            }
            System.out.println("for each");
                System.out.println(names.get(3)+"--> prints name at the third index");
            //System.out.println(names.get(10)); outbounds exception
                System.out.println(names.size()+" --> this is the size of the array");

            // create a method that will take one parameter as ArrayList<Sring>
            //print all the values from the arrayList which have length more than equals to 5
            //ArrayListIntro arr=new ArrayListIntro(); //another way to print names
            //arr.print(names);
            //print.names;
           System.out.println(names +" this prints elements inside square brackets");
    }
     public static void print(ArrayList <String> tests  ){

            for (int i = 0; i < tests.size(); i++) {

                if(tests.get(i).length()>=5);

                   // System.out.println("Bigger than or equals to 5: "+tests.get(i));// prints all the values in array
        }
    }
}
