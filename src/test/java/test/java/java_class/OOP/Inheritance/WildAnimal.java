package test.java.java_class.OOP.Inheritance;

public class WildAnimal extends Animal{
        //speak is not overriding from the parent class. it is new method for Wild animals
    public void speak(){
        System.out.println("Wild animal is speaking");
    }
    @Override
    public void run(){
        System.out.println("Wild animal is running.");
    }
    public static void main(String[] args) {

        WildAnimal wAnimal=new WildAnimal();
        wAnimal.eat();
        wAnimal.speak();
        wAnimal.run();
       // wAnimal.speak(); // we cant use the feature and inherit features from siblings
        //speak() --> method is available only for Domestic Animals
        Animal animal =new Animal();
        animal.eat();
    }
}
