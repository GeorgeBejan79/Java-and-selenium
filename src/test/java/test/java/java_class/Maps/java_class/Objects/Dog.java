package test.java.java_class.Objects;
public class Dog {
    String name;
    String color;
    int age;
    static int meal = 20;

    public void eat(){
        meal=meal-1;

        System.out.println(name+" is eating. Leftover is kg "+meal);
    }
    public static void barking(){

        System.out.println("Dog is barking");
    }
}
