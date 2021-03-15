package test.java.java_class.ArrayListPractice;
import java.util.*;
public class ArrayListComparison {
    public static void main(String[] args) {
        ArrayList<String> hisCars =new ArrayList<String>(Arrays.asList("Honda", "Infinity", "Toyota"));
        ArrayList<String> herCars =new ArrayList<String>(Arrays.asList("Honda", "Toyota", "Infinity"));
        //1.
        //1.1 Sort
        //1.2 Compare using equals Method
        Collections.sort(hisCars);       // sort arrays list and put them in same order
        Collections.sort(herCars);      // sort arrays list and put them in same order

            System.out.println(hisCars.equals((herCars)));
            System.out.println();
        //2.Finding additional elements
        ArrayList<String> skillSet =new ArrayList<String>(Arrays.asList("Java", "Selenium", "SQL","RestAssured"));
        ArrayList<String> requirements =new ArrayList<String>(Arrays.asList("Java", "Selenium", "SQL","RestAssured"));

            System.out.println(requirements.removeAll(skillSet)); // return true
            System.out.println(requirements);
        if(requirements.size()==0){
            System.out.println("You are hired");
        }else{
            System.out.println("You need to lean more");
        }
        // 3. Common elements
        ArrayList<String> skillSet2 =new ArrayList<String>(Arrays.asList("Java", "Selenium", "SQL","RestAssured", "Postman"));
        ArrayList<String> requirements2 =new ArrayList<String>(Arrays.asList("Java", "Selenium", "SQL","Postman", "Cucumber"));

            System.out.println(requirements2.retainAll(skillSet2));
            System.out.println(requirements2);
    }
}
