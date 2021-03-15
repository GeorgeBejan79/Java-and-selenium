package test.java.java_class.Blocks;

import test.java.java_class.AcessModifiers.Animal;

public class AnimalTest extends Animal { //inheritance

    public static void main(String[] args) {
        Animal animal=new Animal();
        System.out.println(animal.name);
        //System.out.println(animal.age);
        animal.run();
        //animal.eat(); //default accesses modifier
        //animal.sleep();
                animal.walk(); //protected
    }
}
