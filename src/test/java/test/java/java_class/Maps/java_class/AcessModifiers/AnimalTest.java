package test.java.java_class.AcessModifiers;

public class AnimalTest {
    public static void main(String[] args) {
    Animal animal=new Animal();
            System.out.println(animal.name);
            System.out.println(animal.age);
            System.out.println(animal.age);
            System.out.println(animal.color);
        animal.run();
        animal.eat();
        animal.walk();
    }
}