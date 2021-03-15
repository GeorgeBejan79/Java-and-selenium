package test.java.java_class.ArrayListPractice;
import java.util.ArrayList;
public class Methods {
    public static void main(String[] args) {

        ArrayList items= new ArrayList();
        items.add("apple");
        items.add("apple");
        items.add(Boolean.TRUE);
        items.add(false);
        ArrayList<String> cities =new ArrayList<>();
        cities.add("Chicago");
        cities.add("Denver");
        cities.add("New York");
        cities.add("Chicago");
        cities.add("Denver");
        System.out.println(cities);
        ArrayListIntro.print(cities);

        cities.remove("Chicago");  //removes first Chicago from arrayList
        cities.remove(3); //removes city a index of 3

            System.out.println(cities); //prints remaining cities from the arrayList
            System.out.println(cities.remove(1));
            System.out.println(cities);
            System.out.println(cities.remove("Chicago"));
            System.out.println(cities);
            cities.remove("Houston");
            //cities.remove(4); IOBE index outofboundsexeption

    }
}
