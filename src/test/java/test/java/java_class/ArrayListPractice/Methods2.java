package test.java.java_class.ArrayListPractice;
import java.util.ArrayList;
import java.util.List;

public class Methods2 {
    public static void main(String[] args) {
        List<String> animals =new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");/// adds animals to the arrayList
        animals.add("Dog");
        //animls.set(4, "Bird")--> it will trow an exeption since we don't have index of 4
            System.out.println(animals);
            System.out.println(animals.isEmpty());// false
            System.out.println(animals.contains("Lion"));//true
            System.out.println(animals.contains("Dog"));//true
            System.out.println(animals.contains("cat")); //false bc java is case sensitive

        animals.clear();// it will remove all the elements from the arrayList
        System.out.println(animals.isEmpty());//true

        ArrayList<String> animals1 =new ArrayList<>();
        animals1.add("Dog");
        animals1.add("Cat");
        System.out.println(animals1);
        System.out.println("Result: "+animals.equals(animals1));
    }
}
